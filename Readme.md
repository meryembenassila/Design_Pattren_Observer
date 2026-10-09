# Design Pattern Observer

Ce projet met en pratique le **Design Pattern Observer**, qui permet à un objet (*Subject*) de notifier automatiquement ses observateurs (*Observers*) lorsqu'un changement d'état se produit.

![Diagramme de classes](img_2.png)

## 1. Technique Push

Dans l'approche **Push**, le `Subject` transmet directement aux observateurs les données nécessaires lors de la notification.

### Diagramme de séquence

![Diagramme de séquence Push](img.png)

### Implémentation

![Implémentation Push](img_3.png)

### Test

![Test Push](img_4.png)

## 2. Technique Pull

Dans l'approche **Pull**, le `Subject` notifie les observateurs qu'un changement a eu lieu, puis ceux-ci récupèrent eux-mêmes les données nécessaires auprès du `Subject`.

### Diagramme de séquence

![Diagramme de séquence Pull](img_1.png)

### Implémentation

![Implémentation Pull](img_5.png)

### Test

![Test Pull](img_6.png)

## Conclusion

Les deux techniques permettent de notifier automatiquement les observateurs. La différence réside dans la transmission des données : **Push** transmet les données lors de la notification, tandis que **Pull** laisse les observateurs les récupérer auprès du `Subject`.