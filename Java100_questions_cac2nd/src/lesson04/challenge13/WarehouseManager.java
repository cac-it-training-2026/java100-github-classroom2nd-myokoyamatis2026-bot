/**
 * 第4章 倉庫番のお仕事
 *
 * 問題13 あいさつロボット
 *
 * XO商事では来客対応用にあいさつロボット「MISAKI○」を
 * 中古で購入しました。
 * しかし残念なことに前のオーナーが寿司屋だったらしく
 * MISAKI○には寿司屋用のあいさつ音声しか入っていません。
 *
 * そこでYさんは、MISAKI○の音声を録音し直すことにしました。
 * 音声のパターンは全部で三つあり、それぞれ
 *
 * 1...お客様が来社された時のあいさつ
 * 2...ご用件をうかがう際のあいさつ
 * 3...お客様がお帰りになる時のあいさつ
 *
 * となっています。
 * ただし、三つのパターンのうち、
 * 変更できるパターンは一つだけです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Yさん：
 *  まず、MISAKI○の今の状態を確かめようかな。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「何にしますか！今日は活きのいいコハダが入ってますよ」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  うわぁ～。どれか変更しよう。
 *
 *  どのパターンを変更しますか＞2
 *
 *  あいさつを吹き込んでください＞ご用件をお伺い致します。
 *
 *  Yさん：
 *  よし。もう一度確かめてみよう。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「ご用件をお伺い致します。」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  まあ少しはマシになったかな。
 *
 */

package lesson04.challenge13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		//配列の宣言および初期化処理を記述する
		String[] messagesall = { "「へい！らっしゃい！！」", "「何にしますか！今日は活きのいいコハダが入ってますよ」", "「まいどあり！！またどうぞ」" };

		System.out.println("Yさん：");
		System.out.println("まず、MISAKI○の今の状態を確かめようかな。\n");

		for (int i = 0; i < messagesall.length; i++) {
			System.out.println("あいさつパターン" + (i + 1) + "..." + messagesall[i]);
		}
		//三つのあいさつパターンの出力処理を記述する

		System.out.println("Yさん：");
		System.out.println("うわぁ～。どれか変更しよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("どのパターンを変更しますか＞");
		//入力処理および入力値の代入処理
		String Numstr = br.readLine();
		int Num = Integer.parseInt(Numstr) - 1;

		System.out.print("あいさつを吹き込んでください＞");
		String word = br.readLine();

		messagesall[Num] = word;

		System.out.println("\nYさん：");
		System.out.println("よし。もう一度確かめてみよう。\n");

		//三つのあいさつパターンの出力処理を記述する
		for (int i = 0; i < messagesall.length; i++) {
			System.out.println("あいさつパターン" + (i + 1) + "..." + messagesall[i]);
		}
		System.out.println("Yさん：");
		System.out.println("まあ少しはマシになったかな。");
	}
}
