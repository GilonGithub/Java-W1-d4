
public class MileToKilometerTable {
    
    public static void main(String[] args) {

        System.out.println("Miles \t Kilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " \t " + ((double)(i) * 1.609344));
        }
    }
}
