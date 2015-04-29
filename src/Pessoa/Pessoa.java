package Pessoa;

public class Pessoa {
	
	 private String nome, morada, apelido;


     //

     public Pessoa(String nome)
     {
    	 nome = nome.trim();
    	 if (nome.isEmpty() || nome == null)
         {
             System.out.println("O texto inserido é nulo ou tem espaços em branco");
         }
    	 else {this.nome = nome;}
            
         
         
     }
     //


	public String getNome() {
		return nome;
	}


	public String getMorada() {
		return morada;
	}


	public String getApelido() {
		return apelido;
	}


	public void setNome(String nome) {
		
		
		nome = nome.trim();
   	 	if (nome.isEmpty() || nome == null)
        {
            System.out.println("O texto inserido é nulo ou tem espaços em branco");
        }
   	 	else {this.nome = nome;}
		
		
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
     
}
