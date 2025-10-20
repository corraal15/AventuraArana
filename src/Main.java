import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("¡Bienvenido a la aventura de la araña!");
        System.out.print("Introduce el nombre de tu araña: ");
        String var2 = var1.nextLine();
        int var3 = 0;
        int var4 = 0;
        boolean var5 = true;
        String var6 = "";
        System.out.println("\nLa pequeña araña " + var2 + " despierta en una esquina del aula de ASIR 1...");
        System.out.println("Debe decidir su primer movimiento:");
        System.out.println("\n(1) Subir por la pared hasta el techo.");
        System.out.println("(2) Caminar por el suelo hacia la mesa del profesor.");
        System.out.print("Elige (1 o 2): ");
        int var7 = var1.nextInt();
        ++var4;
        if (var7 == 1) {
            var3 += 2;
            System.out.println("\n" + var2 + " sube ágilmente por la pared y observa todo desde lo alto.");
            System.out.println("\nDesde el techo ve dos opciones:");
            System.out.println("(1) Bajar sobre la cabeza de un alumno.");
            System.out.println("(2) Lanzarse hacia una mochila abierta.");
            System.out.print("Elige (1 o 2): ");
            int var8 = var1.nextInt();
            ++var4;
            if (var8 == 1) {
                ++var3;
                System.out.println("\n" + var2 + " desciende lentamente sobre el cabello del alumno...");
                System.out.println("\nEl alumno empieza a rascarse, " + var2 + " debe decidir:");
                System.out.println("(1) Escapar hacia el pupitre.");
                System.out.println("(2) Quedarse quieto y esperar.");
                System.out.print("Elige (1 o 2): ");
                int var9 = var1.nextInt();
                ++var4;
                if (var9 == 1) {
                    var3 += 2;
                    System.out.println("\n" + var2 + " corre hacia el pupitre.");
                    System.out.println("\nEn el pupitre hay una galleta y un vaso de agua.");
                    System.out.println("(1) Comer galleta.");
                    System.out.println("(2) Beber agua.");
                    System.out.print("Elige (1 o 2): ");
                    int var10 = var1.nextInt();
                    ++var4;
                    if (var10 == 1) {
                        var6 = var2 + " se da un festín con la galleta, vive feliz entre las migas.";
                        var5 = true;
                    } else {
                        var6 = var2 + " cae en el vaso y se ahoga lentamente.";
                        var5 = false;
                    }
                } else {
                    var6 = var2 + " permanece inmóvil... pero el alumno lo ve y lo aplasta sin piedad.";
                    var5 = false;
                }
            } else {
                var3 += 2;
                System.out.println("\n" + var2 + " aterriza dentro de la mochila.");
                System.out.println("\nDentro hay un portátil y un bocadillo viejo.");
                System.out.println("(1) Esconderse en el bocadillo.");
                System.out.println("(2) Subir al portátil.");
                System.out.print("Elige (1 o 2): ");
                int var21 = var1.nextInt();
                ++var4;
                if (var21 == 1) {
                    var6 = var2 + " se mete en el bocadillo y encuentra un hogar cálido... hasta que el dueño se lo come.";
                    var5 = false;
                } else {
                    var6 = var2 + " se posa sobre el portátil y se convierte en la mascota del informático.";
                    var5 = true;
                }
            }
        } else {
            var3 += 3;
            System.out.println("\n" + var2 + " avanza por el suelo, esquivando mochilas.");
            System.out.println("\nEncuentra dos lugares donde refugiarse:");
            System.out.println("(1) Debajo de la mesa del profesor.");
            System.out.println("(2) Dentro de una zapatilla olvidada.");
            System.out.print("Elige (1 o 2): ");
            int var20 = var1.nextInt();
            ++var4;
            if (var20 == 1) {
                ++var3;
                System.out.println("\n" + var2 + " se esconde bajo la mesa del profesor.");
                System.out.println("\nEl profesor deja caer un bolígrafo cerca. ¿Qué hace " + var2 + "?");
                System.out.println("(1) Subir por el pantalón del profesor.");
                System.out.println("(2) Escapar hacia la puerta.");
                System.out.print("Elige (1 o 2): ");
                int var22 = var1.nextInt();
                ++var4;
                if (var22 == 1) {
                    var6 = var2 + " trepa por el profesor, quien grita del susto y sale corriendo. La araña reina el aula.";
                    var5 = true;
                } else {
                    var6 = var2 + " corre hacia la puerta... pero un alumno entra justo en ese momento.";
                    var5 = false;
                }
            } else {
                ++var3;
                System.out.println("\n" + var2 + " entra en la zapatilla.");
                System.out.println("\nHuele mal, pero hay calor. De pronto, alguien se la pone...");
                System.out.println("(1) Morder el pie para escapar.");
                System.out.println("(2) Quedarse dentro.");
                System.out.print("Elige (1 o 2): ");
                int var23 = var1.nextInt();
                ++var4;
                if (var23 == 1) {
                    var6 = var2 + " muerde al alumno y escapa por la ventana, libre y heroico.";
                    var5 = true;
                } else {
                    var6 = var2 + " se queda quieto... y muere aplastado dentro del zapato.";
                    var5 = false;
                }
            }
        }

        System.out.println("\n=== FINAL DE LA HISTORIA ===");
        System.out.println(var6);
        System.out.println("\n=== ESTADÍSTICAS DE " + var2.toUpperCase() + " ===");
        System.out.println("Distancia total recorrida: " + var3 + " metros.");
        System.out.println("¿Sobrevive?: " + var5);
        System.out.println("Decisiones tomadas: " + var4);
        var1.close();
    }
}
