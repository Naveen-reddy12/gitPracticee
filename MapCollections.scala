import java.net.http.HttpClient.Builder
// import scala.collection.mutable.Map
// import scala.collection.mutable.Map
object MapCollections extends App{
    //empty Map
    var a:Map[String,Int] = Map()
    println(a)

    var numbers = Map(1 -> "one",2->"Two")
    println(numbers)

    //adding key-value pair to the map
    numbers += (3->"Three")
    numbers = numbers + (4->"Four")
    println(numbers)

    //operations
    //keys
    val keys = numbers.keys
    println(s"keys: $keys")
    println(keys)

    //values
    val  values = numbers.values
    println(s"values: $values")

    val nums = Map(1 -> 1,2 -> 2, 3 -> 3)
    println(nums.keys)
    println(nums.values)
    println(nums.keys == nums.values)

    println(nums.isEmpty)

    //concatenating
    val numbers1 = Map(3->"Three",4->"Four",5->"Five")
    val numss = numbers ++ numbers1
    println(s"concatenate numbers: $numss")
    println(s"con Nums: ${numbers.++(numbers1)}")

    //iterating on keys
    numss.keys.foreach(key => {println(s"key: $key"); println(s"Value: ${numss(key)}")})

    //check for a key in map

    if(numss.contains(2)) println("Found")else println("not Found")
    if(numss.contains(23)) println("Found")else println("not Found")

    //set methods
    val remMap = numss - (1,2)
    println(remMap)

    //--
    println(numss)

    val remMapp = numss -- Seq(1,2,3)
    println(remMapp)

    //get
    println(s"value of 1 is: ${numss.get(1)}")

    //removed
    // println(s"after removed: ${numss.removed(5)}")

    //iterartor
    val iter = nums.iterator
    iter.foreach{case (key,value) => {println(s"key is $key");println(s"value is $value")}}

    //
    // numss(1) = "Tene"
    println(numss)

    //stringBuilder
    val stringBuilder = new StringBuilder
    val aaddString = numss.addString(stringBuilder," ")
    println(aaddString)

    //apply
    println(numss.apply(2))

    //clear
    // numss.clear()
    println(numss)

    //contains
    println(numss.contains(3))

    // clone()
    // val copy = numss.clone()
    // println(copy == numss)
    val clonedMap = Map.from(numss)
    println(numss == clonedMap)

    //copyToArray()
    val array = new Array[(Int,String)](numss.size)
    numss.copyToArray(array)
    println(array)

    array.foreach(println)

    //count
    numss ++ Map(1->"One")
    println(numss)
    println(numss.count((key,value) => key == 2))

    //default
    val n: Map[Int, String | Int] = Map(1->"One").withDefaultValue(0)
    //getOrElse
    println(numss.getOrElse(8,0))
    // numss.default(8)
    // println(n.get(2))
    // println(n.get(1))

    println(numss.drop(2))

    //drop
    var nu = Map(1 -> "naveen",2 -> "reddy",3->"koduru")
    println(nu.drop(2))

    //dropRight
    println(nu.dropRight(1))

    //dropWhile
    val nms = nu ++ Map(4-> "Venky",5-> "reddy")
    println(nms)
    // println(nms.dropWhile((key,value) => (key == 2)))
    val res = nms.dropWhile((key,value) => key > 2)
    println(res)

    //empty
    println(nms.empty)

    //equals
    val nu1 = Map(1 -> "naveen",2 -> "reddy",3->"koduru")
    println(nu.equals(nu1))

    //exists

    println(nms.exists((key,value) => key == 2))

    //filter
    println(nms.filter((key,value) => key %2 == 0))

    //filterKeys
    val evenkeys = nms.filterKeys(k => k % 2 != 0)//it creates a mapView,
    println(evenkeys.toMap)

    //find
    val firdEven = nms.find((key,_) => key %2 == 0)
    println(firdEven)

    //init
    println(nms.init)

    //isEmpty
    println(nms.isEmpty)

    //mkString
    println(nms.mkString(" "))//.getClass.getSimpleName())

    //product
    println(nms.keys.product)

    //sum
    println(nms.keys.sum)

    //remove
    // val value = nms.remove(1)
    // println(value)
    println(nms)
    // println(nms.remove(2))

    //retain
    // val retaiMap = nms.retain((key,_) => key > 3)
    // println(retaiMap)

    //takeWhile
    println(nms)
    val ms = Map(1 -> "one", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five")
    val first3 = ms.takeWhile((key,value) => key <= 4)//only in mutsable maps
    println(ms)
    println("take While " + first3)

    println("ms.toArray.foreach(println)")
    ms.toArray.foreach(println)

    //toBuffer
    // ms(2) = "Ten"

    val buffer = ms.toBuffer
    println(ms)
    println(buffer)
    buffer(2) = (10 ->"Ten")
    println(buffer)

    // /toList
    println("map -> list")
    println(ms)
    println(ms.toList)

    //toSeq
    println(ms.toSeq)

    //toSet
    println(ms.toSet)

    //toString
    println(ms.toString())
}