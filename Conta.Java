package com.alura;

class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposita(double valor) {
    	this.saldo = this.saldo + valor;
    }
    

    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
    }
}

