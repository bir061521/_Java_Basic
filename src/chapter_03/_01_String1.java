package chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());//대문자로
        System.out.println(s.toLowerCase());//소문자로

        //포함관계
        System.out.println(s.contains("Java"));//포함된다면 true, 포함되지 않는다면 false
        System.out.println(s.contains("C#"));//포함된다면 true, 포함되지 않는다면 false

        //위치정보
        System.out.println(s.indexOf("Java"));//J의 시작위치
        System.out.println(s.indexOf("C#"));//-1_포함되지않았기때문
        System.out.println(s.lastIndexOf("and"));//마지막 일치하는 위치정보
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true(아니면 false)
        System.out.println(s.endsWith("."));//이 문자열로 시작하면 true(아니면 false)
    }
}
