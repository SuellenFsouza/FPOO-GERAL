
public class Main {

	public static void main(String[] args) {
		
		OperadoresRelacionais objRelacionais = new OperadoresRelacionais();
		TesteDecisao objTeste = new TesteDecisao();
		DecisaoComposta objcomposta = new DecisaoComposta();
		Textos objTextos = new Textos();
		estruturaDecisaoTexto objDecisaoTexto = new estruturaDecisaoTexto();
		//objRelacionais.testesLogicos();
		
		
		//objTeste.testeMenor(0, 8);
		//objTeste.testeMenorIgual(10,89);
		//objTeste.testeMaior(60, 10);
		//objTeste.testeMaiorIgual(300, 2);
		//objTeste.testeIgual(80, 80);
		//objTeste.testeDiferente(20, 45);
		
		
		/* objcomposta.testeMenor(1000, 100);
		 */
		 
		//objTextos.testesLogicos();
		objDecisaoTexto.testeVazio("SESI/SENAI - DESENVOLVIMENTO DE SISTEMAS");
		objDecisaoTexto.testeIgual("SES" , "SENAI");
        objDecisaoTexto.testeIgual("SESI", "SENAI");
        objDecisaoTexto.contador("suellen1234");
		

	}

}
