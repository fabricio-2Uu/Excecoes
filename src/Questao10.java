public class Questao10 {
	public static Object criaObjeto() {
		return null;
	}

	public static void main(String[] args) {
		try {
			Object obj = criaObjeto();
			System.out.println(obj.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
