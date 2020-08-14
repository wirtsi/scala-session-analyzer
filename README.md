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

Weirdly enough the parallel version is slower

Elapsed time: 829ms
Elapsed time: 846ms
Elapsed time: 601ms
Elapsed time: 700ms
Elapsed time: 656ms
Elapsed time: 807ms
Elapsed time: 735ms
Elapsed time: 686ms
Elapsed time: 678ms
Elapsed time: 670ms

