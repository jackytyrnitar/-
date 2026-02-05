package carriculum_B;

import java.util.Scanner;

public class Qes_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		do {
			System.out.println("生徒の人数を入力してください（2以上）: ");
			N = sc.nextInt();
		} while (N < 2);

		// 点数を格納する配列
		int[][] scores = new int[N][4]; // N人 × 4科目
		String[] subjects = { "英語", "数学", "理科", "社会" };

		// 入力
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
				scores[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// 各生徒の平均
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += scores[i][j];
			}
			double avg = (double) sum / 4;
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f", avg) + "です。");
		}
		System.out.println();

		// 各教科の平均
		for (int j = 0; j < 4; j++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += scores[i][j];
			}
			double avg = (double) sum / N;
			System.out.println(subjects[j] + "の平均点は" + String.format("%.2f", avg) + "です。");
		}
		

		int totalSum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				totalSum += scores[i][j];
			}

		}
		double toalAvg = (double) totalSum / (N * 4);
		System.out.println("全体の平均点は" + String.format("%.2f", toalAvg) + "です。");
		sc.close();
	}
}
