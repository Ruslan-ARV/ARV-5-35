import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

//        Task 1 // Создать дв. массив и проин. его числами от 1 до 100

        int[][] array = new int[1][100];

        int count = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }
        System.out.println(Arrays.deepToString(array));

//        Task 2 // Проин. массив 1 в ввиде треугольника

        int[][] triangle = {{1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
            }
        }

        System.out.println(Arrays.deepToString(triangle).replace("], ", "]\n"));

//        Task 3 // Реализовать удобный вывод тругольника без 0

        int [][] trian = {{1}, {1, 1}, {1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1, 1}};

        for (int i = 0; i < trian.length; i++) {
          for (int j = 0; j < trian [i].length; j++);
        }
        System.out.println(Arrays.deepToString(trian).replace("], ", "]\n"));
    }
}