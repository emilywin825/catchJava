package access;

public class MaxCounter {
    private int count=0;
    int max;
    public MaxCounter(int max){
        this.max=max;
    }

    public void increment(){
        if (count>=max){
            System.out.println("no");
        }else {
            count++;
        }
    }

    public int getCount(){
        return count;
    }

}
