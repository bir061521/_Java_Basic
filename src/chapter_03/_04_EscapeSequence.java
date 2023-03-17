package chapter_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        //  \n \t \\ \" \'

        //  /n:줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        //  \t:tab을 써 간격 맞추기
        System.out.println("해물파전\t9000원");
        System.out.println("김치정\t9000원");
        System.out.println("파전\t9000원");

        //  \\
        System.out.println("c:\\Program Files\\Java");

        //  \":큰따옴표
        // 단비가"냐옹"이라고 했어요
        System.out.println("단비가 \"냐용\"이라고 했어요");

        //  \'작은따옴표
        System.out.println("단비가 \'뭘 봐\'라눈 표정을 지었어요");




    }
}
