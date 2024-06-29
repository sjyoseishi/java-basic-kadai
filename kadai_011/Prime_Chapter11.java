package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//100までの整数が、素数か判定するboolean型の配列を作成して、代入
		boolean[] primeNumber = new  boolean[100];
		//作成したboolean型の配列の要素を、for文を使って繰り返しtrueで初期化する処理をしましょう
		for (int k = 0; k < primeNumber.length; k++) {
			primeNumber[k] = true;
		}
		//割る数2から100まで繰り返す
		for (int i = 2; i<=100; i++) {
			//kが2から割られる数になるまで繰り返し、素数を出力する
			for(int k=2; ( k < i && i % k != 0 ) || k == i; k++){
				if(k==i){
					System.out.println(k);
				}
			}
		 }
	}
}
