public class MoedaEco {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void trocaMaterial(double materialPreco, double saldo){
        saldo += materialPreco;
        this.saldo = saldo;
        System.out.println("o seu saldo com a troca é MoedaEco: "+ saldo);
    }
    public void trocaVerdura(double verduraPreco, double saldo){
        if(verduraPreco <= saldo){
            saldo -= verduraPreco;
            this.saldo = saldo;
            System.out.println("Compra realizado com sucesso!");
            System.out.println("Seu saldo atualizado é "+ saldo);
        }else{
            System.out.println("Saldo insuficiente: seu saldo é de "+ saldo);
        }
    }
}
