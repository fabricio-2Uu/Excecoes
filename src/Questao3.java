 public class Questao3{
    public static void main(String args[]) {
      int i = 5571;
      try {
      i = i / 0;
      } catch (ArithmeticException e){
    	  System.out.println("Exce��o Aritm�tica.");
    	  e.printStackTrace();
      }
      System.out.println("O resultado " + i);
    }
}
//tentou dividir por zero, deu erro aritim�tico.