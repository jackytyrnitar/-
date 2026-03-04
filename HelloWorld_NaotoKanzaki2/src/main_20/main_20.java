package main_20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import managing.managing;

public class main_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

     //  オブジェクト作成
      managing m = new managing("日本", "寿司", "和食");

     //  メッセージ出力
        System.out.println("こんにちは！ここは" + m.countryName + "です！");
        System.out.println("この" + m.foodName + "はうまい");
        System.out.println(m.foodName + "は" + m.foodType + "です");

     //日時を出力
        LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    String formattedDate = now.format(formatter);
	    System.out.println("今の現在の時刻は"+formattedDate+"です。");
        
	}

}
