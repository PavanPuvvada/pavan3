package assignment1;

public class UncheckedException {
int a = 5;

public void divide() {
  try {
    int result = a/0;
    System.out.println(result);
  }
  catch(ArithmeticException e) {
    System.out.println("Division by 0 is not allowed");
  }
  System.out.println("Divide method executed");
}
public static void main(String[] args) {
  UncheckedException uce = new UncheckedException();
  uce.divide();
}
}
