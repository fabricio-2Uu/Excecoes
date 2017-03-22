import java.io.*;
import javax.swing.*;

public class Questao12 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
			System.out.println("Número:" + num);
			switch (num) {
			case 1:
				System.out.println("3");
				int valor1 = Integer.parseInt("abc");
				System.out.println(valor1);
			case 2:
				System.out.println("4");
				String palavras[] = { "casa", "apto", "morada" };
				System.out.println(palavras[3]);
			case 3:
				System.out.println("5");
				double vetor[] = null;
				for (double valor : vetor) {
					System.out.println(valor);
				}
			case 4:
				System.out.println("6");
				File f = new File("c:\\teste.txt");
				f.createNewFile();
			}
		} catch (NumberFormatException e) {
			System.out.println("3.1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("4.1");
		} catch (NullPointerException e) {
			System.out.println("5.1");
		} catch (IOException e) {
			System.out.println("6.1");
		} finally {
			System.out.println("7");
		}
	}
}
