/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題8  材料によって作るメニューを変える
 *
 * 引数として渡された食材の分量を計算して
 * 的確な料理を返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  もうちょっと高度な調理機能が欲しいですね。
 *
 *  G博士：
 *  では材料の分量に応じて作るメニューを変える機能を入れてみようかの。
 *
 *  Rさん：
 *  そんなことが出来るんですか！
 *
 *  G博士：
 *  出来るとも。小麦粉170g、砂糖50g、卵1個、バター80gがそろえばクッキーを作る。
 *
 *  G博士：
 *  クッキーが出来ない場合で、卵2個、バター5gがそろえばオムレツを作る。
 *
 *  G博士：
 *  卵のみの場合はゆで卵を作る。
 *
 *  G博士：
 *  それ以外の場合は何も作らないようにするんじゃ。
 *
 *  Rさん：
 *  それは凄そうですね。完成をお待ちしています。
 *
 *  G博士：
 *  ......出来たぞ！早速動かしてみよう。
 *
 *  小麦粉の量を入力してください（グラム）＞○
 *
 *  砂糖の量を入力してください（グラム）＞○
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  <料理を作成する条件を満たす場合の実行例>
 *  【※調理できる料理】が出来ました。
 *
 *  <料理を作成する条件を満たさない場合の実行例>
 *  何も作れません。
 *
 */

package lesson05.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題7で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：makeEggDishes(引数int flourNum, int sugarNum, int eggNum, int butterNum、
//戻り値String、作成できるメニューを戻り値として返す。また、作成できるメニューが無い場合はnull値を返す)

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
		int flour = flourNum - 170;
		int sugar = sugarNum - 50;
		int egg = eggNum - 2;
		int butter = butterNum - 80;

		if (flour >= 0 && sugar >= 0 && egg >= -1 && butter >= 0) {
			return "クッキー";
		} else if (egg >= 0 && butter >= -75) {
			return "オムレツ";
		} else if (egg >= -1) {
			return "ゆで卵";
		}
		return null;
	}
}

public class RobotMaker {

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
		if (menu != null) {
			System.out.println(menu + "が出来ました。");
		} else {
			System.out.println("何も作れません。");
		}
	}
}
