package chapter_06;

public class _03_Return {
    //반환값
    //tip_void는 return못함

    //호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;

    }
    //호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
        //값을 바로 리턴할수도 있음
    }
    //호텥 엑티비티
    public static String getActivties(){
        return "볼링장";
    }
    public static void main(String[] args) {
        //반환값 Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔전화번호:"+contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소:"+address);

        String activite = getActivties();
        System.out.println("호텔 엑티비티:" + activite);
    }
}
