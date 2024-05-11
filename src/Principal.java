public class Principal {
    public static void main(String[] args) {


        veiculo carro = new veiculo (2013,"Corsa", "Branco", 35000);


        System.out.println(carro.VerificaManutencao());
        System.out.println("Cor: "+ carro.exibirCor());
        carro.mudarCor ("Preto");
        System.out.println("Nova Cor: "+ carro.exibirCor());

    }
}
