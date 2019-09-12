import java.io.*; import java.util.*;

/*
  A slightly cleaner and more compact version of the last one
*/

public class Name
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String name = "";
    String bi = "", octa = "", hex = "", pname = "";

    System.out.print("Enter name (-1 to quit): ");
    name = in.nextLine();

    while (!name.equals("-1")) {
      bi = octa = hex = pname = "";

      System.out.println();
      for (int i = 0; i < name.length(); i++)
      {
        int x = (int)name.charAt(i);
        if (name.charAt(i) == ' ')
        {
          bi += "\t";
          octa += "\t";
          hex += "\t";
          pname += "\t";
        }
        else
        {
          pname += "   " + name.charAt(i) + "\t";
          bi += Integer.toBinaryString(x) + "\t";
          octa += Integer.toOctalString(x) + "\t";
          hex += Integer.toHexString(x) + "\t";
        }
      }

      System.out.println();
      System.out.println("  Name: " + pname);
      System.out.println("Binary: " + bi);
      System.out.println(" Octal: " + octa);
      System.out.println("  Hexa: " + hex);

      System.out.println("\n");

      System.out.print("Enter name (-1 to quit): ");
      name = in.nextLine();
    }
  }
}
