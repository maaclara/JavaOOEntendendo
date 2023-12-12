package bytebank_encapsulado;

public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total;
   
   
   public Conta(int agencia, int numero) {
	   Conta.total++;
	   System.out.println("o total de conta é " + Conta.total);
	   this.agencia = agencia;
	   this.numero = numero;
	   System.out.println("estou criando uma conta " + this.numero);
   }
    
    public void deposita(double valor) {
    	this.saldo = this.saldo + valor; 
    	}
    
    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) { 
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public double pegaSaldo() {
    	return this.saldo;
    	
    }
    
    public int getNumero() {
    	return this.numero;
   
    }
    
    public void setNumero(int numero){
    	this.numero = numero;
    	
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
  
}
    
