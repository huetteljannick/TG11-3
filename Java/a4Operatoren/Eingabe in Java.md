# Eingabe in Java
Um Werte über die Konsole einzulesen, wird die Klasse `Scanner`
verwendet. Dazu wird bei der Erstellung der Konstruktor der Klasse `Scanner` mit dem Schlüsselwort `new`aufgerufen. Diesem wird der Dateneingabestrom `System.in` übergeben. 

```java
public class A1 {
    public static void main(String[] args) {
        //EINGABE
        Scanner s = new Scanner(System.in);
```

## Werte einlesen
```Java
int gz = s.nextInt();//Ganze Zahl einlesen
double kz = s.nextDouble();//Kommazahl einlesen
String text = s.next(); //Text einlesen
boolean isCold = s.nextBoolean();
String zeile = s.nextLine();
char Geschlecht = s.next().charAt(0);//Zeichen Einlesen

```

## Datenstrom schliessen
Geöffnete Streams müssen nach der Verwendung wieder geschlossen werden.
```Java
s.close();
```