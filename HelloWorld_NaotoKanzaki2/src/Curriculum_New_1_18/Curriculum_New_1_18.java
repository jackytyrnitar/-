package Curriculum_New_1_18;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	static void q1(String str, int num) {
		System.out.println(str + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void q2(int numkake1, int numkake2) {
		System.out.println(numkake1 * numkake2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void q3(int[] numhairetsu) {
		System.out.println(Arrays.toString(numhairetsu));
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void q2(double numtasu1, double numtasu2) {
		System.out.println(numtasu1 + numtasu2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] q5(int numrandom) {
		int[] randomhako = new int[numrandom];
		Random random = new Random();
		for (int i = 0; i < numrandom; i++) {
			int s = random.nextInt(100) + 1;
			randomhako[i] = s;
		}
		System.out.println(Arrays.toString(randomhako));
		return randomhako;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double q6(int[] randomhako) {
		int sum = 0;
		for (int i = 0; i < randomhako.length; i++) {
			sum += randomhako[i];

		}
		double avg = (double) sum / randomhako.length;
		System.out.println(avg);
		return avg;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean q7(double avg) {
		boolean result = avg >= 50;
		System.out.println(result);
		return result;
	}
	
	
	
	
public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		q1("Hello JavaSE", 11);
		q2(2, 4);
		int[] numhairetsu = { 4, 5, 6 };
		q3(numhairetsu);
		q2(1.3, 1.2);
		int[] randomhako = q5(5);
		double randAvg = q6(randomhako);
		q7(randAvg);
		
	}

}
