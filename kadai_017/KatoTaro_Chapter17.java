package kadai_017;

//加藤太郎を表す子クラス
public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
   //抽象メソッドに具体的な処理を記述	する
   void eachIntroduce() {
	   System.out.println("Javaが得意です");
   }
}
