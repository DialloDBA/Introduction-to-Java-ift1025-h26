# Devoir 1

## Contexte

Je vous donne "Tabulateur", un petit programme qui lit des mots sur la ligne de commande jusqu'à ce que l'utilisateur entre "stop" (en minuscules). Puis, le programme trie les mots et les imprime.

Par exemple, avec l'entrée:

```
michalis
famelis
autre
personne
stop
```

le Tabulateur devrait imprimer:

```
autre
famelis
michalis
personne
```

Malheureusement, le code contient deux erreurs logiques dans la fonction agrandirTableau(String[] tab), ce qui empêche le programme de bien fonctionner.

Compilez le code et exécutez la fonction main() du Tabulateur. Vous allez constater qu'avec l'entrée

```
michalis
famelis
autre
personne
stop
```

le Tabulateur n'imprime que

```
michalis
```

## À faire

Votre tâche consiste à corriger la fonction agrandirTableau() dans le fichier Tabulateur.java.

Lisez les commentaires (javadoc) de la fonction. Est-ce que le code fait ce que le javadoc promet?

Lisez le code. Il y a deux erreurs logiques. Pouvez-vous les corriger?

Le fichier contient également d'autres méthodes. Il ne faut pas les toucher. Apportez vos modifications uniquement à la fonction agrandirTableau.

Je vous donne deux fichiers additionnels:

- Autograder
- AutograderSansJunit

Je vais utiliser Autograder pour la correction. Autograder contient 5 tests unitaires. Si vous avez de des difficultés avec la configuration du JUnit4, vous pouvez vérifier que votre solution marche si en exécutant la main de AutograderSansJunit vous avez la sortie:

```
Test testAgrandirTableauNull reussi.
Test testAgrandirTableauTaille1 reussi.
Test testAgrandirTableauTaille3 reussi.
Test testAgrandirTableauUneCaseMemeContenu reussi.
Test testAgrandirTableauAjouterNouvelElement reussi.
```

Sinon, un seul test va passer (testAgrandirTableauTaille1), un va échouer (testAgrandirTableauNull) et vous allez avoir une ArrayIndexOutOfBoundsException.

**Soumettez uniquement le fichier Tabulateur.java, rien d'autre.**

## Notes

- Lisez le code et les javadoc attentivement avant de commencer!
- Vous pouvez exécuter les tests sans utiliser JUnit, en exécutant la méthode main() de la classe AutograderSansJUnit.java
- Est-il possible de résoudre ce problème à l’aide d’une IA générative ? Oui. C’est un petit exercice, avec des bogues évidents, qu’un agent de programmation pourrait corriger en quelques secondes. Il est aussi possible de lire directement la solution sans faire l’exercice.
  Mais dans ce cas, pourquoi suivre le cours? Si vous prenez votre formation au sérieux, respectez la règle du cours: **l’IA générative n’est pas autorisée pour les devoirs**. Sinon, vous ne faites que perdre votre temps.

## Consignes

- Je vais compiler votre code sur linux (debian stable) et exécuter les tests JUnit4 dans la classe Autograder avec les commandes:

```
javac -d . -cp /usr/share/java/junit4.jar:. *.java
java -cp /usr/share/java/junit4.jar:/usr/share/java/hamcrest.jar:. org.junit.runner.JUnitCore Autograder
```

- Ces exercices seront corrigés automatiquement. Un point sera supprimé pour chaque test dans Autograder qui ne passe pas. Code qui ne compile ou n'exécute pas (voir au dessus) sera accordé 0.
- Ne soumettez rien d'autre que le fichier Tabulateur.java
- Ce travail compte pour 5% de votre note finale
- Aucun travail remis en retard ne sera évalué.
