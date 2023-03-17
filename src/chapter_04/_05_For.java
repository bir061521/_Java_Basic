package chapter_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
//      for(선언;조건;증감){
//          ...수행명령...
//      }
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요" + i);
        }

        //작수만 출력
        //02468
        for(int i = 0; i< 10; i+=2){
            System.out.println(i);
        }

        //홀수만 출력
        //13579
        for(int i = 1; i< 10; i+=2){
            System.out.println(i);
        }
        //거꾸로 출력
        //54321
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }

        //1부터 10까지의 수들의 합
        //1+2+3...+10
        int sum = 0;
        for(int i =1; i <= 10; i++){
            sum += i;
        }
        System.out.println("현재까지의 총합은" + sum);

    }
}
