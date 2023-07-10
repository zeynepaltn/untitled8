package day17multidimensionalarraypassbyvalue;

public class PassByValue02 {
    public static void main(String[] args) {
        String name="Tom Hanks";
        System.out.println(name);
        String updatedName=updateName(name,"Actor");

        System.out.println(updatedName);
        System.out.println(name);

    }//main
    public static String updateName(String name,String add){
      name=name+" "+add;
      return name;
    }
}//class
