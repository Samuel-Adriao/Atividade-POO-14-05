public class ContaBancaria {

//Atributods
private int numeroConta;
private String titular;
private double saldo;

//Construtores
ContaBancaria(){

}

ContaBancaria(int numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
}

//getters e setters
public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
}

public int getNumeroConta(){
    return numeroConta;
}

public void setTitular(String titular){
    this.titular = titular;
}

public String getTitular(){
    return titular;
}

public double getSaldo(){
    return saldo;
}

//Métodos
public void depositar(double valor){
    this.saldo += valor;
}

public boolean sacar(double saque){
        if(this.saldo >= saque){
            this.saldo -= saque;
            System.out.println("Operação bem-sucedida!");
            System.out.println("Seu saldo agora é de: " + getSaldo());
            return true;
        }else{
            System.out.println("Operação negada!");
            System.out.println("Seu saldo é de apenas " + getSaldo());
            return false;
        }
}


}
