import java.util.List;

public final class Neuro extends Medico{
    public Neuro() {
    }

    public Neuro(String nome, Integer idade, String id) {
        super(nome, idade, id);
    }

    @Override
    public final String realizarDiagnostico(List<String> sintomas) {
        String[] diagnosticos = {"Aneurisma", "AVC", "Distonia"};
        return diagnosticos[getRandom().nextInt(2)];
    }

}
