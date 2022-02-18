import java.util.Scanner;

public class UniversalAreaCalculation {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UniversalAreaCalculation area = new UniversalAreaCalculation();
        area.choose();
    }

    public char choose() {
        System.out.print("Введите цифру того, что вам известно:\n0 - радиус\n1 - диаметр\n2 - длина окружности\nВведите цифру: ");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case '0':
                System.out.print("\nВведите радиус в мм: ");
                radius();
                break;
            case '1':
                System.out.print("\nВведите диаметр в мм: ");
                diameter();
                break;
            case '2':
                System.out.print("\nВведите длину окружносит в мм: ");
                circle();
                break;
            default:
                System.out.println("\nОшибка! Попробуйте еще.\n");
                ch = choose();
        }
        return ch;
    }

    public void radius() {
        double r = scanner.nextDouble() / 10;
        double s = Math.PI * (Math.pow(r,2));
        System.out.println("Площадь круга = " + s + " см в кв.");
    }

    public void diameter() {
        double d = scanner.nextDouble() / 10 / 2;
        double s = Math.PI * (Math.pow(d,2));
        System.out.println("Площадь круга = " + s + " см в кв.");
    }

    public void circle() {
        double c = scanner.nextDouble() / 10;
        double s = Math.pow(c, 2) / (4 * Math.PI);
        System.out.println("Площадь круга = " + s + " см в кв.");
    }
}

