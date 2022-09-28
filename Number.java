import java.io.*;
 
class Number{
     
   
static int getMin(int arr[], int n)
{
    int res = arr[0];
    for (int i = 1; i < n; i++)
        res = Math.min(res, arr[i]);
    return res;
}
 

static int getMax(int arr[], int n)
{
    int res = arr[0];
    for (int i = 1; i < n; i++)res = Math.max(res, arr[i]);
    return res;
}
 

static int findSum(int arr[], int n)
{
    int min = getMin(arr, n);
    int max = getMax(arr, n);
 
    return min + max;
}
 

static int finddifference(int arr[], int n)
{
    int min = getMin(arr, n);
    int max = getMax(arr, n);
return min * max;
}
 

     
    public static void main (String[] args) {
    int arr[] = { 12, 1234, 45, 67, 1 };
    int n = arr.length;
 
   
        System.out.println ("Sum = " + findSum(arr, n));
 
   
        System.out.println( "difference = " + finddifference(arr, n));
 
         
         
    }
}
