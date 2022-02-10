package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        synchronized (MyThread){
            myThread.start();
        }
        MyThread myThread2= new MyThread();
        myThread2.start();


    }
}

class MyThread extends Thread  {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){

            }

            System.out.println("Hello MyThread" + i);
        }
    }
}

