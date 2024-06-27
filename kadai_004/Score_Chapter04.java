package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
				
		//変数配列宣言 10人の学生名
        String name [] = {"Aさん","Bさん","Cさん","Dさん","Eさん","Fさん","Gさん","Hさん","Iさん","Jさん"};
        //変数配列宣言 10人の点数
        int s[] = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        
        System.out.println(name [0] + "の点数は" + s[0] + "点");
        System.out.println(name [1] + "の点数は" + s[1] + "点");
        System.out.println(name [2] + "の点数は" + s[2] + "点");
        System.out.println(name [3] + "の点数は" + s[3] + "点");
        System.out.println(name [4] + "の点数は" + s[4] + "点");
        System.out.println(name [5] + "の点数は" + s[5] + "点");
        System.out.println(name [6] + "の点数は" + s[6] + "点");
        System.out.println(name [7] + "の点数は" + s[7] + "点");
        System.out.println(name [8] + "の点数は" + s[8] + "点");
        System.out.println(name [9] + "の点数は" + s[9] + "点");
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
          }

        System.out.println("テストの平均点は" + (sum / 10) +  "点");


	}

}