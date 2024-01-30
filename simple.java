import java.io.Console;
import java.util.Scanner;

public class simple{

    public static void main(String[] args) {
            
            Console c=System.console();
            System.out.println("Entre First Number");
            int num1=Integer.parseInt(c.readLine());
            System.out.println("Entre First Number");
            int num2=Integer.parseInt(c.readLine());


            while(true){
            System.out.println("Simple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");
            
            System.out.print("Enter choice (1/2/3/4/5): ");
             int choice =Integer.parseInt(c.readLine());
             if (choice == 5) {
                System.out.println("Exiting the calculator.!");
                break;
            }

            

             switch (choice) {
                case 1:
               int  add= num1+num2 ;
                System.out.println(num1 + " + " + num2 + " = " +add );
                // add(num1, num2));
                break;
                
            case 2:
                 int sub= num1-num2 ;
                System.out.println(num1 + " - " + num2 + " = " +sub);
                break;
            case 3:
               int  mul= num1*num2 ;
                System.out.println(num1 + " * " + num2 + " = " + mul);
                break;
            case 4:
               
                   if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
                } else {
                      System.out.println("Cannot divide by zero");
                    // Indicate division by zero
                }

                break;
                default:
                System.out.println("Invalid Input. Please enter a valid option.");

             }


            }   
}
}
