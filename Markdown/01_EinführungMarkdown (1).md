# Einführung in Markdown

## Ueberschriften 
Mit dem `#`-Symbol können Überschriften erzeugt werden.
### Beispielcode:


```markdown
# Überschrift1
text...
## Überschrift2
text...
### Überschrift3
text...
```

## Numerierungen
folgender Numerierung:

1. Erste Numerierung
   - Zweite Numerierungsebene

- Erster Strichpunkt
    - UnterStrichounkt
        - Unterstrichpunkt2

    
wird erstellt mit:

```markdown
1. Erste Numerierung
   - Zweite Numerierungsebene

- Erster Strichpunkt
    - UnterStrichounkt
        - Unterstrichpunkt2

```

## Mathematische Formeln

### Formel im Text
Der Satz des Pythagoras lautet: $a^5+b^2=c^2$. Formeln im Text wie hier werden in Markdown in `$`-Zeichen eingefasst.
Die obige Formel wird in Markdown also so geschrieben:
`text ... $a^5+b^2=c^2$ ... text`

>**Beispiel:**
>die 1. binomische Formel lautet $(a+b)^2$ und wird mit `$(a+b)^2$` erstellt.

### Formel als Absatz
Soll eine Formel zwischen 2 Absätzen formatiert angezeigt werden, wird die Formel in doppelten Dollarzeichen `$$` eingefasst.
Hier die Formel von oben abgesetzt vom Text: `$$(a+b)^2$$` erzeugt: 

$$(a+b)^2$$



### Griechische Buchstaben
Alle griechischen Buchstaben können über eine mathematische Formel und einem vorangestellten Backslash angezeigt werden.

#### Beispiele:
$\alpha$ wird erstellt mit `$\alpha$`

---
### Indizes 
In Markdown können Ziffern und Text hoch- und tiefgestellt angezeigt werden.

#### Beipiel Tiefgestellt:
Die Spannung $U_{eff}$ ist die Effektivspannung und wird mit dem Code `$U_{eff}$` erstellt.

#### Beispiel Hochgestellt:
Die komplexe Zahl $e^{j\omega t}$ wird mit dem Code `$e^{j\omega t}$` erstellt.