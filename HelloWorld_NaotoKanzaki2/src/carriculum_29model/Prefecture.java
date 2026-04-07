package carriculum_29model;

public class Prefecture {

		private String prefectureName;
		private String capitalCity;
		private int area;

		public Prefecture(String prefectureName, String capitalCity, int area) {
			this.prefectureName = prefectureName;
			this.capitalCity = capitalCity;
			this.area = area;
		}

		public String getPrefectureName() {
			return prefectureName;
		}

		public String getCapitalCity() {
			return capitalCity;
		}

		public int getArea() {
			return area;
		}

		public void display() {
			System.out.println("都道府県名：" + prefectureName);
			System.out.println("県庁所在地：" + capitalCity);
			System.out.println("面積：" + area);
			System.out.println();
		}
	}

