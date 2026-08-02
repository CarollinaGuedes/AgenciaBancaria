package Banco;

public class PessoaFisica extends DadosClientes implements Autenticacao{

    public PessoaFisica(String nomeCompleto, String profissao, String endereco, String telefone, String email, int salario) {
        super(nomeCompleto, profissao, endereco, telefone, email, salario);
    }



    @Override
    public void creditoExtra() {
        System.out.println("O clinte" + nomeCompleto + "o seu crédito já está liberado no valor de R$ " + limiteDeCredito);
    }


    String senha = "123456";

    @Override
    public boolean autenticar(String senhaDigitada) {

        if (senhaDigitada.equals(senha)) {
            return true;
        }

        return false;
    }
}


