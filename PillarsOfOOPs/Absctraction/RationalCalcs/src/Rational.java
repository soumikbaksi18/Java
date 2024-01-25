public class Rational {

    public static void main(String[] args) {
        Rational x, y, z;

        x = new Number(2, 4);
        y = new Number(3, 9);

        z = x.gcd(y);
        System.out.println("Addition=" + z);

//        z = x.multiply(y);
//        System.out.println("Multiplication=" + z);
//
//        z = x.substract(y);
//        System.out.println("Substraction=" + z);
//
//        z = x.divide(y);
//        System.out.println("Divide=" + z);

    }

}
