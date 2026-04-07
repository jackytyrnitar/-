package carriculum_29main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import carriculum_29model.Prefecture;

public class PrefectureMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     Scanner scanner = new Scanner(System.in);

		// 元データ
		String[] prefectureData = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};

		// 全都道府県をオブジェクト化してリストに格納
		List<Prefecture> prefectureList = new ArrayList<>();

		for (String data : prefectureData) {
			String[] splitData = data.split(":");
			String prefectureName = splitData[0];
			String capitalCity = splitData[1];
			int area = Integer.parseInt(splitData[2]);

			Prefecture prefecture = new Prefecture(prefectureName, capitalCity, area);
			prefectureList.add(prefecture);
		}

		// 番号一覧表示
		System.out.println("都道府県を番号で選んでください（複数選択可、カンマ区切り）");
		for (int i = 0; i < prefectureList.size(); i++) {
			System.out.println(i + " : " + prefectureList.get(i).getPrefectureName());
		}

		System.out.println();
		System.out.println("入力例：0,3,5");
		String numberInput = scanner.nextLine();

		System.out.println("昇順または降順を入力してください");
		String sortOrder = scanner.nextLine();

		// 選択された都道府県を格納するリスト
		List<Prefecture> selectedList = new ArrayList<>();

		String[] selectedNumbers = numberInput.split(",");

		for (String numStr : selectedNumbers) {
			int index = Integer.parseInt(numStr.trim());

			if (index >= 0 && index < prefectureList.size()) {
				selectedList.add(prefectureList.get(index));
			}
		}

		// 面積でソート
		Collections.sort(selectedList, new Comparator<Prefecture>() {
			@Override
			public int compare(Prefecture p1, Prefecture p2) {
				return Integer.compare(p1.getArea(), p2.getArea());
			}
		});

		// 降順なら逆順にする
		if (sortOrder.equals("降順")) {
			Collections.reverse(selectedList);
		}

		// 結果表示
		System.out.println();
		System.out.println("ソート結果");
		for (Prefecture prefecture : selectedList) {
			prefecture.display();
		}

		scanner.close();
	}

	
	
	}


