
public class OperadoresLogicos {
	public void testesLogicos() {
		/* 
	    OPERADORES L�GICOS:
	    && --> AND -> E
	    || -> OR ->OU
	    ! -> NOT -> N�O*/
		
		int idadeInicio = 18;
		int idadeFim = 90;
		boolean resultado;
		
		/* 
		  VERIFICA SE A IDADE DA PESSOA EST� ENTRE
		  18 E 90 ANOS 
		 */
		
		resultado = (idadeInicio >= 18) && (idadeFim <=90);
		System.out.println(resultado);
		
		idadeInicio =17;
		resultado = (idadeInicio >= 18) && (idadeFim <=90);
		System.out.println(resultado);
		
		/*
		  VERIFICA SE A IDADE DA PESSOA EST� ENTRE
		  18 OU 90 ANOS   */
		
		idadeInicio =18;
		resultado = (idadeInicio >= 18) || (idadeFim <=90);
		System.out.println(resultado);
		
		idadeInicio =17;
		resultado = (idadeInicio >= 18) || (idadeFim <=90);
		System.out.println(resultado);
		
		
	}

}
