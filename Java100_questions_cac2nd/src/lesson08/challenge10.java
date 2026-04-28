package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {
	int energy;
	String name;
	int water;

	void pumpWater() {
		System.out.println("水を" + water + "リットル出しました。");
	}

	void setWater(int water) {
		this.water = water;
	}

	void randomWater() {
		water = (int) (Math.random() * 9) + 1;
	}

	void makeOmelet(int eggNum, int butterNum) {
		int eggSet = eggNum / 2;
		int butterSet = butterNum / 5;

		int result = Math.min(eggSet, butterSet);
		System.out.println(result + "人分のオムレツを作成しました。");
	}

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {

		if (flourNum >= 200 && sugarNum >= 10 && eggNum >= 2 && butterNum >= 5) {
			return "ラーメン";

		} else if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			return "クッキー";

		} else if (eggNum >= 2 && butterNum >= 5) {
			return "オムレツ";

		} else if (eggNum >= 1) {
			return "ゆで卵";
		}

		return null;
	}
}

public class challenge10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力
		System.out.print("小麦粉の量（g）＞");
		int flourNum = Integer.parseInt(br.readLine());

		System.out.print("砂糖の量（g）＞");
		int sugarNum = Integer.parseInt(br.readLine());

		System.out.print("卵の個数＞");
		int eggNum = Integer.parseInt(br.readLine());

		System.out.print("バターの量（g）＞");
		int butterNum = Integer.parseInt(br.readLine());

		// 処理
		Robot robot = new Robot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);

		// 出力
		if (menu == null) {
			System.out.println("何も作れません。");
		} else {
			System.out.println(menu + "が出来ました。");
		}
	}
}
