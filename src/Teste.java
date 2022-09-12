import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List <Carro> carros = new ArrayList<>();
        carros.add(new Fiat());
        carros.add(new Ferrari());
        carros.add(new BMW());

        imprimirCarros(carros);

    }


    public static void imprimirCarros(List<? extends Carro> carros){
        for (Carro carro : carros){
            System.out.println(carro);
        }
    }
}
