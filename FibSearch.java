public class FibSearch
{
   public static void main(String args[])
   {
    int a[]={1,3,15,36,45,67,78,91};
    int key=8;
    int position=fibsearch(a,8,key);
    if(position==-1)
        System.out.println("element not found");
    else
        System.out.println("element found at position "+ position);
   }
   public static int fibsearch(int a[],int n,long key)
   {
      int fib[]={0,1,1,2,3,5,8,13,21,34,55,89,144};
      int initpos=0,position,k;
    if (n==-1)
       return -1;
    k=0;
    while(fib[k]<n)
       k++;
     while(k>0)
     {
        position=initpos+fib[--k];
        if((position>=n)||key<a[position])
        {
           continue;
        } 
        else
        {
          if(a[position]<n)
          {
           initpos=position+1;
           k--;
          }
          else
            return position;
        }
     }
       return -1;
     }
}

    

    
     