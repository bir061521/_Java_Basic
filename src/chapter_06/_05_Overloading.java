package chapter_06;
//메소드 오버로딩_전달값의 타입이나 갯수가 다른경우 같은 이름의 메소드를 여러번 선언
public class _05_Overloading {
    public static int getPower(int number){//정수전달
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber){//문자열 전달
        int number = Integer.parseInt(strNumber);
        return number * number;

    }

    public static void main(String[] args) {
        //메소드 오버로딩
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
    }

}
