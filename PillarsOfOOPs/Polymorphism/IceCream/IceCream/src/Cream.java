public class Cream {

     int ice (int a , int b){
         System.out.println("Integer Version : ");
         return a + b;
     }


    int ice (int a , int b,int c){
        System.out.println("Integer Version : ");
        return a+b+c;
    }

     double ice (double c, double d){
         System.out.println("Double Version");
         return c + d;
     }

     String ice (String a, String b){
         System.out.println("String Version");
         return a + " " + b;

     }

}
