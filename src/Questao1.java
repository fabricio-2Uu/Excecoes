import javax.swing.plaf.synth.SynthSpinnerUI;

public class Questao1 {
  public static void main(String[] args) {
   	   Telefone telefones[] = new Telefone[5];
   	   telefones[0] = new Telefone();
   	   telefones[2] = new Telefone(51, 55667788);
   	   for (int i = 0; i < telefones.length; i++) {
   		   try {
		    System.out.println(telefones[i].toString());
   		   } catch(NullPointerException e){
   			   System.out.println("Posi��o Inv�lida.");
   		   }
	   }
  }
}

///Imprime o primeiro, por�m como n�o h� valor para a segunda posi��o do vetor telefones d� erro de 
///nullpointer.
