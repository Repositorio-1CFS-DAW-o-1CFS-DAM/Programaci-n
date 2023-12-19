# Resum Extens del Programa en Java: "JocStarWars.java"
Introducció:

En aquest programa, es crea un joc simple basat en la saga de Star Wars. Els jugadors han d'enfrontar-se a diversos nivells, cada un amb un problema matemàtic, i han de resoldre'ls per progressar a través del joc.

## Estructura del Programa:

 1- **Importacions**:

java.util.Random: Utilitzat per a generar nombres aleatoris.
java.util.Scanner: Utilitzat per a llegir l'entrada de l'usuari.

2- **Funció Principal**:

public static void main(String[] args): Punt d'entrada principal del programa. S'estableix el context de la història i es criden les funcions dels diferents nivells.

3- **Funcions dels Nivells**:

Es defineixen diferents funcions (jugarNivellX) per a cada nivell del joc.
Cada nivell presenta una situació i un problema matemàtic que l'usuari ha de resoldre.
Si l'usuari resol amb èxit el problema, passa al següent nivell; sinó, el joc es tanca.

4- **Funcions Auxiliars**:

calcularSumatori(int a, int b): Calcula el sumatori dels nombres entre a i b (ambdós inclosos).
calcularProductori(int a, int b): Calcula el productori dels nombres entre a i b (ambdós inclosos).
calcularFactorial(int num): Calcula el factorial d'un nombre num.
esPrimo(int num): Comprova si un nombre és primer.

5- **Funcions de Finalització**:

mostrarGuanyar(): Mostra un missatge de victòria i finalitza el programa.
mostrarPerdre(): Mostra un missatge de derrota i finalitza el programa.

6- **Ús de Text Blocks**:

S'ha utilitzat la nova funcionalitat de "text blocks" introduïda a Java 13 per millorar la llegibilitat del codi. Aquesta característica simplifica la creació de cadenes de text multilínia.

7- **Random i Scanner**:

Es fa servir Random per a generar nombres aleatoris i Scanner per a llegir l'entrada de l'usuari.

8- **Condicions i Estructures de Control**:

S'apliquen condicions if per a verificar les respostes de l'usuari i decidir si avança al següent nivell o finalitza el joc.

9- **Finalització del Programa**:

S'ha utilitzat System.exit(0) per a tancar el programa quan es mostra un missatge de guanyar o perdre.

10- **Documentació i Comentaris**:

S'han afegit comentaris en català per explicar breument cada part del codi i facilitar la seva comprensió.

## Conclusió:

El programa utilitza els conceptes bàsics de programació en Java per crear un joc interactiu amb situacions basades en la narrativa de Star Wars. Les funcions modulars i l'ús de text blocks milloren la llegibilitat i faciliten el manteniment del codi.


![Stars Wars](https://i.blogs.es/26ba45/star-wars-eras/1366_2000.jpeg)
