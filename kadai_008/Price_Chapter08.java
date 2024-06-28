package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		//サービスの使用料金を表す変数
		int serviceCost [] = {1000,2000,3000,4000,5000,500};
        //年代を表す変数
        int userAge = 30;
        
        switch(userAge/10) {
        	case 1  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[0] +  "円");
        	}
        	case 2  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[1] +  "円");
        	}
        	case 3  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[2] +  "円");
        	}
        	case 4  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[2] +  "円");
        	}
        	case 5  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[3] +  "円");
        	}
        	case 6  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[3] +  "円");
        	}
        	case 7  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[3] +  "円");
        	}
        	case 8  -> {
        		System.out.println(userAge + "代の料金は" + serviceCost[4] +  "円");
        	}
        	default   -> System.out.println("上記以外の年代" + serviceCost[5] +  "円");
        }
	}
}
