package edu.cnm.deepdive;

public class MethodChaining {

  public static void main(String[] args) {
    String start = "  Java  ";
    String trim = start.trim();
    System.out.println("trimmed = " + trim);

    String lowerCase = trim.toLowerCase();
    System.out.println("to lower case = " + lowerCase);

    String result = lowerCase.replace('j', 'J');
    System.out.println("result = " + result);

    //Method chaining below:
    String anotherResult = start.trim().toLowerCase().replace('j', 'J');
    System.out.println("\nMethod chaining = " + anotherResult);
    System.out.println("result is equal to anotherResult: " + result.equals(anotherResult));

    String a = "abc";
    String b = a.toUpperCase(); //produces a new String and doesn't change the a variable.
    String c = b.replace('B', 'b').replace('C', 'c');//produces a new String.
    System.out.println("\na = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    if (a.equalsIgnoreCase(b)) {
      System.out.println("Strings are equal");// will be printed.
    }

    if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
      System.out.println("equal");//will be printed.
    }
  }
}
