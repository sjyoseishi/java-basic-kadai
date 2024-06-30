package kadai_017;

//加藤一郎を表す子クラス
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		this.givenName = "一郎";
		
	}
	
   //抽象メソッドに具体的な処理を記述	する
   void eachIntroduce() {
	   System.out.println("好きな食べ物はリンゴです");
   }
}