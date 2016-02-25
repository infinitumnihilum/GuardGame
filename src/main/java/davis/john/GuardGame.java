package davis.john;

/**
 * Created by jrdavis on 2/25/16.
 */
public class GuardGame {


    public int answer(long x) {

        int castx = (int) x;

        int sum = castx % 9;

        if(sum == 0){

            if(castx > 0)
                return 9;
        }

        return sum;
         }


    }
