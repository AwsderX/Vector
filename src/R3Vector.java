import java.util.Scanner;

public class R3Vector {
    private int x,y,z;
    public R3Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector(){
        x = 0;
        y = 0;
        z = 0;
    }

    public static R3Vector summa(R3Vector a, R3Vector b){
        R3Vector summa = new R3Vector();
        summa.x = a.x+b.x;
        summa.y = a.y+b.y;
        summa.z = a.z+b.z;
        printvector(summa);
        return summa;
    }
    public static R3Vector raznost(R3Vector a, R3Vector b){
        R3Vector raznost = new R3Vector();
        raznost.x = a.x-b.x;
        raznost.y = a.y-b.y;
        raznost.z = a.z-b.z;
        printvector(raznost);
        return raznost;
    }
    public static R3Vector multiplication(int multiplie, R3Vector a, R3Vector b) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, на какое целое число вы хотите умножить вектор");
        multiplie = in.nextInt();
        R3Vector multiplication = new R3Vector();
        multiplication.x = a.x * multiplie;
        multiplication.y = a.y * multiplie;
        multiplication.z = a.z * multiplie;
        printvector(multiplication);
        return multiplication;
    }
    public static void skalyarmultiplication(R3Vector a, R3Vector b){
        System.out.println(a.x*b.x+a.y*b.y+a.z*b.z);
    }
    public static R3Vector vectormultiplication(R3Vector a, R3Vector b){
        R3Vector vectormultiplication = new R3Vector();
        vectormultiplication.x = a.y*b.z-a.z*b.y;
        vectormultiplication.y = a.z*b.x-a.x*b.z;
        vectormultiplication.z = a.x*b.y-a.y*b.x;
        printvector(vectormultiplication);
        return vectormultiplication;
    }
    public static void printvector(R3Vector a){
        System.out.println("{" + a.x + ", " + a.y + ", " + a.z + "}");
    }
}