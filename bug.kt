```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val nullableList = listOf(1, null, 3, null, 5)
    val doubledNullableList = nullableList.map { it?.times(2) ?: 0 } 
    println(doubledNullableList) //Output: [2, 0, 6, 0, 10]
    
    val stringList = listOf("apple", "banana", "cherry")
    val upperCaseList = stringList.map { it.uppercase() }
    println(upperCaseList) //Output: [APPLE, BANANA, CHERRY]

    //Example of common error: using map with a type mismatch
    // val wrongList = list.map { it as String }
    //println(wrongList)
} 
```