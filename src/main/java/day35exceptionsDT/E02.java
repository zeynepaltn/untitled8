package day35exceptionsDT;

public class E02 {
    public static void main(String[] args) {
        String s="1234";
        convertStringToInt(s);
        String t="1234a";
        convertStringToInt(t);//exception verecek


    }//main
    public static void convertStringToInt(String s){
        try{
            int intS=Integer.valueOf(s);
            System.out.println(intS+1);
        }catch(NumberFormatException e){
            System.out.println("Bir String'in sayiya donusturulebilmesi icin rakam disi karakter icermemesi gerekir");
            System.out.println(e.getMessage());
        }



    }
}//class
