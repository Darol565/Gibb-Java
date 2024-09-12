package app;
public class Main {
    /**
     * Die Main-Methode, welche die Tank-Objekte erstellt und die Werte der Tanks
     * und deren Werte ausgibt.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        // Erstellung von Tank-Objekten
        SquareTank squareTank = new SquareTank(76, 140, 100, 80, "Square", 200, 100);
        CylinderTank cylinderTank = new CylinderTank(200, 90, "Cylinder", 70, 100, 100);
        Tank tank = new Tank("Tank", 70, 100, 100, 600);


        // Ausgabe der Tank-Werte
        System.out.println(squareTank);
        System.out.println(cylinderTank);
        System.out.println(tank);
    }
}
