import java.io.File;
import java.util.Scanner;

public class task3 {
    
    public static void main(String[] args) {
        
        try {
            File file1 = new File(args[0]);
            Scanner scanner1 = new Scanner(file1);
            
            double x1 = scanner1.nextDouble();
            double y1 = scanner1.nextDouble();
            double r = scanner1.nextDouble();
            scanner1.close();
            
            File file2 = new File(args[1]);
            Scanner scanner2 = new Scanner(file2);
            
            while (scanner2.hasNextDouble()) {
                double x = scanner2.nextDouble();
                double y = scanner2.nextDouble();
                
                double dx = x - x1;
                double dy = y - y1;
                
                double distance = dx * dx + dy * dy;
                double radius = r * r;
                
                if (distance < radius) {
                    System.out.println(1);
                } else if (distance == radius) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
            scanner2.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
