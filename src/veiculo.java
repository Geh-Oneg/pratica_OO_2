public class veiculo {

    //atributos
    public double Ano;
    public String Modelo;
    public String Cor;
    public int Km;

    public veiculo() {

    }

    //construtor
    public veiculo(double Ano, String Modelo, String Cor,int Km) {

        this.Ano = Ano;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Km = Km;
    }
    //métodos

    public String VerificaManutencao(){

        if (this.Km < 25000)
            return "Tudo OK !";

        else if (this.Km >= 25000 && this.Km <= 75000 )
            return "Revisão Parcial necessária !";

        return "Revisão Completa";
    }

    public void mudarCor(String cor){

        this.Cor = cor;
    }

    public String exibirCor(){

        return this.Cor;
    }


}
