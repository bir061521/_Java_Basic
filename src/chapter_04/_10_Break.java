package chapter_04;

public class _10_Break {
    public static void main(String[] args) {
        //Break
        //치킨 집에서 매일 20마리만 판매(1인1닭만 가능)
        //for문

        int max = 20;//나올 수 있는 치킨 양
        for(int i = 1; i <=50; i++){
            System.out.println(i + "번 손님, 주문하시 치킨 나왔습니다");
            if(i == max){
                System.out.println("금일 재료가 모두 소진되었습니다");
               break;//반복문 탈출
            }
        }
        System.out.println("영업종료합니다");
    }
}
//break을안썼다면 50번째까지 출력된후 영업 종료 됨
//break을 썼다면 20번까지만 출력된후 영업 종료 됨