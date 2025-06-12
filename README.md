# Description 

Réalisation d'une application destinée aux personnes travaillant dans la finance, ou voulant avoir des informations sur les Actions des entreprises cotées en bourse.
En effet, cette application a pour rôle de donner en Dollar américain (USD), le prix d'une action de n'importe quelle entreprise cotée en bourse, ainsi que le TAUX d'intérêt MENSUEL et ANNUEL du CANADA à partie d'une période donnée. Enfin vu que le prix de l'action obtenu est en Dollar américain (USD), j'ai rajouté un service qui permet de calculer la somme obtenue d'une devise de votre choix.

Les noms des entreprises doivent être des Symboles boursiers. Aussi il est necessaire d'inscrire pour les devises le code à 3 caractères.

En ce qui concerne le code, le BACK-END utilise une solution ASP.NET Core WEB API, dans laquelle le service appel 3 APIs dont le premier récupère l'inflation mensuelle et annuelle, le deuxième donne le prix des actions ainsi que le nom de la bourse sur laquelle l'action est cotée, enfin le troisième service permert l'échange de devises. Le FRONT-END angulaire s'occupent d'afficher les données. le BACK-END a été déployé avec AWS sur une avec une machine virtuelle Windows, et le front-end avec une instance AWS S3.


NB: Pour la conversion des taux d'échange, vu que mon abonnement gratuit est terminé, elle ne donner que les résultats des devises suivantes: CNY(Chinese Yuan), CHF(Swiss Franc) AUD(Australian Dallar) PLN(Polish Zloty) TRY(Turkish New Lira) GBP(British Pound) NZD(New Zealand Dollar) KRW(South Korean Won) DKK(Danish Krone) HKD(Hong Kong Dallar)
