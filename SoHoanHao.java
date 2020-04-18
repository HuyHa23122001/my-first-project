import java.util.Scanner;

public class SoHoanHao {
   public static boolean SHH(int n) 
   {
	   int s=0;
	   int i;
	   for(i = 1;i < n; i++)
	   {
		   if(n % i==0) {
			   s=s+i;
		   }
		   
	   }
	   if(s==n)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap vao so can kiem tra");
      n=sc.nextInt();
     System.out.println("So da nhap la"+" "+ n);
     System.out.println("Cac so nguyen hoan hao nho hon"+" "+ n +" "+"la");
     for(int i=1;i<n;i++)
     {
    	 if(SHH(i)==true)
    	 {
    		 System.out.println(i);
    	 }
     }
	}

}
