package fonksiyonel;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Lambda01Kurallar {


    public static void main(String[] args) {

        List<Integer> Liste= Arrays.asList(1,2,3,4,5);
        Liste.forEach(x-> System.out.println(x));
        System.out.println("====================================================");
    //Listenin elemanlarini 2 arttirarak yazdiralim.
        System.out.println("Eger satir sayisi birden fazlaysa suslu parantez kullanmaliyiz");
        System.out.println("eger veri tipikullanilirsa explicit olur");
    Liste.forEach(t-> System.out.print(t+2+" "));
Liste.forEach(t->{
    int miktar=2;
     System.out.print(t+2+" ");
});




    }



}
