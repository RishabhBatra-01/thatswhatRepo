package backend;

 abstract  class  Animal{

    public abstract void sound();
}

class dog extends Animal{

    @Override
    public void sound() {
    System.out.println("Bhoww bhoww");
        
    }

}
class cat extends Animal{

    @Override
    public void sound() {
       System.out.println("Meow");
        
    }
    
}

public class abstraction {
    public static void main(String[] args) {
        
   
        Animal obj = new cat();
        obj.sound();


    }
}
