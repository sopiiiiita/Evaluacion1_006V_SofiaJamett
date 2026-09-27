public class BicicletaElectrica extends Bicicleta implements IConGarantiaExtendida {

    private double autonomiaKilometro;
    private boolean bateriaCertificada;
    private boolean garantiaActivada;


    public BicicletaElectrica(String codigoBici, int anioFabrica, double peso, double autonomiaKilometro, boolean bateriaCertificada) {
        super(codigoBici, anioFabrica, peso);
        this.autonomiaKilometro = autonomiaKilometro;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaActivada = false; // Se inicializa en falso por defecto
    }


    public double getAutonomiaKilometro() {
        return autonomiaKilometro;
    }

    public void setAutonomiaKilometro(double autonomiaKilometro) {
        this.autonomiaKilometro = autonomiaKilometro;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaActivada() {
        return garantiaActivada;
    }

    public void setGarantiaActivada(boolean garantiaActivada) {
        this.garantiaActivada = garantiaActivada;
    }


    @Override
    public boolean tieneGarantiaActiva() {
        return garantiaActivada;
    }

    @Override
    public void activarGarantiaExtendida() {

        this.garantiaActivada=true;

    }

    @Override
    public double calcularCostoMantencion(){

        double costoBase = 45000;
        if (!bateriaCertificada) {
            costoBase += costoBase * 0.25;
        }

        return costoBase;

    }


}
