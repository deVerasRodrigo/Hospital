import java.util.List;

public final class ClinicoGeral extends Medico{
    public ClinicoGeral() {
    }
    public ClinicoGeral(String nome, Integer idade, String id) {
        super(nome, idade, id);
    }

    @Override
    public final String realizarDiagnostico(List<String> sintomas) {
        String[] diagnosticos = {"Pedra nos rins", "Hérnia", "Úlcera"};
        return diagnosticos[getRandom().nextInt(2)];
    }

}
