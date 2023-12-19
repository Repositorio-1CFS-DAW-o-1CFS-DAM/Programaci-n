import java.util.Random;
import java.util.Scanner;

public class JuegoStarsWars {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("En una galàxia llunyana, molt, molt llunyà..."+
                "La princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO i R2D2 viatgen en una nau imperial robada\n" +
                "en una missió secreta per infiltrar-se en una altra estrella de la mort que l'Imperi està construint per destruir-la.\n" +
                "(Prem intro per continuar)");

        // Prem intro per continuar
        teclat.nextLine();

        // Inicia el joc cridant als nivells
        jugarNivell1(teclat);
        jugarNivell2(teclat);
        jugarNivell3(teclat);
        jugarNivell4(teclat);
        jugarNivell5(teclat);

        // Etapa FI
        System.out.println("Gràcies per jugar :D");
    }

    private static void jugarNivell1(Scanner teclat) {
        // Genera números aleatoris per al sistema i el sector
        Random sistema1 = new Random();
        Random sector2 = new Random();
        int S1 = sistema1.nextInt(10) + 1;
        int S2 = sector2.nextInt(11) + 20;
        int respostaCorrecta = calcularSumatori(S1, S2);

        System.out.println("Els problemes comencen quan han de fer un salt hiperespacial fins al sistema " + S1 + " al sector\n " + S2 +
                " però el sistema de navegació està trencat. Chewbacca, pilot expert, s'adona que falta el quart número de la sèrie.\n" +
                "Recorda dels seus temps a l'acadèmia de pilots que per calcular-ho has de sumar els números del sistema i del sector\n" +
                "(ambdós inclusos). Què has d'introduir? ");

        int intentUsuari = teclat.nextInt();

        if (intentUsuari == respostaCorrecta) {
            System.out.println("Al nivell 2");
        } else {
            System.out.println("Has perdut");
            mostrarPerdre();
        }
    }

    private static void jugarNivell2(Scanner teclat) {
        Random P1 = new Random();
        Random P2 = new Random();
        int espaciopuerto = P1.nextInt(7) + 1;
        int naveespacial = P2.nextInt(5) + 8;
        long respostaCorrecta = calcularProductori(espaciopuerto, naveespacial);

        System.out.println("Gràcies a Chewbacca aconsegueixen arribar al sistema correcte i veuen de lluny\n" +
                " la estrella de la mort. Com van en una nau imperial robada s'apropen lentament amb la intenció de passar desapercebuts.\n" +
                "De sobte sona el comunicador.\n" +
                " “Aquí agent d'espaciopuerto " + espaciopuerto + " contactant amb nau imperial " + naveespacial + " No estan destinats\n" +
                " en aquest sector. Què fan aquí?”. Han Solo agafa el comunicador i improvisa.\n" +
                " “Eh… tenim una fallada al… eh… condensador de fluzo... Sol·licitem permís\n" +
                " per amarrar i reparar la nau”. L'agent, que no es passeja amb tonteries, respon\n" +
                " “Proporcioni codi d'accés o obrirem foc”. Han Solo ojea ràpidament el" +
                " manual del pilot que estava a la guantera i troba la pàgina correcta.\n" +
                " El codi és el productori entre el nº de l'agent i el nº de la nau\n" +
                " (ambdós inclusos)." +
                "Quin és el codi? ");

        long intentUsuari = teclat.nextLong();

        if (intentUsuari == respostaCorrecta) {
            System.out.println("Al nivell 3");
        } else {
            System.out.println("Has perdut");
            mostrarPerdre();
        }
    }

    private static void jugarNivell3(Scanner teclat) {
        Random N = new Random();
        int numeroAleatori = N.nextInt(51) + 50;
        long respostaCorrecta = calcularFactorial(numeroAleatori / 10);

        System.out.println("Han Solo proporciona el codi correcte. Amarren a l'estrella de la mort,\n"
                + "s'equipen amb vestits de soldats imperials que troben a la nau per passar\n"
                + " desapercebuts i baixen. Ara han d'averiguar en quin nivell dels " + numeroAleatori
                + " existents es troba el reactor principal. Es dirigeixen al primer panell computeritzat que troben i la Princesa\n"
                + " Leia intenta accedir als plans de la nau però necessita introduir una clau d'accés.\n"
                + " Llavors recorda la informació que li va proporcionar Lando Calrissian\n"
                + " “La clau d'accés als plans de la nau és el factorial de N/10 (arrodonint N cap avall),\n"
                + " on N és el nº de nivells\n"
                + "Quin és el nivell correcte?: ");

        long intentUsuari = teclat.nextLong();

        if (intentUsuari == respostaCorrecta) {
            System.out.println("¡Al nivell 4!");
        } else {
            System.out.println("Has perdut");
            mostrarPerdre();
        }
    }

    private static void jugarNivell4(Scanner teclat) {
        Random P = new Random();
        int numeroAleatori = P.nextInt(11) + 10;
        boolean respostaCorrecta = esPrimer(numeroAleatori);

        System.out.println("Gràcies a la intel·ligència de Leia arriben al nivell correcte i troben la porta blindada\n" +
                " que dóna al reactor principal. R2D2 es connecta al panell d'accés per intentar hackejar el sistema i obrir\n" +
                " la porta. Per desxifrar la clau necessita verificar si el número " + numeroAleatori + " és primer o no. Si és primer,\n" +
                " introdueix un 1, si no ho és introdueix un 0.");

        int intentUsuari = teclat.nextInt();

        if ((respostaCorrecta && intentUsuari == 1) || (!respostaCorrecta && intentUsuari == 0)) {
            System.out.println("Al nivell 5");
        } else {
            System.out.println("Has perdut");
            mostrarPerdre();
        }
    }

    private static void jugarNivell5(Scanner teclat) {
        Random randomM = new Random();
        Random randomS = new Random();

        int M = randomM.nextInt(6) + 5; // Número aleatori entre 5 i 10
        int S = randomS.nextInt(6) + 5; // Número aleatori entre 5 i 10

        System.out.println("Aconsegueixen entrar al reactor. Ja només queda que Luke Skywalker col·loqui la bomba, programi el temporitzador i surti d'allà corrent. "
                + "Necessita programar-lo perquè exploti exactament en " + M + " minuts i " + S + " segons, el temps suficient per escapar abans que exploti, però sense que el sistema de seguretat anti-explosius ho detecti i desactivi la bomba."
                + " Però el temporitzador utilitza un rellotge Zordgiano una mica peculiar. Per convertir els minuts i segons al sistema Zordgiano cal sumar el factorial de M i el factorial de S. Quin valor ha d'introduir?");

        long factorialM = calcularFactorial(M);
        long factorialS = calcularFactorial(S);
        long respostaCorrecta = factorialM + factorialS;

        long intentUsuari = teclat.nextLong();

        if (intentUsuari == respostaCorrecta) {
            System.out.println("Guanyar!");
            mostrarGuanyar();
        } else {
            System.out.println("Has perdut");
            mostrarPerdre();
        }
    }

    private static int calcularSumatori(int num1, int num2) {
        // Funció que calcula la suma dels números del sistema i del sector
        int sumatori = 0;
        for (int i = num1; i <= num2; i++) {
            sumatori += i;
        }
        return sumatori;
    }

    private static long calcularProductori(int num1, int num2) {
        // Funció que calcula el producte dels números de l'agent i de la nau
        long productori = 1;
        for (int i = num1; i <= num2; i++) {
            productori *= i;
        }
        return productori;
    }

    private static long calcularFactorial(int num) {
        // Funció que calcula el factorial d'un número
        if (num == 0 || num == 1) {
            return 1;
        } else {
            long resultat = 1;
            for (int i = 2; i <= num; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }

    private static boolean esPrimer(int num) {
        // Funció que verifica si un número és primer
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void mostrarGuanyar() {
        // Etapa GANAR
        System.out.println("Luke Skywalker introdueix el temps correcte, activa el temporitzador i comencen a sonar les alarmes. Surten d'allà corrent, no hi ha temps que perdre. La nau es converteix en un bullidor de soldats d'adalt a baix i entre el caos que els envolta aconsegueixen arribar a la nau i sortir d'allà a tota pressa. A mesura que s'allunyen observen per la finestra la imatge de la colosal estrella de la mort explotant en el silenci de l'espai, desapareixent per sempre juntament amb els restes del malvat imperi.\n" +
                "Has salvat la galàxia gràcies a la Força Jedi de les matemàtiques! Enhorabona ;D");
        System.out.println("Gràcies per jugar :D");
        System.exit(0);
    }

    private static void mostrarPerdre() {
        // Etapa PERDER
        System.out.println("Aquest no era el codi correcte... La missió ha estat un fracàs... :( :( :(\n" +
                "Encara no ets un Mestre Jedi de les Matemàtiques. Torna-ho a intentar!");
        System.exit(0);
    }
}
