package kadai_014;

//車クラス
public class CarExec_Chapter14 {

	//フィールド（内部データ）
	private int gear = 1; //ギアの初期値
	private int speed = 10; //速度の初期値

	 // コンストラクタ
	public CarExec_Chapter14()  {
		
	}
	
	//メソッド
	//ギアの値により速度を変える
	public void gearChange(final int afterGear) {
		this.gear = afterGear;
		//ギアの速度
		switch (this.gear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
		
	}
	//ギアチェンジ後の速度を表示する	
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました" );
		System.out.println("速度は時速" + this.speed + "kmです" );
	}
	
}
