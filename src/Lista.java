
public interface Lista<E> {

	public void adicionar(int indice, E obj);
	public boolean remover(E obj);
	public String listar();
	public int totalizar();
	public E getFirst();
	public E getLast();

}
