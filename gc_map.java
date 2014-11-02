import java.io.*;
import java.util.Arrays;

public class gc_map {
 
    public static void main(String[] args) throws java.io.IOException {
 
        BufferedReader in = new BufferedReader(new FileReader("Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa"));
 
        long start = System.currentTimeMillis();
        int[] chars = new int[256];
        Arrays.fill(chars,0);
 
        String line;
        while ((line = in.readLine()) != null) {
 
            if (line.startsWith(">")) continue;

            for (int i = 0; i < line.length(); ++i) {
                int c = (int) line.charAt(i);
                ++chars[c];
            }
 
        }

        int a = chars['A'];
        int t = chars['T'];
        int c = chars['C'];
        int g = chars['G'];

        int totalBaseCount = a + t + c + g;
        int gcCount = g + c;

        System.out.printf("GC count %f\n", gcCount / (double) (totalBaseCount));
        System.out.printf("Elapsed %d ms\n", System.currentTimeMillis() - start );
 
    }
 
}