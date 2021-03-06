
import java.util.Scanner;

public class IntRoman {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= sc.nextInt();
        System.out.println("Roman form of the number is: " + intToRoman(num));
    }
    public static String intToRoman(int num)
    {
        String[] thousands= new String[] {"", "M", "MM", "MMM"};
        String[] hundreds={"", "C", "CC", "CCC", "CD" ,"D", "DC", "DCC", "DCCC", "CM" };
        String[] tens= {"", "X", "XX", "XXX", "XL" ,"L", "LX", "LXX", "LXXX", "XC" };
        String[] units= {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num/1000] + hundreds[(num % 1000)/100] + tens[(num % 100) / 10]+ units[num % 10];
    }
}

