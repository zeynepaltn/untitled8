package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course turkishDay=new Course("Turkish Daytime QA", 213, "Spring", 97 );
        Course turkishNight=new Course("Turkish Nighttime QA", 245, "Winter", 98 );
        Course englishDay=new Course("English Daytime Java Dev", 121, "Spring", 91);
        Course englishNight=new Course("English Nighttime Dev", 137, "Winter", 95);
        List<Course> courseList=new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);
        System.out.println(isAnyCourseNameContainsQA(courseList,"QA"));

        System.out.println(isAverageScoreGreaterThanANumber(courseList, 90));
        System.out.println(getCourseNamesWhoseAvgMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighestThird(courseList));
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList, 150));
    }//main
    //Example 1:Tum average score'larin 90'dan buyuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean isAverageScoreGreaterThanANumber(List<Course> courseList, int avg){
        return courseList.
                stream().
                allMatch(t->t.getAverageScore()>avg);
    }
    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz.
    public static boolean isAnyCourseNameContainsQA(List<Course> courseList, String word){
        return courseList.
                stream().
                anyMatch(t->t.getCourseName().contains(word));

    }
    //Example 3: En yuksek average score'a sahip kurs ismini veren kodu yaziniz
    public static String getCourseNamesWhoseAvgMax(List<Course> courseList){
      return courseList.
              stream().
              sorted(Comparator.comparing(Course::getAverageScore).
                      reversed()).
              findFirst().
              get().
              getCourseName();

    }
    //Example 4: Average scor'u en dusuk olan ilk iki course disindaki tum kurslari return eden method'u olusturun.
    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).collect(Collectors.toList());

    }

//Example 5: Average score'u ustten ucuncu olan kursu veren method'u olusturunuz.
    public static Course getHighestThird(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).get(0);
    }
    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList, int numOfStd){
        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());
    }

}//class
