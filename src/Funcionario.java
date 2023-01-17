public abstract class Funcionario extends Pessoa{
    private String id;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, String id) {
        super(nome, idade);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public abstract void baterPonto(int hora, int minuto);

    public abstract void iniciarAtendimento(Paciente paciente);
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return this.id.equals(funcionario.id);
    }
}
