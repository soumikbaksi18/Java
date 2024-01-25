public class Menu {

    String starter;
    String course;
    String desert;
    double price;

    Menu(String starters, String courses, String deserts, double prices){
        this.starter = starters;
        this.course = courses;
        this.desert = deserts;
        this.price = prices;
    }

    Menu(){

    }

    void displayIt(){
        System.out.println(starter+" "+course+" "+desert+" "+price);
    }

}