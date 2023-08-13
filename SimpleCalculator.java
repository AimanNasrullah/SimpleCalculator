import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {

    double num1=0.0;
    double num2=0.0;
    double total=0.0;
    char op='y';
    
    while(op != 'z'){
      Scanner in = new Scanner(System.in);

      System.out.print("\nEnter first number: ");
      num1 = in.nextDouble();
      System.out.print("Enter Second Number: ");
      num2 = in.nextDouble();
      System.out.print("Enter the operator: (+,-,*,/,%): ");
      op = in.next().charAt(0); // Read a single character

      switch (op) {
        case '+': 
          total=num1 + num2;
          System.out.println("\n"+num1+" + "+num2+" = "+total);
          break;
        case '-':
          total=num1 - num2;
          System.out.println("\n"+num1+" - "+num2+" = "+total);
          break;
        case '*':
          total=num1 * num2;
          System.out.println("\n"+num1+" * "+num2+" = "+total);
          break;
        case '/':
          total=num1 / num2;
          System.out.println("\n"+num1+" / "+num2+" = "+total);
          break;
        case '%':
          total=num1 % num2;
          System.out.println("\n"+num1+" % "+num2+" is "+total+"(remainder)");
          break;
      }
      System.out.println("\nDo you want to do another calculation?");
      System.out.println("(Press y to continue, Press z to stop)");
      op = in.next().charAt(0); // Read a single character
    }
  }
}
