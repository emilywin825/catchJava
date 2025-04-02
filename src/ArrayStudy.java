public class ArrayStudy {
    public static void main(String[] args){
//        배열 선언 및 초기화
        int[] student=new int[5];
//        배열에 값 대입
        student[0]=1;
//        2차원 배열
        int[][] score=new int[3][3];
        score[0][0]=1;

        ArrayStudy arrayStudy = new ArrayStudy();
        ArrayStudy arrayStudy1 = arrayStudy;

        System.out.println(arrayStudy);
        System.out.println(arrayStudy1);

    }

    public int add(int a,int b){
        return a+b;
    }
}
