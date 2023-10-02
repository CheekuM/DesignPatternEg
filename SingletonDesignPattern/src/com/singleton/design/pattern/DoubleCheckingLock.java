package com.singleton.design.pattern;

class Singleton2 {
    private static volatile Singleton2 obj = null;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(obj == null){
            synchronized (Singleton2.class){
                if(obj == null){
                    obj =new Singleton2();
                }
            }
        }
        return obj;
    }
}
class ThreadImplementation2 extends Thread{
    public void run(){
        System.out.println("Object created : "+Singleton2.getInstance());

    }

}

public class DoubleCheckingLock {
    public static void main(String[] args) {
        ThreadImplementation2 t1=new ThreadImplementation2();
        ThreadImplementation2 threadImplementation2=new ThreadImplementation2();
        ThreadImplementation2 t3=new ThreadImplementation2();
        ThreadImplementation2 t4=new ThreadImplementation2();
        t1.start();
        threadImplementation2.start();
        t3.start();
        t4.start();
    }
}
