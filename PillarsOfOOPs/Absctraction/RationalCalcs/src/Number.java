public class Number {

    private int numerator;
    private int denominator;

    public int getNumerator(){
        return  numerator;
    }

    public int getDenominator(){
        return  denominator;
    }

    public Number(int num,int den){
        if(den == 0){
           throw new ArithmeticException("Cannot divide by 0");
        }

        int g = gcd(num,den);
        numerator = num/g;
        denominator = den/g;

        if(denominator<0)
        {
           denominator = - denominator;
           numerator = - numerator;
         }
        }

        private int gcd(int a,int b)
        {
              if(b==0)
              return a;
              else
              return gcd(b,a%b);
        }

        public int lcm(int c, int d)
        {
            return c* (d /  gcd(d,c%d));
         }
}
