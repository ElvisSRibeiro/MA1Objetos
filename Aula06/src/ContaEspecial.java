
public class ContaEspecial extends Conta {

    public ContaEspecial(double pValor){
    	//usa o construtor da classe mae
        super(pValor);

    }

    @Override
    public void Sacar(double pValor){

        saldo=saldo-(pValor + pValor*0.01);

    }

}