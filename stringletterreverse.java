import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 class stringletterreverse
{
public static void main(String[] args)
{
System.out.print("Enter string to reverse:");
Scanner read = new Scanner(System.in);
String str = read.nextLine();
char c[] = str.toCharArray();
Arrays.sort(c);
String k=new String(c);
String reverse = "";
for(int i = k.length() - 1; i >= 0; i--)
{
reverse = reverse +k.charAt(i);
}
System.out.print("Reversed string is:");
System.out.print(reverse);
}
}