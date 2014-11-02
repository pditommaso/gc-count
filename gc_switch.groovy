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
            char ch = line.charAt(i);

            switch( ch ) {
                case 'C': c++; break
                case 'G': g++; break
                case 'T': t++; break
                case 'A': a++; break
            }
        }
 
    }

    int totalBaseCount = a + t + c + g
    int gcCount = g + c
 
    println "GC count ${gcCount / (double) (totalBaseCount)}"
    println "Elapsed ${System.currentTimeMillis() - start} ms"
}
 
 
main()