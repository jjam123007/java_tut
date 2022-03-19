public class test1 implements Comparable<test1>{
    int x;
    int y;
    public test1(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(test1 other) {
        return 0;
    }
}
