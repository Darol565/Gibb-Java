package app;

public class Tank {
    String name;      // Name des Tanks
    float dailyEnergy;// Täglicher Energieverbrauch
    float volume;     // Volumen
    float maxTemp;    // Maximale Temperatur im Tank
    float capacity;   // Kapazität des Tanks

    /**
     * Konstruktor des Tanks.
     *
     * @param name        Name des Tanks
     * @param dailyEnergy Täglicher Energieverbrauch
     * @param volume      Volumen
     * @param maxTemp     Maximale Temperatur im Tank
     * @param capacity    Kapazität des Tanks
     */

    public Tank(String name, float maxTemp, float dailyEnergy, float capacity, float volume) {
        // Initialisierung der Setter-Methoden, um Validierung sicherzustellen
        setName(name);
        setDailyEnergy(dailyEnergy);
        setVolume(volume);
        setMaxTemp(maxTemp);
        setCapacity(capacity);

    }

    /**
     * Berechnet die im Tank gespeicherte Energie in kWh.
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
        return "Kapazität: " + volume + "\n" +
                "Gespeicherte Energie: " + savedEnergy() + " kwh\n" +
                "Tage: " + numberOfDays();
    }

    /**
     * Gibt den Namen vom Tank zurück.
     *
     * @return Name des Tanks
     */
    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen vom Tank.
     *
     * @param name Name vom Tank
     * @throws IllegalArgumentException wenn der Name leer ist
     */
    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new IllegalArgumentException("Der Name ist leer, gib einen Namen ein");
        }
        this.name = name;
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
            throw new IllegalArgumentException("Die maximale Temperatur darf nicht unter 35 Grad sien");
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
     * @throws IllegalArgumentException Falls das Volumen kleiner oder gleich null ist
     */
    public void setVolume(float volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Das Volumen darf nicht kleiner oder gleich null sein");
        }
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

    /**
     * Gibt den täglichen Energieverbrauch des Tanks zurück.
     *
     * @return Täglicher Energieverbrauch in kwh
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
            throw new IllegalArgumentException("Der Tägliche Energieverbrauch darf nicht kleiner oder gleich null sein");
        }
        this.dailyEnergy = dailyEnergy;
    }
}
