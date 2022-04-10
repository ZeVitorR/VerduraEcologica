import java.util.Scanner;

public class VerduraEcologica{
    
      public static void main(String[] args){
        Verdura alface = new Verdura();
        Verdura Tomate = new Verdura();
        Verdura Salsa = new Verdura();
        Verdura batata = new Verdura();
        try (Scanner entrada = new Scanner (System.in)) {
            

            //-----verduras cadastradas-----//
            Salsa.verdura("Salsa", 3, 1.0);
            alface.verdura("Alface", 1, 1.5);
            Tomate.verdura("Tomate", 2, 2.0);
            batata.verdura("Batata", 4, 2.5);

            MaterialReciclavel lata = new MaterialReciclavel();
            MaterialReciclavel aluminio = new MaterialReciclavel();
            MaterialReciclavel papelao = new MaterialReciclavel();
            MaterialReciclavel garrafaPet = new MaterialReciclavel();
            MaterialReciclavel pecaQuebrada = new MaterialReciclavel();

            //-----materiais reciclaveis cadastrados-----//
            lata.materialReciclavel("Lata", 1, 3.70);
            aluminio.materialReciclavel("aluminio", 2, 6.58);
            papelao.materialReciclavel("Papelão", 3, 1.69);
            garrafaPet.materialReciclavel("Garrafa Pet", 4, 1.80);
            pecaQuebrada.materialReciclavel("pecas quebradas", 5, 10.00);

            System.out.println("---------------Seja bem vindo ao Nosso Verdura Ecológico-------------------------------");
            System.out.println("---------------Aqui você troca sua RECICLAGEM por nossas lindas VERDURAS---------------\n");
            System.out.println("Como funciona: Você troca o seu material reciclavel por nossa MoedaEco e atraves dela você pega nossa verduras");
            MoedaEco moedaCliente = new MoedaEco();
            moedaCliente.setSaldo(0.0);
            int x = 9;
            while(x != 0){
                System.out.println("\n\nEscolha a opção que deseja fazer:");
                System.out.println("0-Sair");
                System.out.println("1-Trocar material por MoedaEco");
                System.out.println("2-Trocar MoedaEco por verduras");
                System.out.println("3-Ver saldo disponivel");
                System.out.print("Diga sua opção: ");
                x = entrada.nextInt();
                if(x>0 || x < 4){
                    switch(x){
                        case 1:
                            int k;
                            double p;
                            System.out.println("\n\nEscolha o codigo do material que deseja trocar:");
                            System.out.println(lata.getCodigo()+"-"+lata.getNome()+" é preço covertido em MoedaEco:"+lata.getPrecoporkilo()+" por quilo");
                            System.out.println(aluminio.getCodigo()+"-"+aluminio.getNome()+" é preço covertido em MoedaEco:"+aluminio.getPrecoporkilo()+" por quilo");
                            System.out.println(papelao.getCodigo()+"-"+papelao.getNome()+" é preço covertido em MoedaEco:"+papelao.getPrecoporkilo()+" por quilo");
                            System.out.println(garrafaPet.getCodigo()+"-"+garrafaPet.getNome()+" é preço covertido em MoedaEco:"+garrafaPet.getPrecoporkilo()+" por quilo");
                            System.out.println(pecaQuebrada.getCodigo()+"-"+pecaQuebrada.getNome()+" é preço covertido em MoedaEco:"+pecaQuebrada.getPrecoporkilo()+" por quilo");
                            System.out.print("diga o codigo:");//aqui o funcionario da VerdurEcologico colocará a opção da troca que sera realizado
                            k=entrada.nextInt();
                            System.out.print("diga o peso:"); // aqui o funcionario da VerduraEcologica informa o peso do material do cliente
                            p=entrada.nextDouble();
                            if(k > 0 || k<6){
                                switch(k){
                                    case 1:
                                        moedaCliente.trocaMaterial(lata.getPrecoporkilo()*p, moedaCliente.getSaldo());
                                        break;
                                    case 2:
                                        moedaCliente.trocaMaterial(aluminio.getPrecoporkilo()*p, moedaCliente.getSaldo());
                                        break;
                                    case 3:
                                        moedaCliente.trocaMaterial(papelao.getPrecoporkilo()*p, moedaCliente.getSaldo());
                                        break;
                                    case 4:
                                        moedaCliente.trocaMaterial(garrafaPet.getPrecoporkilo()*p, moedaCliente.getSaldo());
                                        break;
                                    case 5:
                                        moedaCliente.trocaMaterial(pecaQuebrada.getPrecoporkilo()*p, moedaCliente.getSaldo());
                                        break;        
                                }
                                break;
                            }else{
                                System.out.println("opção inválida");
                            }
                        case 2:
                            int v,q; 
                            System.out.println("\n\nEscolha o codigo do material que deseja trocar:");
                            System.out.println(alface.getCodigo()+"-"+alface.getNome() + " é MoedaEco:"+ alface.getPreco());
                            System.out.println(Tomate.getCodigo()+"-"+Tomate.getNome() + " é MoedaEco:"+ Tomate.getPreco());
                            System.out.println(batata.getCodigo()+"-"+batata.getNome() + " é MoedaEco:"+ batata.getPreco());
                            System.out.println(Salsa.getCodigo()+"-"+Salsa.getNome()   + " é MoedaEco:"+ Salsa.getPreco());
                            System.out.print("diga o codigo:");//aqui o funcionario da VerduraEcologico colocará a opção da verdura que quer trocar a moeda
                            v=entrada.nextInt();
                            System.out.print("diga a quantidade"); // aqui o funcionario informa a quantidade de cada item comprada pelo cliente
                            q=entrada.nextInt();
                            if(v>0 || v<5){
                                switch(v){
                                    case 1:
                                        moedaCliente.trocaVerdura(alface.getPreco()*q, moedaCliente.getSaldo());
                                        break;
                                    case 2:
                                        moedaCliente.trocaVerdura(Tomate.getPreco()*q, moedaCliente.getSaldo());
                                        break;
                                    case 3:
                                        moedaCliente.trocaVerdura(Salsa.getPreco()*q, moedaCliente.getSaldo());
                                        break;
                                    case 4:
                                        moedaCliente.trocaVerdura(batata.getPreco()*q, moedaCliente.getSaldo());
                                        break;      
                                }
                                break; 
                            }else{
                                System.out.println("opção inválida");
                            }
                        case 3:
                            System.out.println("\n\no seu saldo disponível de moedaEco é "+moedaCliente.getSaldo());
                            break;
                        }
                } else {
                System.out.println("opção inválida");
                }
            }
        }
     
    }
}