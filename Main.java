import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> yay = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop ");  
    
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      yay.add(input);
    }

    System.out.println("Size: " + yay.size());
    System.out.println(yay);
    
    if (yay.size() > 2)
    {
      String add = yay.get(0);
      yay.remove(0);
      yay.remove(yay.size()-1);
      yay.remove(yay.size()-1);
      yay.add(add);
      System.out.println(yay);
    }
  }
}
