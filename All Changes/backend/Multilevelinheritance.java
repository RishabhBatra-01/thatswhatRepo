package backend;

class Parent{

    public void run(){
        System.out.println("I am a parent");
    }
}

class childClass extends Parent{

    public void run2(){
        System.out.println("i am a child class and whant to  behva e like a parent ");
    }

}

class childkichildclass extends childClass{


}

public class Multilevelinheritance {

    public static void main(String[] args) {
        

        childkichildclass obj = new childkichildclass();
        obj.run();
        obj.run2();
    }
    
}