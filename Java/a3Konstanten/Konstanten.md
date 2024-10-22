# Konstanten in Java

## Definition

Eine Konstante ist eine festgelegter Wert, der nicht mehr geändert werden kann. Den Namen der Konstante schreibt man meist nur in Großbuchstaben.

## Lokale Konstante

Eine Konstante ist lokal, wenn sie in der **`main`-Methode** deklariert und initialisiert wird. Das macht man indem man vor den Datentyp `final` schreibt.

### Beispiel

```java
public static void main(String[] args) {

    final int ANZAHL_RAEDER = 4;

    final double ERDFALLBESCHLEUNIGUNG = 9.81;
}
```

## Globale Konstanten

Eine Konstante ist global, wenn sie in der **`class`-Methode** deklariert und initialisiert wird. Das macht man indem man vor den Datentyp `public final static` schreibt.

### Beispiel

```java
public class Konstanten {

    public final static int ANZAHL_RAEDER = 4;

    public final static double ERDFALLBESCHLEUNIGUNG = 9.81;
}
```

## Interface für Konstanten

Ein Interface ist eine eigene `.java` Datei, in der Konstanten deklariert und initialisiert werden. Diese Datei benötigt **keine** `main`-Methode. Die Konstanten werden in der `interface`-Methode deklariert und initialisiert.

### Beispiel

```java
public interface Physik {
    
    public double ERDFALLBESCHLEUNIGUNG = 9.81; // m/s²

    public double LADUNG_ELEKTRON = -1.602e-19; //Coulomb, C

}
```

## Konstanten aus Interface benutzen

Um die Konstanten aus einem Interface zu benutzen, muss in der `class`-Methode der Zusatz `implements` mit dem Namen des Interfaces stehen.

### Beispiel

```java
public class KonstanteMitInterface implements Physik {
}
```
