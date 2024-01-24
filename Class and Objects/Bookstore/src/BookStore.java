public class BookStore {
    public static void main(String[] args){

        Book book1 = new Book();
        book1.title =  "Alchemist";
        book1.author = "Soumik";
        book1.pub = 2002;
        book1.price = 96.69;

        Book book2 = new Book();
        book2.title =  "Chemist ";
        book2.author = "Rahul";
        book2.pub = 2002;
        book2.price = 96.69;

        book1.displayInfo();
        book2.displayInfo();

    }
}
