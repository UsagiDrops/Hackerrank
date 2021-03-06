import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Task15 {
    @Test
    public void task15() {
        List<Integer> squares = Arrays.asList(1, 2, 1, 3, 2);
        System.out.println(birthdayStream(squares, 3, 2));
    }

    private int birthdayStream(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i=0; i<s.size(); i++)
        {
            if (i+m > s.size()) {
                break;
            }
            if(s.subList(i, i+m).stream().mapToInt(val->val).sum() == d) {
                count++;
            }
        }
        return count;
    }
}
