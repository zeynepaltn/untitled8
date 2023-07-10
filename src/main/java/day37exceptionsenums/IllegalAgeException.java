package day37exceptionsenums;
//Olusturdugumuz Class'i RunTimeException'in Child' i yaparsak o class RunTimeException olur
// ama Exception Class'in childí yaparsak Compile Time Exception olur
public class IllegalAgeException extends RuntimeException{
    /*
       1)Eger RunTime Exception uretmek isterseniz RunTimeException Class'a extend etmelisiniz

     */
    public IllegalAgeException(){
        super();

    }
    public IllegalAgeException(String message){
        super(message);
    }
}
