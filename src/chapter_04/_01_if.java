package chapter_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 if
        int hour = 10;  //오전 10시

        if(hour < 14){
            System.out.println("아이스 아메리카노 + 1");
        }

        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료1");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우인데 먹고싶음
        hour = 10;
        boolean morningCoffee = false;  //모닝커피
        if(hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료2");

        //오후 2시 이후이거나 모닝 커피를 마신 경우인데 먹고싶음
        hour = 10;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료3");
    }
}
