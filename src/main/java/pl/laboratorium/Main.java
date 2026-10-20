
package pl.laboratorium;

/**
 * Glowna klasa kalkulatora bagazu.
 */
public final class Main {

    /** Maksymalna waga bagazu. */
    private static final double LIMIT_BAGAZU = 10.0;

    /** Waga ubran. */
    private static final double WAGA_UBRAN = 4.5;

    /** Waga kosmetykow. */
    private static final double WAGA_KOSMETYKOW = 1.2;

    /** Waga aparatu. */
    private static final double WAGA_APARATU = 0.8;

    private Main() {
        throw new UnsupportedOperationException("Klasa narzedziowa");
    }

    /**
     * Uruchamia kalkulator bagazu.
     *
     * @param args argumenty programu
     */
    public static void main(final String[] args) {

        Walizka walizka = new Walizka(LIMIT_BAGAZU);

        Przedmiot ubrania = new Przedmiot("Ubrania", WAGA_UBRAN);
        Przedmiot kosmetyki = new Przedmiot("Kosmetyki", WAGA_KOSMETYKOW);
        Przedmiot aparat = new Przedmiot("Aparat", WAGA_APARATU);

        walizka.dodajPrzedmiot(ubrania);
        walizka.dodajPrzedmiot(kosmetyki);
        walizka.dodajPrzedmiot(aparat);

        System.out.println("=== KALKULATOR BAGAZU ===");
        System.out.println("Limit: " + walizka.getLimitWagi() + " kg");

        System.out.println(ubrania.getNazwa() + ": "
                + ubrania.getWaga() + " kg");
        System.out.println(kosmetyki.getNazwa() + ": "
                + kosmetyki.getWaga() + " kg");
        System.out.println(aparat.getNazwa() + ": "
                + aparat.getWaga() + " kg");

        System.out.println("Laczna waga: "
                + walizka.obliczWage() + " kg");

        if (walizka.miesciSieWLimicie()) {
            System.out.println("Bagaz miesci sie w limicie!");
        } else {
            System.out.println("Przekroczono limit bagazu!");
        }
    }
}
