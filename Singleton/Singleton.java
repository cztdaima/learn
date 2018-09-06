package Singleton;


public class  Singleton{

    public static void main(String[] args) {

        System.out.println("SingletonDemo"+SingletonDemo.INSTANCE);
        System.out.println("SingletonDemo"+SingletonDemo.INSTANCE);
        SingletonDemo.INSTANCE.saySomthing("SingletonDemo");
    }

}