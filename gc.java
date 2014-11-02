import java.io.*;
 
public class gc {
 
    public static void main(String[] args) throws java.io.IOException {
 
        BufferedReader in = new BufferedReader(new FileReader("Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa"));
 
        long start = System.currentTimeMillis();
        int at = 0;
        int gc = 0;
 
        String line;
        while ((line = in.readLine()) != null) {
 
            if (line.startsWith(">")) continue;
 
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == 'C' || c == 'G') {
                    gc++;
                } 
                else if (c == 'A' || c == 'T') {
                    at++;
                }
            }
 
        }
 
        System.out.printf("GC count %f\n", gc / (double) (gc + at));
        System.out.printf("Elapsed %d ms\n", System.currentTimeMillis() - start);
 
    }
 
}
