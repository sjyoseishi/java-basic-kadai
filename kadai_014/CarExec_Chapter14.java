package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		//車クラスのインスタンスを作成する
		Car_Chapter14 gear = new Car_Chapter14();

		//車クラスのgearChangeメソッドを実行する
		gear.gearChange(3);
		//車クラスのrunメソッドを実行する
		gear.run();
	}
}