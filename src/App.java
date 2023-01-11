import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> Array1 = new ArrayList<>();
        List<String> Array2 = new ArrayList<>();
        List<String> Equals = new ArrayList<>();

        Array1.add("A");
        Array1.add("B");
        Array1.add("C");
        Array1.add("D");

        Array2.add("C");
        Array2.add("D");
        Array2.add("E");
        Array2.add("F");

        for (int i = 0; i < Array1.size(); i++) {
            if (Array2.contains(Array1.get(i))) {
                Equals.add(Array1.get(i));
            }
        }

        for (int i = 0; i < Equals.size(); i++) {
            System.out.println(Equals.get(i));
        }
    }
}
