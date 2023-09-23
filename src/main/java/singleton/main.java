package singleton;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do canal: ");
        String canal = scanner.nextLine();
        config.addCanal(canal);

        List<String> canais = config.getCanais();

        System.out.println("Canais adicionados: ");
        for (String canalAdd : canais ) {
            System.out.println(canalAdd);
        }
    }
}
