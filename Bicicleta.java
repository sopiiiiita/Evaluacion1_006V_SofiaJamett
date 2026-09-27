public abstract class Bicicleta {
    private String codigoBici;
    private int anioFabrica;
    private double peso;

    public Bicicleta(String codigoBici, int anioFabrica, double peso) {
        this.codigoBici = codigoBici;
        this.anioFabrica = anioFabrica;
        this.peso = peso;
    }

    public String getCodigoBici() {
        return codigoBici;
    }

    public void setCodigoBici(String codigoBici) {

        if (codigoBici == null || codigoBici.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de bicicleta no puede ser nulo ni vacío.");
        }
        this.codigoBici = codigoBici;
    }

    public int getAnioFabrica() {
        return anioFabrica;
    }

    public void setAnioFabrica(int anioFabrica) {

        if (anioFabrica < 2000 || anioFabrica > 2026) {
            throw new IllegalArgumentException("El año de fabricación debe estar entre 2000 y 2026.");
        }
        this.anioFabrica = anioFabrica;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }
        this.peso = peso;
    }

    public double calcularCostoMantencion(){

        return 0;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBici='" + codigoBici + '\'' +
                ", anioFabrica=" + anioFabrica +
                '}';
    }
}
