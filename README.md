# CAR_APP

ce repository contient le backend pour une application de vente de vehicule en ligne fait en Java spring boot et basée sur les patrons de conception Abstract Factory,Builder,Factory Method,Singleton,Adapter,Bridge,Composite,Decorator,Observer,Iterator,Template Method, il contient plusieurs dossiers notamment

- models: ce dossier contient les entités de l'application

- repository: c'est dossier est constitué des interfaces par defaut utilisant le JPARepository qui contient des methodes par defaut pour interagir avec la base de données.

- controller: ces dossier contient les differents classes qui implementent routes de l'application.

- service: ce dossier contient les classes concretes pour l'implementation des fonctionnalités des entites. Il est constitué d'un sous dossier:
  -> implementation: qui est constitué des interfaces ou classes abstraites  qui contiendront les signatures des methodes en fonction des patrons à implementer, tout en respectant leurs modeles generiques
