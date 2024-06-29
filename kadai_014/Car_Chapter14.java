package kadai_014;

public class Car_Chapter14 {

	public static void main(String[] args) {
		//車クラスのインスタンスを作成する
		CarExec_Chapter14 gear = new CarExec_Chapter14();

		//車クラスのgearChangeメソッドを実行する
		gear.gearChange(4);
		//車クラスのrunメソッドを実行する
		gear.run();
	}
}
