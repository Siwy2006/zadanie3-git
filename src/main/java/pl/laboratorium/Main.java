
package pl.laboratorium;

/**
 * Glowna klasa aplikacji.
 */
public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Klasa narzedziowa");
    }

    /**
     * Uruchamia program i wyswietla komunikaty.
     *
     * @param args argumenty uruchomienia programu
     */
    public static void main(final String[] args) {
        System.out.println("Zmiana wykonana w VS Code!");
        System.out.println("Zmiana wykonana na GitHubie!");
        System.out.println("To druga wersja programu.");
    }
}
