/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしています。");
		System.out.println("\n売り上げの割合\n売上合計    \\" + totalamount + "円");

		System.out.println("\n内訳");
		System.out.println(
				"シトロン      \\" + (int) (citron * 250) + "・・・" + (int) ((250 * citron) / totalamount * 100) + "%");
		System.out.println(
				"ショコラ      \\" + (int) (chocolate * 280) + "・・・" + (int) ((280 * chocolate) / totalamount * 100) + "%");
		System.out.println(
				"ピスターシュ  \\" + (int) (pistache * 320) + "・・・" + (int) ((320 * pistache) / totalamount * 100) + "%");

	}
}
