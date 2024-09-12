package app;

public class CylinderTank {
    float volume;      // Volumen
    float capacity;    // Kapazität des Tanks
    float diameter;    // Durchmesser
    float dailyEnergy; // Täglicher Energieverbrauch
    String name;       // Name des Tanks
    float height;      // Höhe
    float maxTemp;     // Maximale Temperatur


    /**
     * Konstruktor zur Initialisierung des zylindrischen Tanks.
     *
     * @param capacity    Fassungsvermögen des Tanks
     * @param diameter    Durchmesser des Zylinders
     * @param dailyEnergy Täglicher Energieverbrauch
     * @param name        Name des Tanks
     * @param height      Höhe des Zylinders
     * @param maxTemp     Maximale Temperatur
     */
    public CylinderTank(float diameter, float height, String name, float maxTemp, float dailyEnergy, float capacity) {
        // Initialisierung der Setter-Methoden, um Validierungen durchzuführen
        setCapacity(capacity);
        setDiameter(diameter);
        setDailyEnergy(dailyEnergy);
        setName(name);
        setHeight(height);
        setMaxTemp(maxTemp);
        this.volume = calculateRoundTankVolumeInLiters();
    }

    /**
     * Volumenberechnung des zylindrischen Tanks in Litern.
     *
     * @return Volumen in Litern
     */
    public int calculateRoundTankVolumeInLiters() {
        double radius = diameter / 2;
        double volumeInCubicMeters = Math.PI * radius * radius * height / 1000;
        return (int) (volumeInCubicMeters * 1000);
    }

    /**
     * Berechnet die im Tank gespeicherte Energie in kwh.
     *
     * @return die gespeicherte Energie in kWh
     */

    public int savedEnergy() {
        return (int) (volume * 4.18 * (maxTemp - 23) / (double) 3600);
    }

    /**
     * Berechnet die Anzahl der Tage, für die die gespeicherte Energie ausreicht.
     *
     * @return Anzahl der Tage
     */

    public int numberOfDays() {
        int energy = savedEnergy();
        return energy / (int) dailyEnergy;
    }

    /**
     * Liefert eine Textdarstellung des Tanks, die das Volumen, die gespeicherte Energie und die Anzahl der Tage enthält.
     *
     * @return Textdarstellung der Tank-Details
     */
    @Override
    public String toString() {
        return "Fassungsvermögen: " + calculateRoundTankVolumeInLiters() + "\n" +
                "Gespeicherte Energie: " + savedEnergy() + " kwh\n" +
                "Tage: " + numberOfDays();
    }

    /**
     * Gibt den Durchmesser des Zylinders zurück.
     *
     * @return Durchmesser des Zylinders
     */

    public float getDiameter() {
        return diameter;
    }


    // Setter-Methoden mit Validierungen

    /**
     * Setzt den Durchmesser des Zylinders.
     *
     * @param diameter Durchmesser des Zylinders
     * @throws IllegalArgumentException Falls der Durchmesser kleiner oder gleich null ist
     */

    public void setDiameter(float diameter) {
        if (diameter <= 0) {
            throw new IllegalArgumentException("Der Durchmesser muss größer als 0 sein");
        }
        this.diameter = diameter;
    }

    /**
     * Gibt den Namen des Tanks zurück.
     *
     * @return Name des Tanks
     */

    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen des Tanks.
     *
     * @param name Name des Tanks
     * @throws IllegalArgumentException Falls der Name leer oder null ist
     */

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new IllegalArgumentException("Der Name darf nicht kleiner oder gleich null sein");
        }
        this.name = name;
    }

    /**
     * Gibt das Volumen der gespeicherten Flüssigkeit im Tank zurück.
     *
     * @return Volumen der gespeicherten Flüssigkeit
     */

    public float getVolume() {
        return volume;
    }

    /**
     * Setzt das Volumen der gespeicherten Flüssigkeit im Tank.
     *
     * @param volume Volumen der gespeicherten Flüssigkeit
     */

    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * Gibt die Höhe des Zylinders zurück.
     *
     * @return Höhe des Zylinders
     */

    public float getHeight() {
        return height;
    }

    /**
     * Setzt die Höhe des Zylinders.
     *
     * @param height Höhe des Zylinders
     * @throws IllegalArgumentException Falls die Höhe kleiner oder gleich null ist
     */

    public void setHeight(float height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Die Höhe darf nicht kleiner oder gleich null sein");
        }
        this.height = height;
    }

    /**
     * Gibt die maximale Temperatur im Tank zurück.
     *
     * @return Maximale Temperatur im Tank
     */

    public float getMaxTemp() {
        return maxTemp;
    }

    /**
     * Setzt die maximale Temperatur des Tanks.
     *
     * @param maxTemp Maximale Temperatur im Tank
     * @throws IllegalArgumentException Falls die Temperatur unter 35 Grad liegt
     */

    public void setMaxTemp(float maxTemp) {
        if (maxTemp < 35) {
            throw new IllegalArgumentException("Die maximale Temperatur darf nicht unter 35°C liegen");
        }
        this.maxTemp = maxTemp;
    }

    /**
     * Gibt den täglichen Energieverbrauch des Tanks zurück.
     *
     * @return Täglicher Energieverbrauch in kWh
     */

    public float getDailyEnergy() {
        return dailyEnergy;
    }

    /**
     * Setzt den täglichen Energieverbrauch des Tanks.
     *
     * @param dailyEnergy Täglicher Energieverbrauch
     * @throws IllegalArgumentException Falls der täglicher Energieverbrauch kleiner oder gleich null ist
     */

    public void setDailyEnergy(float dailyEnergy) {
        if (dailyEnergy <= 0) {
            throw new IllegalArgumentException("Der tägliche Energieverbrauch darf nicht kleiner oder gleich null sein");
        }
        this.dailyEnergy = dailyEnergy;
    }

    /**
     * Gibt das Fassungsvermögen des Tanks zurück.
     *
     * @return Fassungsvermögen des Tanks
     */

    public float getCapacity() {
        return capacity;
    }

    /**
     * Setzt das Fassungsvermögen des Tanks.
     *
     * @param capacity Fassungsvermögen des Tanks
     * @throws IllegalArgumentException Falls das Fassungsvermögen kleiner oder gleich null ist
     */

    public void setCapacity(float capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Das Fassungsvermögen darf nicht kleiner oder gleich null sein");
        }
        this.capacity = capacity;
    }
}
