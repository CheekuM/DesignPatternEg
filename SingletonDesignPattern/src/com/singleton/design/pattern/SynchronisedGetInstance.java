package com.singleton.design.pattern;
//It is thread safe, but it is expensive and descreased performance
class Singleton1{
    // Creates single copy and shared among all the objectsat the class level
    private static Singleton1 obj;
    // Prevents instantiaton of class
    private Singleton1(int x){
        System.out.println("Object is created " + x);
    }
    // To access it without instanting the class
    public static synchronized Singleton1 getInstance(int x){
        if(obj == null){
            obj=new Singleton1(x);
        }
        return obj;
    }
}
class ThreadImplementation1 extends Thread{
    public static int x=1;
    public void run(){
        Singleton1.getInstance(x++);
    }
}
public class SynchronisedGetInstance {
    public static void main(String[] args) {
        ThreadImplementation1 t1=new ThreadImplementation1();
        ThreadImplementation1 t2=new ThreadImplementation1();
        ThreadImplementation1 t3=new ThreadImplementation1();
        ThreadImplementation1 t4=new ThreadImplementation1();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
