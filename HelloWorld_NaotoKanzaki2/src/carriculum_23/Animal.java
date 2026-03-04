package carriculum_23;

public class Animal {

	//それぞれをカプセル化
	// 動物名のフィールド
    private String name;
    //体長のフィールド
    private double length;
    //速度のフィールド
    private int speed;

    // 動物名のsetter
    public void setName(String name) {
        this.name = name;
    }
    //体長のsetter
    public void setLength(double length) {
        this.length = length;
    }
    //速度のsetter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // それぞれのgetter
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }
}

