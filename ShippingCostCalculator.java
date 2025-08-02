import java.util.Scanner;

public class ShippingCostCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Input package weight
    System.out.println("Enter the package weight in kilograms: ");
    float weight = scanner.nextInt();
    scanner.nextLine();

    //Input shipping rate
    System.out.println("Enter the package weight in kilograms: ");
    float rate = scanner.nextInt();
    scanner.nextLine();

    float shippingCost = weight * rate;

    System.out.println("Shipping Cost: $" + shippingCost);
  }
}
