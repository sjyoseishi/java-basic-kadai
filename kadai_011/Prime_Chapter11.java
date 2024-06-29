package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//100までの整数が、素数か判定するboolean型の配列を作成して、代入
		boolean[] primeNumber = new  boolean[100];
		//作成したboolean型の配列の要素を、for文を使って繰り返しtrueで初期化する処理をしましょう
		for (int k = 0; k < primeNumber.length; k++) {
			primeNumber[k] = true;
		}
		
		for (int i = 2; i<=100; i++) {
            for (int r = 2; r < i; r++) {
                if (i % r == 0) {
                	primeNumber[i - 1] = false;
                    break;  
                }
            }	
		}
        // 素数を出力する
        for (int j = 0; j < primeNumber.length; j++) {
            if (primeNumber[j] == true) {
                System.out.println(j + 1);
            }
        }
	}
}
