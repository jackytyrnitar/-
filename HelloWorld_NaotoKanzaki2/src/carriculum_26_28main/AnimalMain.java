package carriculum_26_28main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import carriculum_26_28model.Animal;

public class AnimalMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		// 学名を管理するMap
		Map<String, String> scientificNameMap = new HashMap<>();
		scientificNameMap.put("ライオン", "パンテラ レオ");
		scientificNameMap.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNameMap.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNameMap.put("チンパンジー", "パン・トゥログロディテス");
		scientificNameMap.put("シマウマ", "チャップマンシマウマ");
		scientificNameMap.put("インコ", "不明");

		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();

		// 1匹ごとのデータに分割
		String[] animalDataList = input.split(",");

		// 分割したデータを順番に処理
		for (String animalData : animalDataList) {
			String[] data = animalData.split(":");

			String name = data[0];
			double length = Double.parseDouble(data[1]);
			int speed = Integer.parseInt(data[2]);
			String scientificName = scientificNameMap.getOrDefault(name, "不明");

			Animal animal = new Animal(name, length, speed, scientificName);
			animal.display();
		}

		scanner.close();
	}
		

	
}

