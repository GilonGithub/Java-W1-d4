public class MultiplicationTable {
    
    public static void main(String[] args) {

        System.out.println("\t\t\tMultiplication Table");

        for(int row = 1; row <= 9; row++) {
            System.out.print("\t" + row);
        }
            System.out.println("\n--------------------------------------------------------------------------");
        for(int multiplier = 1; multiplier <= 9; multiplier++) {
            System.out.print(multiplier + " | ");
            for(int i = 1; i <= 9; i++) {
                System.out.print("\t" + i * multiplier);
            }
            System.out.println("");
        }
    }
    
}
