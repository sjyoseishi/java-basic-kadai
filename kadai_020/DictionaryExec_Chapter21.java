package kadai_020;

public class DictionaryExec_Chapter21 {
	
    public static void main(String[] args) {
    	//辞書クラスのインスタンスを作成する
    	Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
    	// 調べる英単語を配列にセットする
        String[] dictionarySearch = {"apple", "banana", "grape","orange"};        
        // 辞書を調べる
        dictionary.fruitdict(dictionarySearch);
    }
}
