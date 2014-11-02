A Groovy vs Java benchmark  
============================

A performance comparison between Java a Groovy counting G,C,A,T nucleotides in a genome file.

Result (Mac Book Pro 2.7 GHz Intel Core i7):

Version                   | Time     | count     |
------------------------- | -------- | --------- | 
gc.java                   | 501 ms   | 0.376217  | 
gc_if.groovy (static)     | 2430 ms  | 0.376217  | 
gc_if.groovy (dynamic)    | 5039 ms  | 0.376217  | 
gc_switch.groovy (static) | 19332 ms | 0.376217  |
gc_switch.groovy (dynamic)| 21677 ms | 0.376217  |


The chromose file used for this benchmark is available for downlaod at this link ftp://ftp.ensembl.org/pub/release-67/fasta/homo_sapiens/dna/Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa.gz
