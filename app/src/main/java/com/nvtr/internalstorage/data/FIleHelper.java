package com.nvtr.internalstorage.data;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FIleHelper {

    public static <T> ArrayList<T> docra(Context context){
        FileInputStream inputStream = null;
        String fileName = "SinhVien.txt";
        ArrayList list= new ArrayList<>();
        try{
            inputStream = context.openFileInput(fileName);
            ObjectInputStream o=new ObjectInputStream(inputStream);
            list=(ArrayList<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }

    public static <T> void viet(ArrayList<T> arr, Context context){
        FileOutputStream outputStream = null;
        String fileName = "SinhVien.txt";

        try{
            outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream o=new
                    ObjectOutputStream(outputStream);
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }


    public static <T> ArrayList<T> docraphonghoc(Context context){
        FileInputStream inputStream = null;
        String fileName = "Phong.txt";
        ArrayList list= new ArrayList<>();
        try{
            inputStream = context.openFileInput(fileName);
            ObjectInputStream o=new ObjectInputStream(inputStream);
            list=(ArrayList<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }

    public static <T> void vietvaophonghoc(ArrayList<T> arr, Context context){
        FileOutputStream outputStream = null;
        String fileName = "Phong.txt";
        try{
            outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream o=new
                    ObjectOutputStream(outputStream);
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static <T> ArrayList<T> docrasvtheop(Context context){
        FileInputStream inputStream = null;
        String fileName = "Phong.txt";
        ArrayList list= new ArrayList<>();
        try{
            inputStream = context.openFileInput(fileName);
            ObjectInputStream o=new ObjectInputStream(inputStream);
            list=(ArrayList<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }

    public static <T> void vietvaosvtheop(ArrayList<T> arr, Context context){
        FileOutputStream outputStream = null;
        String fileName = "Phong.txt";
        try{
            outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream o=new
                    ObjectOutputStream(outputStream);
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }


}

