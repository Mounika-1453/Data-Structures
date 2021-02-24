import java.util.Scanner;
public class SelectionSort
{
   public static void main (String args[])
   {
    int a[];
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
     
    a=new int[n];
    
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    
    System.out.println("before sorting");
    display(a,n);

    selectionsort(a,n);
    System.out.println("after sorting");
    display(a,n);
   }
   public static void selectionsort(int a[],int n)
   {
     int i,j,min,temp;
     for(i=0;i<n;i++)
     {
       min=i; 
       for(j=i+1;j<n;j++)
       {
          if(a[min]>a[j])
             min=j;
       }
          if(min!=i)
          {
             temp=a[min];
             a[min]=a[i];
             a[i]=temp;
          }
        }
   }
   public static void display(int a[],int n)
    {
      for(int i=0;i<n;i++)
         System.out.print(a[i]+" ");
   }
}
            
        
    