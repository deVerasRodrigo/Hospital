import java.util.List;

public final class Cirurgiao extends Medico{

    public Cirurgiao() {
    }

    public Cirurgiao(String nome, Integer idade, String id) {
        super(nome, idade, id);
    }

    @Override
    public final String realizarDiagnostico(List<String> sintomas) {
        String[] diagnosticos = {"Fratura exposta", "Hemorragia interna", "Fraturas múltiplas"};
        return diagnosticos[getRandom().nextInt(2)];
    }
}
