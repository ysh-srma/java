class Person {
  
    void role() {
        System.out.println("I am a person.");
    }
}

class Father extends Person {
  
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}
class son extends Person {
    @Override
    void role() {
        System.out.println("I am a son.");
    }

    
}

public class Main {
    public static void main(String[] args) {
      
        Person p = new son();
        p.role();  
    }
}
