public class Questao4 {
	public static void main(String[] args) {
		try {
			int i = (int) Math.random();
			int j = 10 / i;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
//erro de dividir por zero, pois random gera um numero entre 0 e 1 e random reduz pra zero.