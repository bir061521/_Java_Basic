package chapter_04;

public class _04_SwitchCase {
    public static final String 장학금_대상_아님 = "장학금 대상 아님";

    public static void main(String[] args) {
        //Switch Case
//        석차에 따른 전액 장학금
//                1등 전액
//                2등 반액
//                3등 반액
//                그외:대상아님


        //IF Else
        int ranking = 1;    //1등
        if(ranking ==1){
            System.out.println("전액 장학금");
        }else if(ranking == 2){
            System.out.println("반액 장학금");
        }else if(ranking == 3) {
            System.out.println("반액 장학금");
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료#1");

        //Switch Case문
//        switch(expression){
//            case a;...수행할 명령...
//            case b;...수행할 명령...
//            case c;...수행할 명령...
//                break;
//            ...
//            default:...수행할 명령...
        ranking = 1;
        switch(ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println(장학금_대상_아님);
        }
        System.out.println("조회완료#2");
    }
}
