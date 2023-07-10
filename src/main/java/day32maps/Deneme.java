package day32maps;

import java.util.TreeMap;

public class Deneme {
    public static void main(String[] args) {
        String s="abcdABCDabcd";
        System.out.println(getTheNumOfOccurrenceOfLetters(s));

    }//main
    public static TreeMap<String, Integer> getTheNumOfOccurrenceOfLetters(String s){
        //Gorunum sayilarini depolamak icin Map olustur
        TreeMap<String, Integer> numOfOccurrence = new TreeMap<>();
        //Harfleri al
        String letters[] = s.split("");
        for(String w : letters){
            Integer numOfOcc = numOfOccurrence.get(w);
            if(numOfOcc==null){
                numOfOccurrence.put(w,1);
            }else{
                numOfOccurrence.replace(w, numOfOcc+1);
            }
        }
        return numOfOccurrence;


    }
}//class
