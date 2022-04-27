package com.iad.eserciziomovimenti.pattern;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}
