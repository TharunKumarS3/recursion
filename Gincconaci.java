import java.util.Scanner;

public class Gincconaci {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(disp(a,b,c,n));
    }
}
    static int disp(int a,int b,int c, int n)
    {
        if(n==1)
        return a;
        if(n==2)
        return b;
        if(n==3)
        return c;

        return disp(a, b,c,n-1)+disp(a, b, c,n-2)+disp(a, b, c, n-3);



    } 
    
}
