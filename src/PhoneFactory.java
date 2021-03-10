import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneFactory {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Phone phone = Factory.getFactory(key);
            if (phone == null) {
                return;
            }
            System.out.println(phone.getClass().getSimpleName());
        }
    }
}
