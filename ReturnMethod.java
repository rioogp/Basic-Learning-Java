public class ReturnMethod {
  public static void main(String[] args) {
    var res1 = sum (100,100);
    System.out.println(res1);
    System.out.println(sum(200,200));

    System.out.println(hitung(100, "+" ,100));
    System.out.println(hitung(200, "-", 100));
  }

  static int sum(int value1, int value2){
    var res = value1 + value2;
    return res;
  }
  static int hitung(int value1, String operasi, int value2){
    switch(operasi){
      case "+": 
        return value1 + value2;
      case "-": 
        return value1 - value2;
      default:
        return 0;
    }
  }
}
