package carriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (true) {
			name = scanner.nextLine(); // 1行の文字列を取得

			// 文字数制限 (10文字以下)
			if (name == null || name.length() == 0) {
				System.out.println("「名前を入力してください」");
			} else if (name.length() >= 10) {
				System.out.println("「名前を10文字以内にしてください」");
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
			} else {
				System.out.println("「ユーザー名「" + name + "」を登録しました」");
				break;
			}
		}
		scanner.close();
		
		//じゃんけん開始
		String[] hands = new String[3];
		hands[0] = "グー";
		hands[1] = "チョキ";
		hands[2] = "パー";
		Random random = new Random();
		//実行回数を保持する変数の宣言
		int count = 1;
		
		//じゃんけんのコード
		while (true) {
			int myhand = random.nextInt(3);
			int yourhand = random.nextInt(3);
			
			System.out.println(name + "の手は「" + hands[myhand] + "」");
			System.out.println("相手の手は" + "「" + hands[yourhand] + "」\n");
			if (myhand == 1 && yourhand == 0) {
				//ユーザーがチョキ　相手がグー
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！\n");
			} else if (myhand == 2 && yourhand == 1) {
				//ユーザーがパー　相手がチョキ
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ\n");
			} else if (myhand == 0 && yourhand == 2) {
				//ユーザーがグー　相手がパー
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです\n");
			} else if (myhand == yourhand) {
				//あいこの場合
				System.out.println("DRAW あいこ もう一回しましょう！\n");
			} else {
				//勝った場合
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて\n");
				break;
			}
			
			count++;
			
		
		}
		
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}

}
