package Singleton;

public enum SingletonDemo {
    INSTANCE;
    
    public static void saySomthing(String str){
        System.out.println("hello"+str);
    }
}