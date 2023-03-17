package chapter_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열:같은 자료형의 값 여러 개를 저장한는 연속된 공간
        //배열 선언 첫 번째 방법
//        String[] coffees = new String[4];

        //배열 선언 두 번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노";   //0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라뗴";
//        coffees[3] = "카푸치노";

        //세 번째 방법
//        String[] coffees = new String[]{"아메리카노", "카페모카","라떼","카푸치노"};

        //네 번째 방법
        String[] coffees = {"아메리카노", "카페모카","라떼","카푸치노"};
        System.out.println("----------------------");

        //커피주문
        System.out.println(coffees[0]+"하나");
        System.out.println(coffees[1]+"하나");

        //만약 값을 변경한다면?
        coffees[2] = "에스프레소";//값 변경
        System.out.println(coffees[2]+"하나");
        System.out.println(coffees[3]+"하나");


        //다른 자료형
        int[]i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
