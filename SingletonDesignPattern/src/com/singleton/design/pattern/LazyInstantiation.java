package com.singleton.design.pattern;

/*
* Not thread safe .. Output will be
*
* Object is created 1
* Object is created 4
* Object is created 3
* Object is created 2
*
* */
class Singleton{
    // Creates single copy and shared among all the objectsat the class level
    private static Singleton obj;
    // Prevents instantiaton of class
    private Singleton(int x){
        System.out.println("Object is created " + x);
    }
    // To access it without instanting the class
    public static Singleton getInstance(int x){
        if(obj == null){
            obj=new Singleton(x);
        }
        return obj;
    }
}
class ThreadImplementation extends Thread{
    public static int x=1;
    public void run(){
        Singleton.getInstance(x++);
    }
}
public class LazyInstantiation {

    public static void main(String[] args) {
        ThreadImplementation t1=new ThreadImplementation();
        ThreadImplementation t2=new ThreadImplementation();
        ThreadImplementation t3=new ThreadImplementation();
        ThreadImplementation t4=new ThreadImplementation();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
