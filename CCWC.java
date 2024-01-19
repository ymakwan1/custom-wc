import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
public class CCWC { 
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CCWC [-c | -l | -w] <file_path>");
            System.exit(1);
        }
        if (args.length > 1) {
            String fileName = args[1];
            long byteCounts;
            long lineCounts;
            long wordCounts;
            if (args[0].equals("-c")) {
                byteCounts = bytesCount(fileName);
                System.out.println(byteCounts+" "+fileName);
            }
            else if(args[0].equals("-l")){
                lineCounts = lineCount(fileName);
                System.out.println(lineCounts+" "+fileName);
            } else if(args[0].equals("-w")){
                wordCounts = wordCount(fileName);
                System.out.println(wordCounts+" "+fileName);
            }
        }else{
            String fileName = args[0];
            long byteCounts;
            long lineCounts;
            long wordCounts;
            byteCounts = bytesCount(fileName);
            lineCounts = lineCount(fileName);
            wordCounts = wordCount(fileName);
            System.out.println(byteCounts+" "+lineCounts+" "+wordCounts+" "+fileName);
        }
    }

    public static long bytesCount(String fileNameIn){
        File file = new File(fileNameIn);
        return file.length();
    }

    public static long lineCount(String fileNameIn){
        long count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameIn));
            while (bufferedReader.readLine() != null) {
                count++;
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public static long wordCount(String fileNameIn){
        long count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameIn));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                count += stringTokenizer.countTokens();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}