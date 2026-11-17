# Exercice 1 — Introduction à la Liste de Courses

Figure 1 : Exécution du programme ShoppingListApp
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/adb6fca0-c3c0-4ca6-bc61-bf57104b7a3f" />

Cette capture présente l'exécution du programme `ShoppingListApp`, qui permet de gérer une liste de courses à l'aide de l'interface `List` et de son implémentation `ArrayList`. Le programme commence par créer une liste vide, puis ajoute plusieurs articles à l'aide de la méthode `add()`. Les éléments sont ensuite affichés individuellement à travers une boucle.

Dans la deuxième partie, la méthode `remove()` permet de supprimer l'article « Lait » de la liste. La méthode `contains()` vérifie ensuite la présence de l'article « Pommes » et retourne une valeur booléenne indiquant si cet élément existe. Enfin, la méthode `size()` permet d'afficher le nombre total d'articles restants après la suppression.

Cet exercice permet de comprendre comment une `ArrayList` facilite la gestion dynamique des éléments, tout en conservant leur ordre d'insertion et en permettant les modifications de son contenu.

# Exercice 2 — Gestionnaire de Tâches avec List et Objets Métier

Figure 2 : Exécution du programme TaskManager
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/5bdd75e4-2239-473e-b669-5d8463795c4f" />

Cette capture montre le fonctionnement du programme `TaskManager`, qui introduit l'utilisation des collections pour stocker et gérer des objets personnalisés. La classe `Task` représente une tâche à travers deux attributs : `title`, qui contient son intitulé, et `completed`, qui indique son état d'avancement.

Dans la classe `TaskManager`, une collection `List<Task>` est créée à l'aide d'une `ArrayList` afin de stocker plusieurs objets de type `Task`. Le programme ajoute différentes tâches, puis utilise la méthode `get()` pour accéder à un élément précis de la liste et modifier son état avec `setCompleted()`.

L'affichage est réalisé grâce à la méthode `toString()` redéfinie dans la classe `Task`, qui représente chaque tâche par une case cochée `[X]` lorsqu'elle est terminée, ou non cochée `[ ]` lorsqu'elle reste à effectuer. Une seconde boucle permet de parcourir la liste et d'identifier uniquement les tâches non terminées à l'aide de `isCompleted()`.

Cet exercice illustre la manipulation d'objets dans une collection, l'utilisation des méthodes d'accès et de modification, ainsi que le parcours conditionnel d'une liste.


# Exercice 3 — Maîtrise des Set et Analyse de Mots Uniques

Figure 3 : Suppression des doublons avec HashSet
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/ffbcd3b7-2645-46cb-bf8b-40457fcdfecd" />

Cette capture présente l'exécution du programme `UniqueWords`, dont l'objectif est d'extraire les mots distincts d'une phrase. Le programme commence par stocker une phrase dans une variable de type `String`, puis utilise la méthode `split(" ")` pour la découper en plusieurs mots et obtenir un tableau de chaînes de caractères.

Une collection de type `Set<String>` est ensuite créée avec l'implémentation `HashSet`. À l'aide d'une boucle, chaque mot du tableau est ajouté à la collection grâce à la méthode `add()`. Contrairement à une liste classique, un `HashSet` n'accepte pas les éléments en double : lorsqu'un mot est déjà présent, son ajout ne crée pas une deuxième occurrence.

La méthode `size()` permet de calculer le nombre de mots uniques, tandis que l'affichage de la collection présente les éléments conservés. L'ordre des mots peut varier, car `HashSet` ne garantit aucun ordre particulier.

Cet exercice permet de comprendre l'intérêt de l'interface `Set` lorsqu'il est nécessaire de conserver uniquement des éléments distincts et d'éliminer automatiquement les doublons.

Figure 4 : Comparaison des implémentations de Set
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/2c98c7e9-1f30-49b2-b4cf-429a985dd116" />

Cette capture présente une comparaison entre trois implémentations de l'interface `Set` : `HashSet`, `LinkedHashSet` et `TreeSet`. Les trois collections sont initialisées avec les mêmes éléments afin d'observer les différences dans leur organisation et leur affichage.

Le `HashSet` permet de stocker les éléments sans garantir leur ordre d'affichage. Le `LinkedHashSet` conserve l'ordre dans lequel les éléments ont été insérés dans la collection. Enfin, le `TreeSet` organise automatiquement les éléments selon leur ordre naturel, ce qui permet ici d'obtenir un affichage alphabétique.

La comparaison montre que ces trois structures respectent le principe d'unicité des éléments, mais proposent des comportements différents concernant leur organisation. Le choix de l'implémentation dépend donc des besoins de l'application : recherche et stockage sans ordre garanti, conservation de l'ordre d'insertion ou classement automatique des éléments.



# Exercice 4 — Dictionnaire Bilingue avec Map

Figure 5 : Exécution du programme BilingualDictionary
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/e08073cf-33a7-4649-b3b2-c63bb5eff604" />

Cette capture présente le fonctionnement du programme `BilingualDictionary`, qui permet de construire un dictionnaire anglais-français à l'aide de l'interface `Map` et de son implémentation `HashMap`.

La collection est déclarée avec deux types génériques : `String` pour les clés et `String` pour les valeurs. Les mots anglais sont enregistrés comme clés et leurs traductions françaises comme valeurs. La méthode `put()` permet d'ajouter les différentes associations dans le dictionnaire.

Pour rechercher une traduction, le programme utilise la méthode `get()` en lui transmettant le mot anglais correspondant. Cette méthode retourne directement la valeur associée à la clé recherchée.

Dans la deuxième partie, la méthode `entrySet()` permet de récupérer l'ensemble des associations présentes dans la Map. Une boucle `for-each` parcourt ensuite chaque élément sous forme de `Map.Entry<String, String>`. Les méthodes `getKey()` et `getValue()` permettent respectivement d'accéder au mot anglais et à sa traduction française.

Cet exercice permet de comprendre le fonctionnement des structures clé-valeur et de découvrir différentes méthodes pour accéder aux données et parcourir une collection de type `Map`.



# Exercice 5 — Gestion d'une Bibliothèque

Figure 6 : Exécution de l'application de gestion de bibliothèque
<img width="1920" height="603" alt="image" src="https://github.com/user-attachments/assets/6235b9ea-8531-4866-9805-6aeb00b171f2" />

Cette capture présente l'exécution de l'application finale de gestion de bibliothèque, qui combine les principales structures de données étudiées dans les exercices précédents : `List`, `Set` et `Map`.

La première partie du projet repose sur la classe `Book`, qui représente chaque livre à travers trois attributs privés : `isbn`, `title` et `author`. Son constructeur permet d'initialiser les informations d'un livre, tandis que les méthodes getters permettent d'accéder à ses attributs. La méthode `toString()` redéfinie facilite également l'affichage des informations complètes de chaque livre.

La classe `Library` constitue le composant principal de l'application. Elle contient plusieurs collections ayant chacune un rôle spécifique :

- List<Book> : stocke l'ensemble des livres présents dans l'inventaire de la bibliothèque. Elle permet de conserver plusieurs objets `Book` et de parcourir facilement la collection.
- Set<String> : stocke les différentes catégories de livres en évitant les répétitions. L'utilisation de `HashSet` garantit l'unicité des catégories.
- Map<String, Book> : permet d'associer chaque numéro ISBN à son objet `Book`. Cette structure facilite la recherche d'un livre grâce à la méthode `findByIsbn()`, qui utilise `get()` pour récupérer le livre correspondant.
- Map<Book, String> : permet d'associer chaque livre emprunté au nom de son emprunteur. Elle est utilisée pour contrôler la disponibilité des livres et gérer les opérations de prêt et de restitution.

La méthode `addBookIndexed()` permet d'ajouter simultanément un livre à l'inventaire et à l'index ISBN. La méthode `borrowBook()` vérifie d'abord si le livre est déjà présent dans la collection des prêts avec `containsKey()`. Si le livre est disponible, il est associé à l'emprunteur et la méthode retourne `true`. Dans le cas contraire, elle retourne `false`, empêchant ainsi un deuxième emprunt simultané du même livre.

La méthode `returnBook()` permet de supprimer l'association correspondante à l'aide de `remove()`, ce qui rend le livre disponible pour un nouvel emprunt.

Enfin, la classe `Main` rassemble les différentes fonctionnalités dans un scénario de test complet. Elle crée plusieurs livres, les ajoute à la bibliothèque, enregistre des catégories, affiche l'inventaire, effectue une recherche par ISBN et teste le cycle complet d'emprunt et de restitution.
