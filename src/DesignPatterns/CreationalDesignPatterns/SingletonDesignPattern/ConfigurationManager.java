package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager(){
        System.out.println("Loading Configurations");
    }
    public static synchronized ConfigurationManager getInstance(){
        if(instance==null){
            instance= new ConfigurationManager();
        }
        return instance;
    }
    public void printConfig(){
        System.out.println("Printing config settings");
    }
}
