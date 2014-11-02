import groovy.transform.CompileStatic
 
@CompileStatic
def main() {
    long start = System.currentTimeMillis();
 
    int[] chars = new int[256]
    256.times { chars[it] = 0 }
 
    def file = new File("Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa")
    file.eachLine { String line ->
 
        if (line.startsWith('>'))
            return
 
        for (int i = 0; i < line.length(); ++i) {
            int c = (int) line.charAt(i);
            ++chars[c]
        }
 
    }
    int a = chars[(int) ('A' as char)]
    int t = chars[(int) ('T' as char)]
    int c = chars[(int) ('C' as char)]
    int g = chars[(int) ('G' as char)]
 
    int totalBaseCount = a + t + c + g
    int gcCount = g + c
 
    println "GC count ${gcCount / (double) (totalBaseCount)}"
    println "Elapsed ${System.currentTimeMillis() - start} ms"
}
 
 
main()