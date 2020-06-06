
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println(new B().get());
    }
}
class B {
    boolean get() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            System.out.println("B");
            return false;
        }
    }
}
