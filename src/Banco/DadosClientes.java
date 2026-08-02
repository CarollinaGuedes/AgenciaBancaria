package Banco;

public abstract class DadosClientes implements Autenticacao{

    String nomeCompleto;
    String profissao;
    String endereco;
    String telefone;
    String email;
    int salario;
    int limiteDeCredito;
    String cnpj;
    String nomeEmpresa;
    String ramoEmpresarial;


    public abstract void creditoExtra ();

    public void limiteLiberadoNaconta() {
        System.out.println("Você já pode sacar o seu limite!");
    }


    public DadosClientes(String nomeCompleto, String profissao, String endereco, String telefone, String email, int salario) {
        this.nomeCompleto = nomeCompleto;
        this.profissao = profissao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }



}


