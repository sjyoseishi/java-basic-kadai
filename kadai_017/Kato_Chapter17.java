package kadai_017;

//親クラス
abstract public class Kato_Chapter17 {
	//姓のフィールド
	String familyName = "加藤";
	//名のフィールド
	String givenName;
	//住所のフィールド
	String address = "東京都中野区〇×";
	
	//出力メソッド
	//共通の紹介を出力する
   public void commonIntroduce(){
	      System.out.println("名前は"+familyName+givenName+"です");
	      System.out.println("住所は"+address+"です");

   }
   //紹介を実行する
   public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
		System.out.println();//改行
}
   //抽象メソッド、個別の紹介を出力する
   abstract void eachIntroduce();

}




