public class Calculator {

    public static void main(String[] args) {

        int width = 15; // Ширина прямоугольника

        int length = 20; // Длина прямоугольника

        int height = 9; // Высота параллелограмма

        int side = 41; // Длина параллелограмма

        int rectangle = width * length;

        int parallelogram = height * side;

        System.out.println(rectangle + " Площадь прямоугольника");

        System.out.println(parallelogram + " Площадь параллелограмма");

    }
}