A Groovy vs Java benchmark  
============================

A performance comparison between Java a Groovy.

It reads a genome file (~ 1_000_000 lines in a text file) counting G,C,A,T nucleotides 
(i.e. occurrence of that characters).

Result (Mac Book Pro 2.7 GHz Intel Core i7):

Version                   | Time     | count     |
------------------------- | -------- | --------- | 
gc.java                   | 427 ms   | 0.376217  | 
gc_if.groovy (static)     | 2430 ms  | 0.376217  | 
gc_if.groovy (dynamic)    | 5039 ms  | 0.376217  | 
gc_switch.groovy (static) | 19332 ms | 0.376217  |
gc_switch.groovy (dynamic)| 21677 ms | 0.376217  |
gc_array.groovy (static)  | 472 ms   | 0.376217  |
gc_array.groovy (dynamic) | 1590 ms  | 0.376217  |


The chromose file used for this benchmark is available for downlaod at this link ftp://ftp.ensembl.org/pub/release-67/fasta/homo_sapiens/dna/Homo_sapiens.GRCh37.67.dna_rm.chromosome.Y.fa.gz
