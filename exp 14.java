import java.util.Scanner;
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
System.out.println("Sum of two integers: "
                + obj.add(a, b));
System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
System.out.println("Sum of three integers: "
                + obj.add(x, y, z));
System.out.print("Enter two decimal numbers: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
System.out.println("Sum of two double values: "
                + obj.add(p, q));
sc.close();
    }
}





OUTPUT:

Enter two integers: 10 20
Sum of two integers: 30

Enter three integers: 10 20 30
Sum of three integers: 60

Enter two decimal numbers: 10.5 20.5
Sum of two double values: 31.0


