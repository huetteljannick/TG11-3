# Verzweigungen

Eine Verzweigung wird in Java mit dem `if`-Befehl erzeugt.

## Einfache Verzweigung

Nach dem  ``if``-Befehl kann in den Klammern eine Bedingung formuliert werden, die als Ergebnis ``wahr`` oder ``falsch`` liefert.
Dies können boolsche Variablen oder Bedingungen mit den Operatoren `>` , ``<`` , ``>=`` , ``<=`` , ``==`` oder ``!=`` sein.

>Liefert die Bedingung das Ergebnis `false` wird der Codeblock übersprungen.

```java
if(Bedingung){
    //führe aus wenn Bedingung wahr
}
```

## Zweifache Verzweigung

>Es kann immer nur einer der beiden Codeblöcke ausgeführt werden.

```java
if(Bedingung){
    //führe aus wenn Bedingung wahr
}
else{
    //führe aus wenn Bedingung nicht wahr
}
```

## Mehrfachverzweigung

>Es können beliebig viele ``else if``-Blöcke zwischen einem ``if``-Befehl und einem ``else``-Befehl hinzugefügt werde.Es kann immer nur **ein** Codeblock ausgeführt werden. Die anderen werden übersprungen.

```java
if(Bedingung){
    //führe aus wenn Bedingung 1 wahr
}
else if(zweite Bedingung){
    //führe aus wenn Bedingung 1 falsch und Bedingung 2 wahr
}
else{
    //führe aus wenn beide Bedingungen falsch
}
```
