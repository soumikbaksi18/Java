public class Main {
    public static void main(String[] args) {

        Cream ob = new Cream();

        int res1 = ob.ice(4,5);
        System.out.println(res1);

        double res2 = ob.ice(4.5,5.5);
        System.out.println(res2);

        String res3 = ob.ice("Ice","Cream");
        System.out.println(res3);

        int res4 = ob.ice(4,5,6);
        System.out.println(res4);

    }
}