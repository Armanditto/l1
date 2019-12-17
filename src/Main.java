import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        car japan = new Japan("Toyota", "L");
        car france = new France("Peugeot", "S");
        car usa = new USA("Chevrolet", "D");

        List<car> cars = Arrays.asList(japan,france,usa);
        for (car car : cars) {
            car.info();
        }
    }
}