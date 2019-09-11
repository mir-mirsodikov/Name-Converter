import java.io.*; import java.util.*;

public class Name
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String name = "";

    System.out.print("Enter name (-1 to quit): ");
    name = in.nextLine();

    while (!name.equals("-1")) {

      System.out.print("\n");
      System.out.print("  Name: ");
      for (int i = 0; i < name.length(); i++)
      {
        if (name.charAt(i) == ' ')
        {
          System.out.print("\t");
          continue;
        }
        else
          System.out.print("   " + name.charAt(i) + "\t");

      }

      System.out.println();

      System.out.print("Binary: ");
      for (int i = 0; i < name.length(); i++)
      {
        int x = (int)name.charAt(i);
        if (name.charAt(i) == ' ')
        {
          System.out.print("\t");
          continue;
        }
        else
          System.out.print(Integer.toBinaryString(x) + "\t");
      }

      System.out.println();

      System.out.print(" Octal: ");
      for (int i = 0; i < name.length(); i++)
      {
        int x = (int)name.charAt(i);
        if (name.charAt(i) == ' ')
        {
          System.out.print("\t");
          continue;
        }
        else
          System.out.print(Integer.toOctalString(x) + "\t");
      }

      System.out.println();

      System.out.print("  Hexa: ");
      for (int i = 0; i < name.length(); i++)
      {
        int x = (int)name.charAt(i);
        if (name.charAt(i) == ' ')
        {
          System.out.print("\t");
          continue;
        }
        else
          System.out.print(Integer.toHexString(x) + "\t");
      }

      System.out.println("\n\n");

      System.out.print("Enter name (-1 to quit): ");
      name = in.nextLine();
    }
  }
}
