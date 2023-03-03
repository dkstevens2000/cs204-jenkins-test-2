import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
  public static void main(String[] args) throws IOException {

    Calculator myCalc = new Calculator();
    System.out.println("Enter a command: ");

    while (true) {

      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      String[] inputs = input.split(" ");

      if (inputs[0].equals("add")) {
        System.out.println(myCalc.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
      } else if (inputs[0].equals("subtract")) {
        System.out.println(myCalc.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
      } else if (inputs[0].equals("multiply")) {
        System.out.println(myCalc.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
      } else if (inputs[0].equals("divide")) {
        System.out.println(myCalc.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
      } else if (inputs[0].equals("fibonacciNumberFinder")) {
        System.out.println(myCalc.fibonacciNumberFinder(Integer.parseInt(inputs[1])));
      } else if (inputs[0].equals("intToBinaryNumber")) {
        System.out.println(myCalc.intToBinaryNumber(Integer.parseInt(inputs[1])));
      }
    }
  }
}
