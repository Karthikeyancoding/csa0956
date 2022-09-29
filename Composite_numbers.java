import java.util.*;
public class Composite_numbers
{
static Scanner input = new Scanner(System.in);
public static void main(String[] args) 
{
System.out.print("Enter the starting number:");
int start = input.nextInt()+1;
System.out.print("Enter the ending number:");
int end = input.nextInt();
while(start<=end)
{
   int count = 0;
   int j = 2;
while(j<start)
{
   if(start%j==0)
   count++;
   j++;
}
   if(count>0)
   System.out.println(start);
   start++;
}
}
}
