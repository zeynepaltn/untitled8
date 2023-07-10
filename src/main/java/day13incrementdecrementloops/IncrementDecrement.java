package day13incrementdecrementloops;

public class IncrementDecrement {
    /*
    1)increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilir
    2)increment ve decremen 3 yolla yapilir
    int i=3;==> i=i+5;  ya da i+=5; ya da 1 arttirmalarda i++;
     */
    public static void main(String[] args) {
        //increment
        int a=5;
        System.out.println(a);
        a=a+2; // a+=2;   ayni gorevi yapar ve tavisye edilan budur
        System.out.println(a);
    //Example 1: int var olustur ve 5 arttir
    int b=5;
    b+=5; //10
        System.out.println(b);
    b=b+5;// bir daha 5 artti 15
        System.out.println(b);
    //Decrement
    int c=8;
    c=c-3;
        System.out.println(c);
    c-=3;
        System.out.println(c);
    //Increment 2;
    int d=6;
    d=d*2;
        System.out.println(d);
    d*=2;
        System.out.println(d);
    int e=24;
    e=e/3;
        System.out.println(e);
    e/=2;
        System.out.println(e);
     // 1 ile increment de i++; kullanmak daha guzel
     // 1 ide decrement
     int h=10;
    // h=h-1;
     //h-=1;
        h--;
        System.out.println(h);//9

    //post and pre increment
    int i=10;
    int k=i++; //post increment
        System.out.println(k);// 10
        int m=15;
        int n=++m; //pre increment
        System.out.println(n);//16
    int p=17;
    int r=p--;
        System.out.println(p);//16
        System.out.println(r);//17
    int s=20;
    int t=--s;
        System.out.println(s);//19
        System.out.println(t); //19


    }
}
