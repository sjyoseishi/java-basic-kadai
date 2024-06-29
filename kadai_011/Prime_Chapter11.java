package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//100までの整数が、素数か判定するboolean型の配列を作成して、代入
		boolean[] primeNumber = new  boolean[101];
		//作成したboolean型の配列の要素を、for文を使って繰り返しtrueで初期化する処理をしましょう
		for (int k = 0; k <= 100;  k++) {
			primeNumber[k] = true;
		}
		// 素数を判定
		for (int i = 2; i<=100; i++) {
            for (int r = 2; r < i; r++) {
                if (i % r == 0) {
                	primeNumber[i] = false;
                    break;  
                }
            }	
		}
        // 素数を出力する
        for (int j = 2; j <= 100; j++) {
            if (primeNumber[j]) {
                System.out.println(j);
            }
        }
	}
}
