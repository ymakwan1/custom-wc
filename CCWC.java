import java.io.BufferedReader;
import java.io.File;
public class CCWC { 
    public static void main(String[] args) {
        if (args.length > 1) {
            String fileName = args[1];
            long byteCounts;
            if (args[0].equals("-c")) {
                byteCounts = bytesCount(fileName);
                System.out.println(byteCounts+" "+fileName);
            }
        }else{
            String fileName = args[0];
        }
    }

    public static long bytesCount(String fileNameIn){
        File file = new File(fileNameIn);
        return file.length();
    }
}
