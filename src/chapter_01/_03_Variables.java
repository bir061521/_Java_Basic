package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "나도코딩";
        //String name = "나도코딩";
        int hour = 15;

        System.out.println(name + " 님, 배송이 시작됩니다."+ hour +"시에 방문이 예정입니다");
        System.out.println(name + " 님, 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A';
        name  = "Muhly";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은"+ grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;//대문자 F나 소문자 f 적어줘야함

        System.out.println(d);//정밀
        System.out.println(f);

        //int가 담기에는 범위가 초과됨
       // int i = 10000000000000000;
        long l = 1000000000000000000L;
        System.out.println(l);


    }
}
