package Banco;

public class PessoaJuridica extends DadosClientes implements Autenticacao{


    String cnpj;
    int faturamentoAnual;

    public PessoaJuridica(String nomeCompleto, String endereco, String telefone, String email, String cnpj, int faturamentoAnual) {
         super(nomeCompleto, "Empresa", endereco, telefone, email, 0);

        this.cnpj = cnpj;
        this.faturamentoAnual = faturamentoAnual;
    }


    @Override
    public void creditoExtra() {
        System.out.println("Por você ser um cliente empresarial, disponibilizamos um " + limiteDeCredito + "reais");
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
