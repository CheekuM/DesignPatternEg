package com.singleton.design.pattern;

class SingletonExample{
    private static SingletonExample obj=new SingletonExample(1);
    private SingletonExample(int x){
        System.out.println("Object created with id : "+ x++);
    }
    public static SingletonExample getInstance(){
        return obj;
    }
}
class ThreadImplementationExample extends Thread{
    public static int x=1;
    public void run(){
        SingletonExample.getInstance();
    }
}

public class EagerInstantiation {
    public static void main(String[] args) {

        ThreadImplementationExample t1=new ThreadImplementationExample();
        ThreadImplementationExample t2=new ThreadImplementationExample();
        ThreadImplementationExample t3=new ThreadImplementationExample();
        ThreadImplementationExample t4=new ThreadImplementationExample();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
