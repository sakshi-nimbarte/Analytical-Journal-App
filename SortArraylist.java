/**
 * Created by sakshi on 14/04/17.
 */
import java.util.*;
import java.util.Scanner;
public class SortArraylist {

    public static void main(String args[]) {
        ArrayList<Double> ratings = new ArrayList<Double>();

        ArrayList<Double> rating1 = new ArrayList<Double>();
        ArrayList<Double> rating2 = new ArrayList<Double>();
        ArrayList<Double> rating3 = new ArrayList<Double>();
        Double a = 0.0;
        int i = 10;

        while (i > 0) {
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            ratings.add(a);
            i--;
        }

        System.out.println(ratings);

        for( int j=0; j<ratings.size(); j++) {

            a = ratings.get(j);




            if (a < 5 && a > 0) {
                rating1.add(a);
            }

            if (a < 8 && a > 4) {
                rating2.add(a);
            }

            if (a < 11 && a > 7) {
                rating3.add(a);
            }

        }
        //System.out.println(rating1);
        // System.out.println(rating2);
        //  System.out.println(rating3);

        //int size1 = rating1.size();
        //int size2 = rating2.size();
        //int size3 = rating3.size();
        int total = rating1.size()+rating2.size()+rating3.size();

        float percent1 = rating1.size()*100/(total);
        float percent2 = rating2.size()*100/(total);
        float percent3 = rating3.size()*100/(total);

        System.out.println(percent1+"%");
        System.out.println(percent2+"%");
        System.out.println(percent3+"%");

    }
}
