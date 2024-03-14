**EXO 1** 
1. Grâce à pgadmin et docker, à la declaration d'une classe comme ClassTestJPA, (une entity), on peut observer la table, dans la partie Schemas de l'arborescence, en plus de chacune de ses colonees, il n y a aucune dependance entre chacune de ces colones et celles d'autres tables, d'ou la section dependencies est vide. On peut observer aussi dans la section constraints, la contrainte de la clé primaire.
2. Dand la classe ClassTestJPA2, la clause @Column permet de pouvoir rajoutter des contraites d'unicité de longueur etc à la colonne de la table.Avec Pgadmin,on peut observe cela dans la section contrainte par exemple.
3. À mon avis, il est mieux de les mettres pour chaque colonne de la table, puisque même si pour l'instant, on a pas contrainte qu'on veut rajoutter, ça nous permet de les rajoutter plus facilement. En plus, on peut changer le nom de la colonne au besoin,pour le rendre plus compréhensible.

