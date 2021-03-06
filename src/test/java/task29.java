import org.junit.jupiter.api.Test;

public class task29 {
    @Test
    public void task29() {
        System.out.println(utopianTree(4));
        System.out.println(utopianTree(3));
    }

    private int utopianTree(int n) {
        int treeHeight = 1;
        if(n == 0) {
            return treeHeight;
        }
        for(int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                treeHeight = treeHeight*2;
            } else {
                treeHeight = treeHeight+1;
            }
        }
        return treeHeight;
    }
}
