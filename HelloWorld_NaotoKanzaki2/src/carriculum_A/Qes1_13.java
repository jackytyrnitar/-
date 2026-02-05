package carriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {
	public static void main(String[] args) {
		// 1ローカル変数として宣言
		int intNum;
		long longNum;
		byte byteNum;
		short shortNum;
		float floatNum;
		double doubleNum;
		char charWord;
		String stringWord;
		boolean b;
		// 2ローカル変数に初期値を代入
		intNum=0;
		longNum=0L;
		byteNum=0;
		shortNum=0;
		floatNum=0.0f;
		doubleNum=0.0d;
		charWord='\u0000';
		stringWord=null;
		b=false;

		// 3初期化をしたそれぞれの変数に値を代入
		intNum=1000;
		longNum=10000;
		byteNum=10;
		shortNum=100;
		floatNum=9.5f;
		doubleNum=10.5;
		charWord='a';
		stringWord="ハロー";
		b=true;

		//4コンソール出力
		System.out.println(longNum+intNum+byteNum+shortNum);
		System.out.println(byteNum+byteNum);
		System.out.println(charWord+stringWord+b);
		System.out.println((int)(intNum+longNum+shortNum+floatNum+doubleNum+byteNum));
		System.out.println(longNum*intNum*byteNum*shortNum);
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);

		//5ハローJavaと表示
		String num="20";
		int num1=23;
		System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));

		//6自己紹介
		String name="山田太郎";
		int age=18;
		double height=170.5;
		double weight=62.2;
		String food="寿司";
		
		System.out.println("初めまして。"+name+"です。");
		System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + food + "です。");

        //7BMIを出力
        double value = weight/(height*height)*10000;
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(1, RoundingMode.HALF_UP); // 小数点第2位で四捨五入
        System.out.println(bd);
        
        //8再代入で出力
        name="鈴木一郎";
		age=24;
		height=168.5;
		weight=64.2;
		food="オムライス";
		
		
		System.out.println("初めまして。"+name+"です。");
		System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + food + "です。");
        
        value = weight/(height*height)*10000;
        bd = new BigDecimal(value);
        bd = bd.setScale(1, RoundingMode.HALF_UP); // 小数点第2位で四捨五入
        System.out.println("BMIは"+bd+"です。");
        
        //9自己代入
        age=age+age;
        
        height+=height;
        
        weight=weight+weight;
      
        
        System.out.println("初めまして。"+name+"です。");
		System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + food + "です。");
        
        value = weight/(height*height)*10000;
        bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP); // 小数点第2位で四捨五入
        System.out.println("BMIは"+bd+"です。");
        
        //10
        age=24;
        System.out.println(25<=age);
        
        //11
        
		height=168.5;
		weight=64.2;
		
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);
		
		System.out.println(strAge+strHeight+strWeight);
		
		//12
		int intAge = Integer.parseInt(strAge);
		int intHeight = (int)Double.parseDouble(strHeight);
		System.out.println(intAge);
		System.out.println(intHeight);
		
		//13
		System.out.println(25==intAge||160<=intHeight);

	}
}
