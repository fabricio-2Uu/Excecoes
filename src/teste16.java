import java.util.NoSuchElementException;

public class teste16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaLista<String> l1 = new MinhaLista();
		Object o1 = new Object();
		
		l1.adicionar(0, "A");
		l1.adicionar(0, "B");
		l1.adicionar(3, "C");
		
		System.out.println(l1.getFirst());
		
		try {
		l1.remover("A");
		System.out.println(l1.totalizar());
		l1.remover("B");
		System.out.println(l1.totalizar());
		l1.remover("C");
		l1.remover("A");
		l1.remover("A");
		} catch (Exception e){
			System.out.println("Elemento não encontrado.");
		}
		
		System.out.println(l1.totalizar());
		System.out.println(l1.listar());
		
		System.out.println(l1.getFirst());
		
		l1.getLast();
		

	}

}
