package kadai_017;

//加藤花子を表す子クラス
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		this.givenName = "花子";
	}
	
   //抽象メソッドに具体的な処理を記述	する
   void eachIntroduce() {
	   System.out.println("趣味は読書です");
   }
}