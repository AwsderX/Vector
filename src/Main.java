import java.util.Scanner;
public class Main {
private static int x, y, z;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int multiplie = 0;
        System.out.println("Введите данные первого вектора");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector a = new R3Vector(x, y, z);
        System.out.println("Введите данные второго вектора");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector b = new R3Vector(x, y, z);
        R3Vector.summa(a, b);
        R3Vector.raznost(a, b);
        R3Vector.multiplication(multiplie, a, b);
        R3Vector.skalyarmultiplication(a, b);
        R3Vector.vectormultiplication(a, b);
    }
}
