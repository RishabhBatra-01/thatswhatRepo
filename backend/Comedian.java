/**
 * MethodOverloading
 */package backend;
public class Comedian {

   
    public void tellJoke(String joke) {
        System.out.println(joke);
    }

    
    public void tellJoke(String joke, String punchline) {
        System.out.println(" joke: " + joke);
        System.out.println("Delivering the punchline: " + punchline);
    }

  
    public void tellJoke(int numberOfLaughs) {
        System.out.println("HAHAHAHA" + numberOfLaughs);
    }

    public static void main(String[] args) {
        Comedian joker = new Comedian();

        
        
        // joker.tellJoke("He was a good PM");
        
      
        // joker.tellJoke("He was a good PM", "Vo to hmare jaise hein");

       
        // joker.tellJoke(300000);
    }
}
