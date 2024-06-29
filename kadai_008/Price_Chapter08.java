package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		//サービスの使用料金を表す変数
		int serviceCost;
        //年代を表す変数
        int userAge = 30;
        
        switch(userAge/10) {
        	case 1  -> {
        		serviceCost = 1000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 2  -> {
        		serviceCost = 2000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 3  -> {
        		serviceCost = 3000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 4  -> {
        		serviceCost = 3000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 5  -> {
        		serviceCost = 4000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 6  -> {
        		serviceCost = 4000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 7  -> {
        		serviceCost = 4000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	case 8  -> {
        		serviceCost = 5000;
        		System.out.println(userAge + "代の料金は" + serviceCost +  "円");
        	}
        	default   -> System.out.println("上記以外の年代の料金は500円");
        }
	}
}
