import java.util.Scanner;

public class MaquinaSnacks {

    // Matrices para almacenar nombres, precios y cantidades de snacks
    static String[][] nomSnack = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };

    static double[][] preu = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
    };

    static int[][] quantitat = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}
    };

    // Variable para almacenar las ventas totales
    static double vendesTotals = 0;

    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcio;
        do {
            // Menú principal
            System.out.println("\nMenú de l'aplicació:");
            System.out.println("1) Demanar/Mostrar snack");
            System.out.println("2) Omplir snacks (contrasenya requerida)");
            System.out.println("3) Apagar màquina");

            System.out.print("\nIntroduïu una opció: ");
            opcio = scanner.nextInt();

            // Switch para manejar las opciones del menú
            switch (opcio) {
                case 1:
                    demanarMostrarSnack(scanner);
                    break;
                case 2:
                    omplirSnacks(scanner);
                    break;
                case 3:
                    apagarMaquina();
                    break;
                default:
                    System.out.println("Opció no vàlida. Torneu a intentar.");
            }
        } while (opcio != 3);
    }

    // Función para procesar la opción de Demanar/Mostrar snack
    public static void demanarMostrarSnack(Scanner scanner) {
        System.out.print("Introduïu la posició del snack que voleu (fila columna): ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        // Verificar si la posición es válida
        if (fila >= 0 && fila < nomSnack.length && columna >= 0 && columna < nomSnack[0].length) {
            // Verificar si hay suficiente cantidad de snacks
            if (quantitat[fila][columna] > 0) {
                System.out.println("Has demanat: " + nomSnack[fila][columna]);
                System.out.println("Preu: " + preu[fila][columna]);
                quantitat[fila][columna]--;
                vendesTotals += preu[fila][columna];
            } else {
                System.out.println("No hi ha més quantitat d'aquest snack.");
            }
        } else {
            System.out.println("Posició incorrecta. Torna a intentar.");
        }
    }

    // Función para procesar la opción de Omplir snacks
    public static void omplirSnacks(Scanner scanner) {
        System.out.print("Introduïu la contrasenya: ");
        String contrasenya = scanner.next();

        // Verificar si la contraseña es correcta
        if (contrasenya.equals("MaquinetaDAW")) {
            System.out.print("Introduïu la posició del snack que voleu omplir (fila columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            // Verificar si la posición es válida
            if (fila >= 0 && fila < nomSnack.length && columna >= 0 && columna < nomSnack[0].length) {
                System.out.print("Introduïu la quantitat a afegir: ");
                int quantitatAfegir = scanner.nextInt();
                quantitat[fila][columna] += quantitatAfegir;
                System.out.println("S'han afegit " + quantitatAfegir + " snacks a la posició (" + fila + ", " + columna + ").");
            } else {
                System.out.println("Posició incorrecta. Torna a intentar.");
            }
        } else {
            System.out.println("Contrasenya incorrecta. Accés denegat.");
        }
    }

    // Función para procesar la opción de Apagar màquina
    public static void apagarMaquina() {
        System.out.println("Apagant la màquina. Vendes totals: " + vendesTotals);
    }
}
