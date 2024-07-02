package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void fruitdict(String[] dictionarySearch) {
		// 辞書として機能するHashMapを宣言します。
		HashMap<String,String> 	fruitsMap = new HashMap<String,String>();
		//英単語と意味を追加します。		
		fruitsMap.put("apple", "りんご");
		fruitsMap.put("peach", "桃");
		fruitsMap.put("banana", "バナナ");
		fruitsMap.put("lemon", "レモン");
		fruitsMap.put("pear", "梨");
		fruitsMap.put("kiwi", "キウィ");
		fruitsMap.put("strawberry", "いちご");
		fruitsMap.put("grape", "ぶどう");
		fruitsMap.put("muscat", "マスカット");
		fruitsMap.put("cherry", "さくらんぼ");
		
	    for (String word : dictionarySearch) {
	        boolean exist = fruitsMap.containsKey(word);
	        if (exist) {
	            System.out.println(word + "の意味は" + fruitsMap.get(word));
	        } else {
	            System.out.println(word + "は辞書に存在しません");
	        }
	    }
	}	
}
