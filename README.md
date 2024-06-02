# Secteur banquaire EJB part 1:
Ce projet est dédié à la compréhension de l'environnement EJB. Dans ce fichier README, je vais expliquer les notions principales comme suit : EJB, 
session bean, entity bean, message-driven bean. Nous allons également comprendre l'environnement et la configuration de JBoss, ainsi que découvrir l'interface d'administration pour configurer le datasource.

# EJB: 
  
EJB (Enterprise JavaBeans) est une architecture de développement logiciel basée sur des composants pour la construction d'applications d'entreprise distribuées et évolutives en Java.
 Les EJB sont des composants réutilisables qui encapsulent la logique métier d'une application et fournissent des services de gestion de transaction, de sécurité et de persistance.
 Ils permettent aux développeurs de créer des applications robustes et modulaires en se concentrant sur la conception des composants individuels plutôt que sur l'infrastructure sous-jacente. 
# Session bean : 



# Conteneur EJB:
  Un conteneur EJB est un composant essentiel de l'architecture des Enterprise JavaBeans (EJB). Il fournit un environnement d'exécution dans lequel les composants EJB peuvent être déployés, gérés et exécutés. Le conteneur EJB prend en charge plusieurs aspects clés de la vie d'un composant EJB, notamment la gestion des cycles de vie, la gestion des transactions, la sécurité, la persistance des données et l'accès aux ressources.
  
  Voici quelques-unes des responsabilités principales d'un conteneur EJB :
  
   - Gestion du cycle de vie : Le conteneur EJB gère le cycle de vie des composants EJB, y compris leur création, leur activation, leur passivation et leur destruction.
    
   - Gestion des transactions : Il gère les transactions pour les méthodes EJB, garantissant l'atomicité, la cohérence, l'isolation et la durabilité (ACID) des opérations.
    
   - Sécurité : Le conteneur EJB gère la sécurité en appliquant les autorisations et les rôles définis dans le descripteur de déploiement EJB.
    
   - Persistance des données : Il gère la persistance des données pour les composants EJB en intégrant des mécanismes tels que JPA (Java Persistence API) ou l'utilisation directe de JDBC (Java Database Connectivity).
    
 -  Accès aux ressources : Le conteneur EJB facilite l'accès aux ressources externes telles que les bases de données, les files d'attente JMS et les services web.
# JBOSS :

Jboss est un serveur d'applications open source basé sur platform Java EE(Entreprise Edition) conçu pour héberge et exécuter des application d'entreprise java. il fournit environement robuste pour le depoloiment, la gestion et l'execution d'application java EE, y compris les applications reposant sur des technologies telles que les servlets, JSP (JavaServer Pages), EJB (Enterprise JavaBeans), JMS (Java Message Service) et bien d'autres.Jboss offre des fonctionalité avancées telles que la gestion des transactions, la securité ,l'equilibrage de charge et la haute disponibilité, ce qui en fait un choix populaire pour le déploiement d'applications critiques dans les environnements d'entreprise.

 # configuration du project :

  - java utilisé dans le projet : jdk 1.8
  - JBoss Enterprise Application Platform (EAP) 8.x
  - mysql 8

# Sructure du projet:

 
