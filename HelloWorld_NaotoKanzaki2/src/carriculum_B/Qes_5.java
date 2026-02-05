package carriculum_B;

public class Qes_5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {
				if (j == 20) {
					System.out.print(String.format("%03d", j)  + " * " + String.format("%03d", i) + " = "+ String.format("%03d", i * j));
				} else if (j < 20) {
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = "+ String.format("%03d", i * j) + " || ");
				}
				
			}
			System.out.println(); // 改行	
		}
		
	}
}


