package carriculum_introduction2;

public class Person {

	//インスタンスフィールド
	private String name;
	 private int age;
	 private double height;
	 private double weight;
	 
	 //問題1 クラスフィールド
	 static int count = 0;

	 //コンストラクタ
	 Person(String name, int age, double height, double weight){
	  this.name = name;
	  this.age = age;
	  this.height = height;
	  this.weight = weight;
	  
	//問題2 インスタンスに対して1を足す
		 count++;
 
	 }
	 
	 public double bmi(){
	  return this.weight / this.height / this.height;
	 }

	 public void print(){
	  System.out.println("名前は" + this.name + "です");
	  System.out.println("年は" + this.age + "です");
	 }
	 
	// 問題4：クラスメソッド
		public static void printCount() {

	// 問題5：countを使って出力
		System.out.println("合計" + count + "人です");
		
		}

}
