import java.util.*;

public class Questao7 {
	public static void main(String args[]) {
		TreeSet<Number> numeros = new TreeSet<>();
		numeros.add(new Integer(5));
		numeros.add(8);
		numeros.add(new Double(5.9));
		numeros.add(null);
		for (Number num : numeros)
			System.out.println("Num: " + num);
	}
}
