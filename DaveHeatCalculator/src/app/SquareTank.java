package app;

public class SquareTank {
    float width;       // Breite des Tanks
    float length;      // Länge des Tanks
    String name;       // Name des Tanks
    float dailyEnergy; // Täglicher Energieverbrauch
    float capacity;    // Kapazität des Tanks
    float maxTemp;     // Maximale Temperatur
    float height;      // Höhe des Tanks
    float volume;      // Volumen

    /**
     * Konstruktor des Quadratischen Tanks.
     *
     * @param width       Breite des Tanks
     * @param length      Länge des Tanks
     * @param name        Name des Tanks
     * @param dailyEnergy Täglicher Energieverbrauch
     * @param capacity    Fassungsvermögen des Tanks
     * @param maxTemp     Maximale Temperatur
     * @param height      Höhe des Tanks
     */
    public SquareTank(float width, float height, float capacity, float maxTemp, String name, float dailyEnergy, float length) {
        // Initialisierung der Setter-Methoden, um Validierungen durchzuführen
        setWidth(width);
        setLength(length);
        setName(name);
        setDailyEnergy(dailyEnergy);
        setCapacity(capacity);
        setMaxTemp(maxTemp);
        setHeight(height);

        this.volume = calculateSquareTankVolumeInLiters();
    }

    /**
     * Volumenberechnung des Quadratischen Tanks.
     *
     * @return Volumen in Litern
     */
    public int calculateSquareTankVolumeInLiters() {
        return (int) (width * length * height / (double) 1000);
    }

    /**
     * Berechnet die gespeicherte Energie in kWh.
     *
     * @return die gespeicherte Energie in kWh
     */
    public int savedEnergy() {
        return (int) (volume * 4.18 * (maxTemp - 23) / (double) 3600);
    }

    /**
     * Berechnet die Anzahl Tage, für welche die gespeicherte Energie ausreicht.
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
        return "Fassungsvermögen: " + calculateSquareTankVolumeInLiters() + "\n" +
                "Gespeicherte Energie: " + savedEnergy() + " kwh\n" +
                "Tage: " + numberOfDays();
    }

    /**
     * Gibt die Höhe des Tanks zurück.
     *
     * @return Höhe des Tanks
     */
    public float getHeight() {
        return height;
    }

    /**
     * Setzt die Höhe des Tanks.
     *
     * @param height Höhe des Tanks
     * @throws IllegalArgumentException Falls die Höhe null oder kleiner ist
     */
    public void setHeight(float height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Die Höhe darf nicht kleiner oder gleich null sein");
        }
        this.height = height;
    }

    /**
     * Gibt die Breite des Tanks zurück.
     *
     * @return Breite des Tanks
     */
    public float getWidth() {
        return width;
    }

    /**
     * Setzt die Breite des Tanks.
     *
     * @param width Breite des Tanks
     * @throws IllegalArgumentException Falls die Breite kleiner oder gleich null ist
     */
    public void setWidth(float width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Die Breite darf nicht kleiner oder gleich null sein");
        }
        this.width = width;
    }

    /**
     * Gibt die Länge des Tanks zurück.
     *
     * @return Länge des Tanks
     */
    public float getLength() {
        return length;
    }

    /**
     * Setzt die Länge des Tanks.
     *
     * @param length Länge des Tanks
     * @throws IllegalArgumentException Falls die Länge kleiner oder gleich null ist
     */
    public void setLength(float length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Die Länge darf nicht kleiner oder gleich null sein");
        }
        this.length = length;
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
            throw new IllegalArgumentException("Der Name darf nicht leer oder null sein");
        }
        this.name = name;
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
     * @throws IllegalArgumentException Falls der tägliche Energieverbrauch kleiner oder gleich null ist
     */
    public void setDailyEnergy(float dailyEnergy) {
        if (dailyEnergy <= 0) {
            throw new IllegalArgumentException("Der tägliche Energieverbrauch darf nicht kleiner oder gleich null sein");
        }
        this.dailyEnergy = dailyEnergy;
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
     * @throws IllegalArgumentException Falls die Temperatur unter 30 Grad liegt
     */
    public void setMaxTemp(float maxTemp) {
        if (maxTemp < 35) {
            throw new IllegalArgumentException("Die maximale Temperatur darf nicht unter 35°C sein");
        }
        this.maxTemp = maxTemp;
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
