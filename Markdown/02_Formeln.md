# Mathematische Formeln

## Formel im Text
Der Satz des Pythagoras lautet: $a^5+b^2=c^2$. Formeln im Text wie hier werden in Markdown in `$`-Zeichen eingefasst.
Die obige Formel wird in Markdown also so geschrieben:
`text ... $a^5+b^2=c^2$ ... text`

>**Beispiel:**
>die 1. binomische Formel lautet $(a+b)^2$ und wird mit `$(a+b)^2$` erstellt.

## Formel als Absatz
Soll eine Formel zwischen 2 Absätzen formatiert angezeigt werden, wird die Formel in doppelten Dollarzeichen `$$` eingefasst.
Hier die Formel von oben abgesetzt vom Text: `$$(a+b)^2$$` erzeugt: 

$$(a+b)^2$$



## Symbole
Alle griechischen und Symbole Buchstaben können über eine mathematische Formel und einem vorangestellten Backslash angezeigt werden.

### Beispiele:
- $\alpha$ wird erstellt mit `$\alpha$`
- $\Omega$ wird mit `$\Omega$`
- $\Delta$ wird mit `$\Delta$`

---
## Indizes 
In Markdown können Ziffern und Text hoch- und tiefgestellt angezeigt werden.

### Beipiel Tiefgestellt:
Die Spannung $U_{eff}$ ist die Effektivspannung und wird mit dem Code `$U_{eff}$` erstellt.

### Beispiel Hochgestellt:
Die komplexe Zahl $e^{j\omega t}$ wird mit dem Code `$e^{j\omega t}$` erstellt.

---
## Brüche
Brüche werden mit dem Befehl `$\frac{}{}$` oder `$\dfrac{}{}$` können Brüche dargestellt werden. `$\dfrac{}{}$` wird größer dargestellt als  `$\frac{}{}$`.

- $\frac{a^2}{x^5}$ wird dargstellt mit  `$\frac{a^2}{x^5}$`

- $\dfrac{a^2}{x^5}$ wird dargstellt mit  `$\dfrac{a^2}{x^5}$`

---

## Wurzel
Bei der Wurzel werden das erste mal eckige Klammern `[ ]` verwendet. Diese beinhalten optionale Parameter. Die Notation stammt aus der Skriptsprache Latex.

- $\sqrt{2}$ wird mit `$\sqrt{2}$` erstellt.
- $\sqrt[3]{81}=3$ wird mit `$\sqrt[3]{81}=3$` erstellt.

---
## Integral
Integral beschreibt das aussummieren vieler kleiner Teilen. Die Inegralrechnung kann z.B. genutzt werden um die Flächen unter Kurven zu berechnen.
Der Befehl `\limits` sorgt dafür dass Integrationsgrenzen $a$ und $b$  über dem Summensymbol des Integrals angezeigt werden.

Die Formel:
 $$\int_a^b \limits f(x) \cdot dx$$

 wird mit ` $$\int_a^b \limits f(x) \cdot dx$$`
 dargestellt.