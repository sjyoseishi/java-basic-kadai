package kadai_024;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手を入力する(戻り値はString)
	public String getMyChoice() {
		//キーボード入力の準備
		String myChoice;
		Scanner scanner = new Scanner(System.in);
		//無限ループ
		while (true) {
			//メッセージの表示
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			myChoice = scanner.nextLine();
			//System.out.println(myChoice);
			
			//正しいじゃんけんの手であるか判定する
			if(isValidChoice(myChoice)) {
				//正しい場合、じゃんけんクラスを実行するクラスに自分のジャンケンの手を返す
				scanner.close();
				return myChoice;	
			}else {
				//正しくない場合、エラーを出力し、再度自分のじゃんけんの手を選ぶ
				System.err.println("エラー: 正しいジャンケンの手を入力してください");
			}
		}	
	}
    public boolean isValidChoice(String choice) {
        return choice.equals("r") || choice.equals("s") || choice.equals("p");
    }
	//対戦相手のじゃんけんの手を乱数で選ぶ(戻り値はString)
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[] janken = {"グー","チョキ","パー"};
		
         //乱数の範囲で指定した3未満の数をfloor()メソッドで切り捨て、配列の要素数である0から2を取得します
         int i = (int)(Math.floor(Math.random() * 3));
		
		//System.out.println(janken[i]); //test
		//じ対戦相手のじゃんけんの手を返す		
		return janken[i];
	}
	//じゃんけんを行う(戻り値はなし)
	public void playGame() {
		//自分と対戦相手のじゃんけんの手を出力する
		//HashMapの値を出力しましょう。playGameメソッドの引数をHashMapのキーとしましょう。		
		HashMap<String,String> playMap = new HashMap<String,String>();
		playMap.put("r","グー");
		playMap.put("s","チョキ");
		playMap.put("p","パー");
		
		// 自分が入力した値
	    String my = this.getMyChoice(); 
	    // pcが入力した値
	    String pc = this.getRandom(); 
		//System.out.println(pc);   //test
	    //自分の手と対戦相手の手の値を出力する
	    System.out.println("自分の手は" + playMap.get(my) + ",対戦相手は" + pc);
	    
		//System.out.println(playMap.get(my));   //test
		//System.out.println(pc);   //test
	    if(playMap.get(my).equals(pc)) {
		    //あいこ
	    	System.out.println("あいこです");
	    }else if((playMap.get(my).equals("グー") && pc.equals("チョキ")) || (playMap.get(my).equals("チョキ") && pc.equals("パー")) || (playMap.get(my).equals("パー") && pc.equals("グー"))) {
		    //自分が勝った場合
	    	System.out.println("自分の勝ちです");
	    }else if((playMap.get(my).equals("グー") && pc.equals("パー")) || (playMap.get(my).equals("チョキ") && pc.equals("グー")) || (playMap.get(my).equals("パー") && pc.equals("チョキ"))) {
		    //自分が負けだ場合
	    	System.out.println("自分の負けです");
	    }
	}
}
