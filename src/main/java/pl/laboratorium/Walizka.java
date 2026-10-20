
package pl.laboratorium;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentuje walizke z limitem wagowym.
 */
public class Walizka {

    /** Lista spakowanych przedmiotow. */
    private final List<Przedmiot> przedmioty = new ArrayList<>();

    /** Maksymalna dopuszczalna waga bagazu. */
    private final double limitWagi;

    /**
     * Tworzy walizke.
     *
     * @param maksymalnaWaga limit wagi bagazu
     */
    public Walizka(final double maksymalnaWaga) {
        this.limitWagi = maksymalnaWaga;
    }

    /**
     * Dodaje przedmiot do walizki.
     *
     * @param przedmiot przedmiot do dodania
     */
    public void dodajPrzedmiot(final Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }

    /**
     * Oblicza laczna wage przedmiotow.
     *
     * @return suma wag w kilogramach
     */
    public double obliczWage() {
        double suma = 0;

        for (Przedmiot przedmiot : przedmioty) {
            suma += przedmiot.getWaga();
        }

        return suma;
    }

    /**
     * Sprawdza, czy bagaz miesci sie w limicie.
     *
     * @return true, jezeli limit nie zostal przekroczony
     */
    public boolean miesciSieWLimicie() {
        return obliczWage() <= limitWagi;
    }

    /**
     * Zwraca limit wagowy.
     *
     * @return limit w kilogramach
     */
    public double getLimitWagi() {
        return limitWagi;
    }
}
