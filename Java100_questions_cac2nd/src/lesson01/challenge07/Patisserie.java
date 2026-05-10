/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		double citronStock = 30;
		double chocolatStock = 30;
		double pistacheStock = 30;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		double citron = Double.parseDouble(reader.readLine());

		System.out.print("ショコラ      >");
		double chocolate = Double.parseDouble(reader.readLine());

		System.out.print("ピスターシュ  >");
		double pistache = Double.parseDouble(reader.readLine());

		System.out.println("\nシトロン     " + citron + "個");
		System.out.println("ショコラ     " + chocolate + "個");
		System.out.println("ピスターシュ " + pistache + "個");

		System.out.println("合計個数    " + (citron + chocolate + pistache) + "個");
		int totalamount = (int) ((citron * 250) + (chocolate * 280) + (pistache * 320));
		System.out.println("合計金額    " + totalamount + "円");

		System.out.println("\nをお買いあげですね。\n承りました。");

		int citroninteger = (int) (citronStock - citron);
		int chocolateinteger = (int) (chocolatStock - chocolate);
		int pistacheinteger = (int) (pistacheStock - pistache);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citroninteger + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateinteger + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheinteger + "個");
	}
}
