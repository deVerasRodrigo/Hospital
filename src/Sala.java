public class Sala {
    private String numeroDaSala;

    public String getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(String numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public Sala(String numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public void reservar(int dia, int mes, int ano){
        System.out.printf("Sala %s reservada para o dia %02d/%02d/%04d\n", this.numeroDaSala,dia, mes, ano);
    }


}
