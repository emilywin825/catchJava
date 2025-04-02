import java.util.Scanner;
import java.util.TreeMap;

public class ScannerStudy {
    public static void main(String[] args) {
//        ScannerStudy 사용법
        Scanner scanner = new Scanner(System.in);

//        엔터을 입력할 때 까지 문자를 가져온다.
//        scanner.nextLine();

//        입력을 int 형으로 가져온다. 정수 입력에 사용한다.
//        scanner.nextInt();

//        입력을 double 형으로 가져온다.실수 입력에 사용한다.
//        scanner.nextDouble();

//        print() : 출력하고 다음 라인으로 넘기지 않는다.
//        System.out.print("hello");
//        System.out.print("world");

//        println() : 출력하고 다음 라인으로 넘긴다.
//        System.out.println("hello");
//        System.out.println("world");

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a>b){
//            System.out.println(a);
//        }else if (a<b){
//            System.out.println(b);
//        } else System.out.println("두 숫자의 크기는 같습니다.");

        while (true){
            System.out.println("글을 입력해주세요");
            String i = scanner.next();
            if (i.equals("exit")){
                break;
            } else System.out.println(i);
        }

    }
}
