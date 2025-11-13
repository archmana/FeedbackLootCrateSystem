Opgave: Byg et LootCrate-system med Exception Handling


Formål

Du skal designe og implementere et mini-lootcrate-system i Java, hvor du bruger exception handling til at sikre, at spillet ikke crasher, selvom brugeren laver fejl. Du kommer til at arbejde med egne exceptions, checked og unchecked exceptions og et simpelt objektorienteret design.

Læringsmål

· Bruge try-catch blokke og throws korrekt

· Skelne mellem checked og unchecked exceptions

· Strukturere Java-kode med flere klasser og mapper

· Oprette og bruge egne exception-klasser

· Forstå exception flow i objektorienteret kode


Opgavekrav

1. Klassen Player

En spiller har et brugernavn og en mængde credits.

Du skal kunne:

· Oprette en spiller

· Tilføje credits

· Bruge credits til at åbne crates

· Få vist credits og brugernavn

2. Klassen LootCrate

En crate har en identifikation og en pris (i credits).

Du skal kunne:

· Oprette crates

· Åbne crates (hvis spilleren har nok credits)

3. Exceptions

Du skal lave følgende egne exceptions:

EXCEPTION TYPE HVORNÅR BRUGES DEN

NOTENOUGHCREDITSEXCEPTION Checked Når en spiller prøver at åbne en crate uden at have nok credits

NEGATIVEAMOUNTEXCEPTION Unchecked Når en spiller prøver at tilføje negative credits

PLAYERNOTFOUNDEXCEPTION Checked Når der søges efter en spiller, der ikke findes i systemet


4. System

Lav en klasse med main() (fx LootCrateSystem) hvor du:

· Opretter et par spillere og crates

· Tester følgende scenarier:

o En spiller åbner en crate (skal virke)

o En spiller prøver at åbne en crate uden nok credits (skal give fejl)

o En spiller forsøger at tilføje negative credits (skal give fejl)

o En crate åbnes for en spiller, der ikke findes (skal give fejl)

Brug try-catch til at håndtere disse scenarier og udskriv passende fejlbeskeder.


Strukturforslag

src/

├── exceptions/

│ ├── NotEnoughCreditsException.java

│ ├── NegativeAmountException.java

│ └── PlayerNotFoundException.java

├── models/

│ ├── Player.java

│ └── LootCrate.java

├── LootCrateSystem.java


Testforslag

Test din applikation med mindst 2 spillere og 2 crates. Vis under testen hvordan exceptions bliver kastet og fanget. Skriv meningsfulde fejlbeskeder.


Udvidelser (frivillige)

· Giv spillere et inventory med ting, de har fået ud af crates

· Tilføj en CLI-menu med Scanner til at styre systemet

· Gem spillerdata i .txt-filer

· Lav en JavaFX-version med knapper og felter


Refleksionsspørgsmål

· Hvad er forskellen på checked og unchecked exceptions?

· Hvornår skal man selv lave en exception-klasse?

· Hvad sker der, hvis du ikke fanger en exception?

· Hvordan ville dit system se ud uden exception handling?