import java.util.Scanner;
import static java.lang.Math.floor;
public class Main {

    public static double perfectSquare(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double sqrt = Math.sqrt(i);

        if(floor(sqrt) == sqrt) {
            sqrt=sqrt+1;
            return sqrt*sqrt;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.print(perfectSquare());
    }
}
