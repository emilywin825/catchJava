public class Casting {
    public static void main(String[] args){
//        큰 타입에서 작은 타입으로는 자동 형변환
        double d=1;
//        작은 타입에서 큰 타입으로는 명시적 형변환 필요
        int c= (int) 10.0;
//        큰 타입과 작은 타입의 연산은 큰 타입으로 자동 형변환
        int a=1;
        double b=10;
        System.out.println(a+b);
    }
}
