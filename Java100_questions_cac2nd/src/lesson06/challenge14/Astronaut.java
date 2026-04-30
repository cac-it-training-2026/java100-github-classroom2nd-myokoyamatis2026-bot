/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題14 Mathクラス②（MAX）
 *
 * 地球に戻れるかどうかは航続距離がどれくらいあるかも
 * 関係しています。航続距離（○○光年）より燃料が上回っていれば
 * どうやら目的地までたどり着けるようです。
 *
 * 宇宙船クラス（Spaceship）に燃料タンク(fuel)とsetter、getterを記述し、
 * メソッドpublic boolean compareFuel(double fuelNum, double lightYear)を
 * 記述してください。compareFuelメソッドは燃料が上回っていればtrue、
 * 下回っていればfalseを返します。
 *
 * <実行例1>
 *
 * 宇宙飛行士：
 * 航続距離が気になるな～。
 * 燃料と比べてみるか。
 *
 * 航続距離を入力してください＞200
 * 燃料を入力してください＞200.01
 *
 * 宇宙飛行士：
 * よし！たどり着けるぞ。
 *
 * <実行例2>
 *
 * 宇宙飛行士：
 * 航続距離が気になるな～。
 * 燃料と比べてみるか。
 *
 * 航続距離を入力してください＞200
 * 燃料を入力してください＞199.99
 *
 * 宇宙飛行士：
 * これじゃあたどり着けないよう。どうしよう。。。
 *
 */

package lesson06.challenge14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Spaceship {
	private double fuel;//宇宙船の燃料の保持

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public boolean compareFuel(double fuelNum, double lightYear) {//燃料と航路距離を比較して到達可能か判定
		boolean isCheck = false;
		double answer = Math.max(fuelNum, lightYear);//大きい方を取得する
		if (answer == fuelNum) {
			isCheck = true;
		}
		return isCheck;
	}

}

//ここにSpaceshipクラスを記述する

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.println("宇宙飛行士：");
		System.out.println("航続距離が気になるな～。");
		System.out.println("燃料と比べてみるか。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("航続距離を入力してください＞");
		String lightYearStr = br.readLine();
		double lightYear = Double.parseDouble(lightYearStr);

		System.out.print("燃料を入力してください＞");
		String fuelStr = br.readLine();
		double fuelNum = Double.parseDouble(fuelStr);

		Spaceship spaceship = new Spaceship();
		//ここに適切な処理を記述する

		boolean isCheck = false;//ブーリアン型のやつ

		isCheck = spaceship.compareFuel(fuelNum, lightYear);//メイン側で結果を受け取っている
		//ここに適切な処理を記述する

		System.out.println("\n宇宙飛行士：");
		if (isCheck) {
			System.out.println("よし！たどり着けるぞ。");
		} else {
			System.out.println("これじゃあたどり着けないよう。どうしよう。。。");
		}
	}
}
