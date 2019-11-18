import java.util.ArrayList;

public class test {
    static ArrayList<Integer> a = new ArrayList<>();
    static void removed () {
        a.remove(0);
    }
    public static void main (String[] args) {

        a.add(1);
        a.add(2);
        System.out.println(a.size());
        removed();
        System.out.println(a.size());
    }
}
