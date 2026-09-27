import java.util.List;

public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    public static void main(String[] args){

        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        // 1. Instanciar bicicletas
        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontaya m1 = new BicicletaMontaya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontaya m2 = new BicicletaMontaya("BIC-M02", 2020, 12.0, 1);

        // 2. Marcar BIC-E01 con garantía extendida
        e1.activarGarantiaExtendida();

        // 3. Registrar bicicletas en el gestor
        gestor.registrarBicicleta(e1);
        gestor.registrarBicicleta(e2);
        gestor.registrarBicicleta(m1);
        gestor.registrarBicicleta(m2);

        System.out.println("\n=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");
        List<Bicicleta> encontradas = gestor.buscarBicicletasPorCodigo("BIC-E01");
        for (Bicicleta b : encontradas) {
            if (b instanceof BicicletaElectrica) {
                BicicletaElectrica be = (BicicletaElectrica) b;
                System.out.println("Tipo: Bicicleta Eléctrica | Código: " + be.getCodigoBici() + " | Año: " + be.getAnioFabrica() +
                        " | Peso: " + be.getPeso() + " kg | Autonomia: " + (int)be.getAutonomiaKilometro() +
                        " km | Bateria certificada: " + (be.isBateriaCertificada() ? "Si" : "No"));
                System.out.println("  Garantia extendida: " + (be.tieneGarantiaActiva() ? "Si" : "No") +
                        " | Costo mantención: $" + (int)be.calcularCostoMantencion());
            } else if (b instanceof BicicletaMontaya) {
                BicicletaMontaya bm = (BicicletaMontaya) b;
                System.out.println("Tipo: Bicicleta de Montaña | Código: " + bm.getCodigoBici() + " | Año: " + b.getAnioFabrica() +
                        " | Peso: " + bm.getPeso() + " kg | Suspensiones: " + bm.getCantidadSuspensiones());
                System.out.println("  Costo mantención: $" + (int)bm.calcularCostoMantencion());
            }
        }
        System.out.println("---");

        System.out.println("\n=== LISTADO DE BICICLETAS ===");
        for (Bicicleta b : gestor.getBicicletas()) {
            System.out.println(b.toString()); // Llama al método que solo muestra código y año
        }
    }



}
