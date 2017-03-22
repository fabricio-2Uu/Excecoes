import java.util.*;
public class Questao2 {
  public static void main(String[] args) {
   	   LinkedList<Telefone>  telefones = new LinkedList<Telefone>();
   	   try {
   	   telefones.add(new Telefone());
   	   telefones.add(new Telefone(51, 55667788));
   	   telefones.add(3, new Telefone(55, 33445566));
   	   } catch (Exception e){
   		   System.out.println("Índice com referência nula.");
   		   System.out.println(e.getCause());
   		   System.out.println(e.getMessage());
   	   }
   	   try {
   	   	   telefones.remove(0);
   	   	   telefones.remove(0);
   	   	   telefones.remove(1);
   	   }catch (IndexOutOfBoundsException e){
   		   System.out.println("Índice com referência nula. Tamanho do vetor: " + telefones.size());
   	   }
  }
}
///tentou adicionar elemento ao índice 3, porém o tamanho do índice até o momento era de 2 elementos.
///Depois tenta remover elemento do índice 1, porém o tamanho do índice até o momento era de 0 elementos.