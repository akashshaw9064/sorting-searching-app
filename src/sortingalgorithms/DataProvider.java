package sortingalgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class DataProvider {
    public int[] getArrayData() throws FileNotFoundException {
        File file = new File("src/sortingalgorithms/data.txt");
        Scanner sc = new Scanner(file);
        int[] value = null;
        while(sc.hasNext()){
            value = Arrays.stream(sc.nextLine().split(",")).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
        }
        sc.close();
        return value;
    }
}
