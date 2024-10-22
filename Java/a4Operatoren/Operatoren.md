# Operatoren in Java

## Plusoperator

In der Zeile:

```java
double z1 =5;
double z2 =3;
double summe = z1+z2;
```

 1. Wert der Variablen `z1` und`z2` wird mit dem Plus-Operator addiert.

 2. Die berechnete Summe wird über den `=`-Operator der Variable `summe` zugewiesen.

Der Plusoperator kann auch Texte verknüpfen oder einen Text mit einer Zahl oder einer Variablen verknüpfen.

### Beispiel

```java
 System.out.printIn(z1+"+"+z2+"="+sum);
```

>Der Plusoperator ist **überladen** d.h. er kann sowohl Texte verknüpfen als auch Werte addieren.

## Modulo

Der Modulo-Operator `z1%z2` liefert den ganzzahligen Rest einer Division von `z1` geteilt durch `z2`.

## Bitoperatoren

Der einfache UND-Operator nimmt die Binärwerte der Variablen`z1` und `z2` und gibt die logische Gleichung ``z1&z2`` aus.

>|z1|z2|&|
>|---|---|---|
>|0|0|0|
>|1|0|0|
>|0|1|0|
>|1|1|1|

---
Der Bitshift-Operator `z1>>` verschiebt die Binärdarstellung von `z1` nach rechts. Dabei geht das LSB (Least Significant Bit - Das Bit ganz rechts) verloren und es wird links eine 0 hinzugefügt.

### Beispiel

>1011 >> 1  →  0101 \
>1011 >> 3  →  0001