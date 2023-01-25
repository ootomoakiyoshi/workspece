import javax.xml.validation.Validator;

public class Chapter05 {

  public static void main(String[] args) {
    int val = 2 + 5;
    System.out.println(val);

    val++;
    System.out.println(val);

    val *= 5;
    System.out.println(val);

    boolean bool = (val == 50);
    // 「==」を使用して、「valは50と等しい」の結果を代入
    System.out.println(bool);

    bool = (val < 50) && (val % 10 == 0);
    System.out.println(bool);
    // valは50より小さい」は、関係（比較）演算子の「<」を使用し、「valを10で割った余りが0」の余りの計算は、算術演算子の「%」を使用。
  }
}
