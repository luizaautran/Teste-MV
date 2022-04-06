package teste;

public class Aplicacao
{

	public static void main(String[] args)
	{
		Conexao con = new Conexao();
		if(!con.conecta()){
			return;
		}

	}

}