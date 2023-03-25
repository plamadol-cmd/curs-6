package c6;

public @interface Antet {
    String autor();
    String data();
    String ultimaModificare() default "N/A";

    String[] revieweri();
}
