val orisha: String = "Oya"
val anInteger = 2 
val aFloat = 3.0 
val acomp = 5L 
val cutChar = orisha(0)
val aSymbol = 'dope
val noneval = null 
val rangeOfInts = (1 to 200).toList
val coerceList = List(0, 1, 2, 3, 4, 5, 6, 7)  
val tuple = (orisha, aFloat, noneval, rangeOfInts)

tuple._1
tuple._2

val xmlRepresentation = <p><a href="http://instagram.com/">Hood Physics</a></p>
val unitType : Unit  = ()
val unitType2 = ()
val aMapper = Map("name" -> "aMapper", "weight" -> 34, "height" -> 30)

aMapper.get('name')
aMapper.getOrElse("color", "black")
