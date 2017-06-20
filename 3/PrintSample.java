public class PrintSample {
  public static void main(String args[]) {
    System.out.println(12 + 0);           //12
    System.out.println(12 + "0");         //120
    System.out.println("12" + 0);         //120
    System.out.println("12" + "0");       //120
    System.out.println("12" + 3 + 4);     //1234
    System.out.println("12" + (3 + 4));   //127
  }
}
