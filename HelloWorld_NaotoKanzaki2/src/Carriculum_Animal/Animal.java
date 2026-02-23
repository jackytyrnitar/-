package Carriculum_Animal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Carriculum_dog.Dog;

public class Animal {

	public static void main(String[] args) {
 // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	Dog dog1 = new Dog();
	System.out.println(dog1.AnimalName);	
 // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
	Dog dog2 = new Dog(3);
	System.out.println(dog2.AnimalAmount);
 // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
    String formattedDate = now.format(formatter);
    System.out.println(formattedDate);
	}

}
