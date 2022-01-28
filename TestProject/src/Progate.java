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
  }
}
