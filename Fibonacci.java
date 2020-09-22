
package fibonacci;

public class Fibonacci{
    static long F[] = new long[100];
    public static void main(String[] args) {
        for (int i = 0; i < F.length; i++) {
            F[i]=-1;
        }
       System.out.println(fibDynamic(55));
    }
    public static long fib(int n){
        if(n==0 || n==1) 
            return n;
        else
            return fib(n-1)+fib(n-2);
    
    }
    public static long fibDynamic(int n){
        if(n==0 || n==1) 
            return n;
        else if(F[n]!=-1)
            return F[n];
        else{
            F[n]=fibDynamic(n-1)+fibDynamic(n-2);
            return F[n];
        }
    }
    
}
