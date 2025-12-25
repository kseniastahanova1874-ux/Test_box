import java.io.File;
import java.util.Scanner;

public class task4 {
    
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            
            int[] numbers = new int[100]; 
            int size = 0;
            
            while (scanner.hasNextInt()) {
                numbers[size] = scanner.nextInt();
                size++;
            }
            scanner.close();

            int min = numbers[0];
            int max = numbers[0];
            
            for (int i = 0; i < size; i++) {
                if (numbers[i] < min) {min = numbers[i];}
                if (numbers[i] > max) {max = numbers[i];}
            }



            int result = 999999;
            
            for (int target = min; target <= max; target++) {
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    int diff = numbers[i] - target;
                    if (diff < 0) {
                        diff = -diff;
                    }
                    sum = sum + diff;
                }
                if (sum < result) { result = sum;}}
            

            if (result > 20) {System.out.println("20 ходов недостаточно для приведения всех элементов массива к одному числу");} 
            else {System.out.println(result);}
            
        } catch (Exception e) {System.out.println("Ошибка");}
    }
}
