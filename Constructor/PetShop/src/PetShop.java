public class PetShop {
    public static void main(String[]args){
         Animal ani1 = new Animal("Cat","orange",4,99.99);
         Animal ani2 = new Animal("Dog","white",4,89.99);
         Animal ani3 = new Animal ("Parrot","green",2,69.99);

        ani1.displayIt();
        ani2.displayIt();
        ani3.displayIt();
    }
}
