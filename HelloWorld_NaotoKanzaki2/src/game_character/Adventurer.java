package game_character;

import java.util.Random;

public class Adventurer extends CharacterBase{

	private Random random = new Random();
	
 //コンストラクタを作成
 public Adventurer(String name) {
	 super(name);
 }
 //ステータスをランダムで設定するメソッドを作成
 public void createStatus() {
	setHp(random.nextInt(1000)+1);
	setMp(random.nextInt(1000)+1);
	setAttack(random.nextInt(1000) + 1);
    setSpeed(random.nextInt(1000) + 1);
    setDefense(random.nextInt(1000) + 1);
 }
}
