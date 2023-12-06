package firstProject;

import java.util.logging.Logger;

public class HelloWorld {
    public String getMessage() {
        return "Hello, World!";
    }
    public static void main(String[] args){
        HelloWorld msg = new HelloWorld();
        msg.getMessage();
        Logger.getLogger("Hello, World.");
        Logger.getLogger("Hello, Java.");
    }
}