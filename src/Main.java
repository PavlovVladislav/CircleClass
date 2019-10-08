public class Main {

    public static void main(String[] args) {

        System.out.println("Вычисление с вызовом конструктора без параметров\n");

        Circle CFirst = new Circle();
        System.out.println("Значение периметра Первого круга = " + CFirst.Perimetr());
        System.out.println("Значение площади Первого круга = " + CFirst.Square());

        System.out.println("\nВычисление с вызовом конструктора с параметром\n");

        Circle CSecond = new Circle(5);
        System.out.println("Значение периметра Второго круга = " + CSecond.Perimetr());
        System.out.println("Значение площади Второго круга = " + CSecond.Square());

    }
}
