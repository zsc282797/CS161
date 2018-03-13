import java.lang.Math.*;
public class Karatsuba {

    public static int multiply(int x, int y,int n){
        if (n==1) {        //if a is a single digit number
            return x*y;                     //Or we can check if n == 1
        }
        else {
            int a = x / (int)( Math.pow (10, n/2 )); // We kind assumed it can be divided by 100 nicely
            int b = x % (int)( Math.pow (10, n/2 )) ;
            int c = y / (int)( Math.pow (10, n/2 ));
            int d = y % (int)( Math.pow (10, n/2 ));
            System.out.println("Step: a= " + a + " b= "+b + " c= " + c + " d= " + d );
            int ac =  multiply(a,c,n/2);
            int bd = multiply(b,d,n/2);

            return  (int)(Math.pow(10,n))*  ac
                    + (int)(Math.pow(10, n/2 )) * ( multiply( (a+b),(c+d),n/2 ) - ac - bd)
                    +  bd;
        }

        //return 0;
    }
}
