public class R3Vector {

    public static void main(String[] args) {
        /**Число**/
        double k = 4;
        /**Первый вектор**/
        double x1 = 4;
        double y1 = 5;
        double z1 = 6;
        /**Второй вектор**/
        double x2 = 1;
        double y2 = 2;
        double z2 = 3;
        /**Сложение**/
        double PlusX = x1 + x2;
        double PlusY = y1 + y2;
        double PlusZ = z1 + z2;
        /**Вычитание**/
        double MinusX = x1 - x2;
        double MinusY = y1 - y2;
        double MinusZ = z1 - z2;
        /**Умножение на число**/
        double YmnoshenieX = x1 * k;
        double YmnoshenieY = y1 * k;
        double YmnoshenieZ = z1 * k;
        /**Умножение на число**/
        double ScalarX = x1 * x2;
        double ScalarY = y1 * y2;
        double ScalarZ = z1 * z2;
        /**Умножение на число**/
        double SmeshanoeX = x1 * z2 - z1 * y2;
        double SmeshanoeY = z1 * x2 - x1 * z2;
        double SmeshanoeZ = x1 * y2 - y1 * x2;

        System.out.println(PlusX + " " + PlusY + " " + PlusZ);
        System.out.println(MinusX + " " + MinusY + " " + MinusZ);
        System.out.println(YmnoshenieX + " " + YmnoshenieY + " " + YmnoshenieZ);
        System.out.println(ScalarX + " " + ScalarY + " " + ScalarZ);
        System.out.println(SmeshanoeX + " " + SmeshanoeY + " " + SmeshanoeZ);
    }
}
