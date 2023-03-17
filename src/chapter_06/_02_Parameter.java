package chapter_06;

public class _02_Parameter {
    //전달값 Parameter
    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은" + result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i <exponent ; i++) {
            result = result * number;
        }
        System.out.println(number + "의" + exponent+"승은" + result);
    }
    public static void main(String[] args) {
        power(2);//()안에 전달값을 넣어주면 됨
        power(3);

        powerByExp(2,3);
        powerByExp(3,4);
    }
}
