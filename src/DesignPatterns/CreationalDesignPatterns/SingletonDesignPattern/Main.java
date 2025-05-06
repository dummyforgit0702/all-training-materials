package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        // This will show an error
        // ConfigurationManager c1= new ConfigurationManager();
        ConfigurationManager c1= ConfigurationManager.getInstance();
        ConfigurationManager c2= ConfigurationManager.getInstance();
        c1.printConfig();
        System.out.println(c1==c2);
    }
}
