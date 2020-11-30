package com.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Methods {
    public static ArrayList<Product> arrProduct = new ArrayList<>();

    public void addNew(Product p) {
        arrProduct.add(p);
    }

    public void updateProduct(Product p) {
        for (Product product : arrProduct) {
            if (p.getId() == p.getId()) {
                product.setName(p.getName());
                product.setMade(p.getMade());
                product.setPrice(p.getPrice());
                product.setDescription(p.getDescription());
            }
        }
    }

    public void showInfo(File file) throws Exception {
//        for (Product p : arrProduct) {
//            System.out.println(toString());
//        }
        readToFile(file);
    }

    public void remove(int id) {
        Product removeProduct = new Product();
        for (Product p : arrProduct) {
            if (p.getId() == id) {
                removeProduct = p;
            }
        }
        arrProduct.remove(removeProduct);
    }


    public void readToFile(File file) throws Exception{

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object object = null;
        ArrayList<Object> listProduct= (ArrayList<Object>) objectInputStream.readObject();
        for (Object obj: listProduct){
            System.out.println(obj);
        }
    }

    public void writeToFile(ArrayList<Product> products) {
        File file = new File("demo.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);



//            String line = null;
//            FileInputStream fileInputStream = new FileInputStream(file);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//            Object object = null;
//            while ((object=objectInputStream.readObject()) != null){
//                Product product = (Product)object;
//                System.out.println(product);
//            }



//            for (Product p : products) {
//                p = (Product) o.readObject();
//            }
////            do {
////                p = o.readObject();
////            }while ( p != null)
////            Product p = (Product) o.readObject();
//            while ((line = p) != null) {
//                System.out.println(line);
//            }
//            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
