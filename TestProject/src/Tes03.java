public class Tes03 {
  public static void main(String[] args) {
    int number = 10;
    System.out.println(number);

    number = number + 10;
    System.out.println(number);

    number += 10;
    System.out.println(number);
    
    number ++;
    System.out.println(number);

    int length = 6;
    int height = 8;

    int triangleArea = length * height / 2;
    System.out.println(triangleArea);
    // 三角形の変数へlengthとheightを代入

    int number1 = 7;
    int number2 = 2;
    System.out.println(number1 / number2);

    System.out.println((double)number1 / number2);
    // int型をdouble型に型変更
  }
}
