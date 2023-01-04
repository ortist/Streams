import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> list = new ArrayList<>(intList);
        list.removeIf(e -> e <= 0);         // оставим только положительные
        list.removeIf(e -> e % 2 == 1);     // оставим только четные
        Collections.sort(list);             // отсортируем по возрастанию
        System.out.println(Arrays.toString(list.toArray()));    // выведем в консоль
    }
}
