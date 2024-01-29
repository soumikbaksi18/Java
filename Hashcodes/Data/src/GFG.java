import java.lang.reflect.Method;

public class GFG {

    // create a Method name getSampleMethod
    public void soumik() {}

    // create main method
    public static void main(String args[])
    {

        try {

            // create class object for class name GFG
            Class c = GFG.class;

            // get Method object of method name getSampleMethod
            Method method = c.getDeclaredMethod("soumik", null);

            // get hashcode of method object using hashCode() method
            int hashCode = method.hashCode();

            // Print hashCode with method name
            System.out.println("hashCode of method " + method.getName()
                    + " is " + hashCode);
        }
        catch (Exception e) {
            // print if any exception occurs
            e.printStackTrace();
        }
    }
}