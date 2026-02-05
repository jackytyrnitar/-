package carriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();//"パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		String[] products = input.split("、");

		Random random = new Random();
		//実行回数を保持する変数の宣言
		int count = 0;

		int tvcount = random.nextInt(11);

		for (String product : products) {
			count = random.nextInt(11);

			switch (product) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + count + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + count + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + count + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + count + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + count + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.print(product + "の残り台数は");
				System.out.println(product.equals("テレビ") ? tvcount + "台です" : 11 - tvcount + "台です");
				break;
			default:
				System.out.println("『" + product + "』は指定の商品ではありません");
				break;

			}
			System.out.println();
		}
	}
}
