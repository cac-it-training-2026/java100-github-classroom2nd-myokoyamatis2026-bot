/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		int citron = Integer.parseInt(reader.readLine());

		System.out.print("ショコラ      >");
		int chocolate = Integer.parseInt(reader.readLine());

		System.out.print("ピスターシュ  >");
		int pistache = Integer.parseInt(reader.readLine());

		System.out.println("\nシトロン     " + citron + "個");
		System.out.println("ショコラ     " + chocolate + "個");
		System.out.println("ピスターシュ " + pistache + "個");

		System.out.println("\nをお買いあげですね。\n承りました。");
	}
}
