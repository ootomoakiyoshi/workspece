public class Progate {
  public static void main(String[] args){
    int number = 8;
    // 変数に7を掛けて変数の上書き
    number *= 7;
    // 変数の出力
    System.out.println(number);

    // 変数に1を足す。(省略で)
    number++ ;
    System.out.println(number);

    int  length = 6;
    int  height = 8;
    // 変数rectangleAreaに、四角形の面積を代入
    int rectangleArea = length * height;
    System.out.println(rectangleArea);

    // 三角形の面積を求める。
    int triangleArea =length * height / 2;
    System.out.println(triangleArea);

    // double型の変数number1を定義し、8.5を代入してください。
    double number1 = 8.5;
    // double型の変数number2を定義し、3.4を代入してください。
    double number2 = 3.4;
    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);
     // number1からnumber2を引いた値を出力してください
     System.out.println(number1 - number2);

     int mouth =12; int date = 31;
     // 「12月31日」となるように変数と文字列を連結して出力
     System.out.println(mouth + "月" + date + "日");

     System.out.println(7 / 2);
     System.out.println(7.0 / 2.0);
  }
}
