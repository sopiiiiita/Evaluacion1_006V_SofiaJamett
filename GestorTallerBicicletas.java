
import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {

    private List<Bicicleta> bicicletas;

    public GestorTallerBicicletas() {
        this.bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.println(bicicleta.getCodigoBici() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
    }

    public List<Bicicleta> buscarBicicletasPorCodigo(String codigo) {
        List<Bicicleta> resultado = new ArrayList<>();
        for (Bicicleta b : bicicletas) {
            if (b.getCodigoBici().equalsIgnoreCase(codigo)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }


}
