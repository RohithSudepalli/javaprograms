import java.util.*;
class Towerofhanoi
{
  static int toh(int n,int A,int B,int C)
  {
    if(n>0)
     {
       toh(n-1,A,C,B);
       System.out.println("move the disc from"+A+"to"+C);
       toh(n-1,B,A,C);
     }
   }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int n,A,B,C;
   System.out.println("enter number of discs");
   n=sc.nextInt();
   
  }
}