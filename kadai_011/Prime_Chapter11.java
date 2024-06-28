package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		int i,j;
		for (i = 2; i<=100; i++) {
			for(j=2; ( j < i && i % j != 0 ) || j == i; j++){
				if(j==i){
					System.out.println(i);
				}
			}
		 }
	}
}
