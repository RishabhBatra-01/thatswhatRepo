
package backend;
public class whatisthis {


    String message;

    public whatisthis(String message){
        this.message = message;
    }

    public void print(){
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        
        whatisthis obj = new whatisthis("Duck teri maaa kii");

        obj.print();
       

    }


}
