import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("\nNhap 1 so: ");
            sub.setState(scan.nextInt());
        }
    }
}
