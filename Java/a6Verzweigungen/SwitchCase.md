# Switch Case in Java

## Funktion

Die Switch-Case Umgebung erlaubt eine Mehrfachauswahl eines ganzzahligen Wertes(`int`), eines Strings oder einer enum-Aufzählung.
In den Runden Klammern der Switch-Anweisung steht der sogenannte `Selektor`. Der Selektor ist i.D.R. eine Integer-Variable. Hinter jedem `case` (Fall) steht ein Wert der als Auswahlkriterium dient. Hat also `Auswahl` der Wert `0` oder `1`, wird der Code bis zum `break` ausgeführt. Für den Fall, das `Auswahl` einen Wert hat, der mit  keinem `case` abgedeckt ist, wird der Code hinter dem Fall `default:` ausgeführt. Nach einem `break`-Befaehl, wird der Codeblock der Switch-Case-Umgebung verlassen.

## If oder Switch Case

Jede Switch Case Umgebung kann auch mit einer if-else Struktur realisiert werden. Umgekehrt jedoch nicht.

## Codebeispiel

```java

 switch (auswahl) {
            case 0: 
             case 1: 
                System.out.println("Auswahl = 0 oder 1");
                break;

            default:
                System.out.println("Es wurde keine Auswahl getroffen");
                break;
 ```
