package game_character;

public class CharacterBase {

  //名前とステータスの変数を定義
	private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;
    
    
  //コンストラクタを作成
    public CharacterBase(String name) {
    	this.name = name;
    }
    
  //gettrとsetter
    public String getName() {
    	return name;	
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getHp() {
    	return hp;
    }
    
    public void setHp(int hp) {
    	this.hp = hp;
    }
    
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
    
    public int getAttack() {
    	return attack;
    }
    
    public void setAttack(int attack) {
    	this.attack = attack;	
    }
    
    public int getSpeed() {
    	return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getDefense() {
    	return defense;
    }
    
    public void setDefense(int defense) {
    	this.defense = defense;
    }
}
