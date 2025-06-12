# Projet Pharma3 - Application de Gestion de Médicaments (Conteneur Spring & IoC)

Ce dépôt contient la troisième itération du projet "Pharma". Cette version marque une avancée significative en introduisant le **conteneur de beans de Spring Framework** et en utilisant l'**Inversion de Contrôle (IoC)** pour gérer les dépendances.

## Contexte

- **Pharma1** : Bases en Java pur avec DAO mocké.
- **Pharma2** : Introduction de l'injection de dépendances **manuelle**.
- **Pharma3** : Passage à la gestion des dépendances par le **conteneur Spring**, utilisant la configuration XML pour définir les beans et leurs relations. Le DAO reste mocké.

## Fonctionnalités (Démo 3)

- **Gestion des Médicaments** : Création et récupération de médicaments avec des données mockées.
- **Couches Applicatives** : Maintien des couches DAO, Domaine et Service.
- **Conteneur Spring (IoC)** :
  - Utilisation de `ClassPathXmlApplicationContext` dans la classe `Laucher` pour charger le conteneur Spring à partir du fichier `demo-beans.xml`.
  - Les beans `MedicamentDao` et `ServiceMedicament` sont définis dans `demo-beans.xml` et leurs dépendances sont injectées par Spring (ex: `ServiceMedicament` reçoit son `IMedicamentDao` injecté).
  - Définition de méthodes de **cycle de vie des beans Spring** (`initialisation` et `destruction`) dans le `MedicamentDao` pour observer le comportement du conteneur.

## Technologies Utilisées

- Java (JDK 8 ou supérieur recommandé)
- **Maven** (pour la gestion des dépendances et du build)
- **Spring Framework** (en particulier `spring-context` pour l'injection de dépendances)

## Structure du Projet

## Comment Exécuter l'Application

1.  **Prérequis :**

    - Assurez-vous d'avoir le [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) installé (version 8 ou supérieure).
    - Assurez-vous d'avoir [Maven](https://maven.apache.org/download.cgi) installé et configuré.

2.  **Cloner le dépôt :**

    ```bash
    git clone [https://github.com/votre_utilisateur/Pharma3.git](https://github.com/votre_utilisateur/Pharma3.git)
    cd Pharma3
    ```

3.  **Construire le projet et télécharger les dépendances (via Maven) :**
    La commande `mvn clean install` va nettoyer les builds précédents, compiler le code, exécuter les tests (s'il y en a), packager l'application et l'installer dans votre dépôt Maven local. Elle téléchargera également toutes les dépendances Spring.

    ```bash
    mvn clean install
    ```

4.  **Exécuter l'application (depuis l'IDE) :**
    - Importez le projet `Pharma3` dans votre IDE (IntelliJ IDEA, Eclipse, VS Code) comme un projet Maven existant.
    - Exécutez la classe `com.sidoCop.sysPharma.launcher.Laucher` en tant qu'application Java.
    - Vous devriez voir les messages de console indiquant le chargement du conteneur Spring, l'appel aux méthodes `initialisation` et `destruction` du DAO, et l'exécution de la logique métier.

## Prochaines Étapes Possibles

- Passer d'une implémentation DAO mockée à une persistance réelle avec une base de données (JDBC direct, JPA/Hibernate).
- Explorer l'injection de dépendances basée sur les annotations Spring (`@Autowired`, `@Component`, etc.).
- Mettre en place des tests unitaires et d'intégration robustes avec Spring Test.

---

**Auteur :** Sidonie sidoniedjuissifohouo@gmail.com---

www.linkedin.com/in/sidonie-djuissi-fohouo

**Date :** 12 juin 2025
