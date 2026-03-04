package managing;

public class Managing {

	//国名の変数を定義
	public String countryName;
	
	//食べ物の名前
    public String foodName;
    
    //食べ物の種類
    public String foodType;

    //コンストラクタを作成
    public Managing(String countryName, String foodName, String foodType) {
        this.countryName = countryName;
        this.foodName = foodName;
        this.foodType = foodType;
    }
}
