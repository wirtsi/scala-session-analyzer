# scala-session-analyzer

Analyze a 250MB csv file. Data in it looks like this

```
"Blue",3,"2019-09-07","color","User 0"
"Red",1,"2019-09-07","color","User 0"
"Crystal",5,"2019-09-07","color","User 0"
"Beige",2,"2019-09-07","color","User 0"
"Brown",3,"2019-09-07","color","User 0"
"Yellow",2,"2019-09-07","color","User 0"
"White",3,"2019-09-07","color","User 0"
"Purple",3,"2019-09-07","color","User 0"
"Black",4,"2019-09-07","color","User 0"
"Grey",5,"2019-09-07","color","User 0"
```

The idea is to aggregate the second column per color (and potentially per User
and color).


```
SBT_OPTS="-Xmx6G" sbt run
```
With idle CPU, the parallel collection is roughly twice as fast.

Elapsed time: 528ms
Elapsed time: 349ms
Elapsed time: 500ms
Elapsed time: 387ms
Elapsed time: 482ms
Elapsed time: 637ms
Elapsed time: 696ms
Elapsed time: 726ms
Elapsed time: 641ms
Elapsed time: 644ms
