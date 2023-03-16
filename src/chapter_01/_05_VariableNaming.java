package chapter_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는법
        //1.저장할 값에 어울리는 이름
        //2.밑줄, 문자, 숫자 사용 가능
        //3.밑줄 또는 문자로 시작 가능
        //4.하 낟ㄴ어 또는 2개 이상 단어의 연속
        //5.소문자로 시작, 각 단어의 시작 글자는 대문자
        //6.예약어 사용 불가(public, static, void...)

        //입국 신고서(여행)
        String nationality = "대한민국";
        String firstName = "현성";
        String lastNAme = "김";
        String dateOfBirth = "2002-12-02";
        String residentialAddress = "힐슨호텔";
        String purposeOfVisit = "관광";
        String flighthNo = "KE657";
        String flignt_no_2 = "KE657";

        int accompany = 2;
        int lengthOfStay = 5;

        String item = "시계";
        String item2 = "가방";

        //상수
        //한번 정의되고 나면 절대 값을 변할 수 없음_대문자로 적음
        final String CODE = "KR";
    }
}
