import java.util.Scanner;
public class SistemasOperativos {

    static int tam, cont, opt;
    static String[] lista;

    public SistemasOperativos(int tam) {
        this.tam = tam;
        lista = new String[tam];
        cont = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa el tamaño");
        int t = sc.nextInt();

        String p = "";
        SistemasOperativos so = new SistemasOperativos(t);

        do {
            System.out.println("1- add\n"
                    + "2- del\n"
                    + "3- edit\n"
                    + "4 show\n"
                    + "5- exit");
            switch (opt = sc.nextInt()) {
                case 1:
                    System.out.println("valor..");
                    agregar(p = sc.next());
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    System.out.println("posicion a editar");
                    int pos = sc.nextInt();
                    System.out.println("nuevo valor");
                    p = sc.next();
                    editar(pos, p);
                    break;
                case 4:
                    mostrar();
                    break;

            }
        } while (opt != 5);

    }

    public static void agregar(String p) {
        lista[cont] = p;
        System.out.println("dato agregado: "+p +" en pos: "+cont);
        cont++;
    }

    public static void eliminar() {
        System.out.println("dato eliminado: " + lista[0]);
        for (int i = 0; i < cont; i++) {
            lista[i] = lista[i + 1];
        }
        cont--;
    }

    public static void editar(int pos, String p) {
        lista[pos] = p;
    }

    public static void mostrar() {
        for (int i = 0; i < cont; i++) {
            System.out.println(lista[i]);
        }
    }
}
