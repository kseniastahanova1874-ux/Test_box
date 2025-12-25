public class task1 {
    public static void main(String[] args) {
     int n1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        int m2 = Integer.parseInt(args[3]);
        
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = (i % n1) + 1;
        }
        
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = (i % n2) + 1;
        }
        
        String path1 = "";
        int pos1 = 0;
        int start1 = 0;
        
        while (true) {
            path1 = path1 + array1[start1];
            
            pos1 = start1 + m1;
            if (pos1 >= n1) {
                pos1 = pos1 - n1;
            }
            start1 = pos1;
            
            if (start1 == 0) {
                break;
            }
        }
        
        String path2 = "";
        int pos2 = 0;
        int start2 = 0;
        
        while (true) {
            path2 = path2 + array2[start2];
            
            pos2 = start2 + m2;
            if (pos2 >= n2) {
                pos2 = pos2 - n2;
            }
            start2 = pos2;
            
            if (start2 == 0) {
                break;
            }
        }
        
        System.out.println(path1 + path2);
    }
    
}
