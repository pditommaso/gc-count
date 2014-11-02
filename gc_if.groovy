import groovy.transform.CompileStatic
 
@CompileStatic
def main() {
    long start = System.currentTimeMillis();

    int a = 0
    int t = 0
    int c = 0
    int g = 0


    BufferedReader buffer = new BufferedReader(new FileReader("Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa"));
    
    String line;
    while ((line = buffer.readLine()) != null) {
 
        if (line.startsWith('>'))
            continue
 
        for (int i = 0; i < line.length(); ++i) {
            int ch = (int) line.charAt(i);

            if( ch == 'C' ) c++
            else if( ch == 'G' ) g++
            else if( ch == 'T' ) t++
            else if( ch == 'A' ) a++

        }
 
    }


    int totalBaseCount = a + t + c + g
    int gcCount = g + c
 
    println "GC count ${gcCount / (double) (totalBaseCount)}"
    println "Elapsed ${System.currentTimeMillis() - start} ms"
}
 
main()
