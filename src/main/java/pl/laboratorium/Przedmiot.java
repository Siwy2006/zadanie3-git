
package pl.laboratorium;

/**
 * Reprezentuje przedmiot spakowany do walizki.
 */
public class Przedmiot {

    /** Nazwa przedmiotu. */
    private final String nazwa;

    /** Waga przedmiotu w kilogramach. */
    private final double waga;

    /**
     * Tworzy nowy przedmiot.
     *
     * @param nazwaPrzedmiotu nazwa przedmiotu
     * @param wagaPrzedmiotu waga w kilogramach
     */
    public Przedmiot(final String nazwaPrzedmiotu,
                     final double wagaPrzedmiotu) {
        this.nazwa = nazwaPrzedmiotu;
        this.waga = wagaPrzedmiotu;
    }

    /**
     * Zwraca nazwe przedmiotu.
     *
     * @return nazwa przedmiotu
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Zwraca wage przedmiotu.
     *
     * @return waga w kilogramach
     */
    public double getWaga() {
        return waga;
    }
}
