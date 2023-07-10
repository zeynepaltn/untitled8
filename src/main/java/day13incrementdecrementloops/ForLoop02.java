package day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {
   //Example: Verilen bir string de ilk A harfinden onceki tum karakterli consola yazdirin
   // use string "I live Java"
   String s="I love Java";
   for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);

       if(ch=='a'){
           break;

       }
       System.out.print(ch);



       /*
       charAt() bize char dondurur Substring() ise string dondurur
        */
   }
   System.out.println();
 //Example2: Verilen bir string de son "a" dan sonraki tum
        // characterleri ters sirada yazdirin  "Germany===> yn"
        String t="Germany";
   //once germany i tersten yazdiralim
        for(int i=t.length()-1;i>=0;i--){//son ch den basla ilk karaktere dogru tek tek git demek
            //eger yazdirirsam bunu bana ynamreG dondurur
            char chr=t.charAt(i);

            if(chr=='a'){
                break;
            }

            System.out.print(chr);



        }
    }
}

