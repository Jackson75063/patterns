package com.developer;

class SomeThing implements Runnable	{
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}

public class Program {
    static SomeThing mThing;
    public static void main(String[] args) {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
        myThready.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
