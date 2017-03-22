import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinhaLista<E> implements Lista<E>{

	private LinkedList<E> minhalista;
	
	public MinhaLista(){
		this.minhalista = new LinkedList<>();
	}
	
	public void adicionar(int indice, E obj){
		try {
		this.minhalista.add(indice, obj);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Erro de índice.");
			e.printStackTrace();
			System.out.println("--------");
		}
	}
	
	public boolean remover(E obj) throws NoSuchElementException {
			return this.minhalista.remove(obj);
		
	}
	
	public String listar() {
		return this.minhalista.toString();
	}
	
	public int totalizar(){
		return this.minhalista.size();
	}
	
	public E getFirst(){
		return this.minhalista.getFirst();
	}
	
	public E getLast(){
	
		throw new NoSuchElementException();
	}

}
