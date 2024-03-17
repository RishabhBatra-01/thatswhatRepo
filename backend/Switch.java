package backend;import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String perfromBeltAction;
        boolean continueLoop = true;
        System.out.print("Enter the action (A/B/C/D) or type 'quit' to exit: ");

        while (continueLoop) {
            
            perfromBeltAction = scanner.next();

            switch (perfromBeltAction.toUpperCase()) {
                case "A":
                    System.out.println("Belt Nikalegi");
                    break;
                case "B":
                    System.out.println("Galein Mein Bandhegi");  
                    break;
                case "C":
                    System.out.println("Muh mein Belt hold kregi");
                    break;
                case "D":
                    System.out.println("Hatho uper kr kein belt bandlegi");   
                    break; 
                case "QUIT":
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Surpriseeee!!!!");  
                    break;
            }
        }      
        scanner.close();
    }
}
