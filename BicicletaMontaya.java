public  class BicicletaMontaya extends Bicicleta{
    private int cantidadSuspensiones;

    public BicicletaMontaya(String codigoBici, int anioFabrica, double peso, int cantidadSuspensiones) {
        super(codigoBici, anioFabrica, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if (cantidadSuspensiones > 1) {
            costoBase += costoBase * 0.15;
        }
        return costoBase;
    }
}
