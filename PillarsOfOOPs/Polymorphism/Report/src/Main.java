public class Main {
    public static void main(String[] args) {

        TextReport report1 = new TextReport("Report.txt");
        report1.generateReport();

        HtmlReport report2 =  new HtmlReport("Report.html");
        report2.generateReport();

}
}