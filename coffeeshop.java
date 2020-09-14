import java.util.*;
public class coffeeshop {
  public static void main(String[] args) {
    System.out.println("Welcome to the Kaylah's Coffee Shop");

    System.out.println("What is the name for the order?");
    Scanner inp = new Scanner(System.in);
    String name = inp.next();

    Scanner inp2 = new Scanner(System.in);
    String order = inp2.next();

    if (order.equals("3")){
      order = "Latte";
}
  if (order.equals("2")){
    order = "Iced Coffee";
}
    if (order.equals("1")){
      order = "Black Coffee";
    }
    System.out.println("What, " + name + ", you ordered a " + order );
  }
}
