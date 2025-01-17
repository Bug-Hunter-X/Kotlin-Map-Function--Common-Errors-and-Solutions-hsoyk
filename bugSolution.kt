```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val nullableList = listOf(1, null, 3, null, 5)
    //Safe way to handle nulls using the Elvis operator
    val doubledNullableList = nullableList.map { it?.times(2) ?: 0 } 
    println(doubledNullableList) //Output: [2, 0, 6, 0, 10]  

    val stringList = listOf("apple", "banana", "cherry")
    val upperCaseList = stringList.map { it.uppercase() }
    println(upperCaseList) //Output: [APPLE, BANANA, CHERRY]

    //Correctly handling a potential type mismatch.  Use a filter or other logic before mapping if there are multiple types.
    val mixedList = listOf(1, "two", 3, "four")
    val stringListOnly = mixedList.filterIsInstance<String>().map { it.uppercase() }
    println(stringListOnly) //Output: [TWO, FOUR]
}
```