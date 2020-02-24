package com.company;

import java.io.*;

public class SaveRead {

    public boolean serialization(Book[] books) {
        boolean flag = false;
        File file = new File("D:\\QA\\Java\\epam2\\book.data");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(books);
                flag = true;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }


    public Book deserialization() throws IOException {
        File file = new File("D:\\QA\\Java\\epam2\\book.data");
        ObjectInputStream ois = null;


        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Book Books = (Book) ois.readObject();
                return Books;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new InvalidObjectException("Object failed");
        }
    }
}
