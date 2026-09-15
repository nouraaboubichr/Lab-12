# Exercice 1 - Manipulation des fichiers avec FileReader/FileWriter, BufferedReader/BufferedWriter et Files

* **Maîtriser les opérations de base sur les fichiers** : lecture, écriture, copie et suppression.
* Utiliser **`FileReader` / `FileWriter`**, **`BufferedReader` / `BufferedWriter`** et l’API **`Files`**.
* Lire un fichier texte ligne par ligne avec la classe **`TextReader`** et afficher son contenu.
* Copier le contenu de **`input.txt`** vers **`output.txt`** avec la classe **`TextWriter`**, puis ajouter le nombre total de lignes copiées.
* Lire et écrire un fichier **CSV** avec **`CsvParser`**, stocker les données dans des objets `Record` et filtrer les enregistrements dont **`score >= 50`**.
* Sérialiser et désérialiser une **`List<Record>`** dans un fichier binaire avec **`ObjectSerializer`**.
* Utiliser le **try-with-resources** pour fermer automatiquement les flux.
* Appliquer les exceptions **`IOException`** et **`ClassNotFoundException`** lors des opérations sur les fichiers.
* Les extensions proposées concernent **`Path` / `Files`**, les fichiers binaires, les Streams parallèles et une interface graphique.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Exercice 2 - Écriture avec PrintWriter et BufferedReader

* Découvrir **`PrintWriter`** pour écrire dans un fichier texte avec un formatage simple.
* Combiner **`PrintWriter`** et **`BufferedReader`** pour écrire, lire et mettre à jour des fichiers.
* Utiliser le **try-with-resources** pour garantir la fermeture automatique des flux.
* Créer un **journal `application.log`** avec la classe `LogManager` et enregistrer des messages horodatés avec différents niveaux comme **INFO, DEBUG et ERROR**.
* Utiliser **`FileWriter(logPath, true)`** pour écrire les nouveaux messages en mode **append**.
* Générer un fichier **CSV** avec `CsvWriter`, en écrivant un en-tête et plusieurs lignes avec **`String.join()`**.
* Utiliser **`PrintWriter`** pour générer une page **HTML** simple avec `HtmlGenerator`.
* Préciser l’encodage **UTF-8** lors de la génération des fichiers.
* Séparer les responsabilités en créant une classe pour chaque type d’écriture : **log, CSV et HTML**.
* Les extensions proposées concernent les niveaux de verbosité du log, la génération de CSV à partir d’objets métier et la création de templates HTML plus complexes.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
