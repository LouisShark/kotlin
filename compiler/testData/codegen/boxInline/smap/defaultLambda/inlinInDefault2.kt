// FILE: 1.kt
// SKIP_INLINE_CHECK_IN: lParams$default
package test

//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]
//A lot of blank lines [Don't delete]

inline fun kValue() = "K"

inline fun lParams(initParams: () -> String = {
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    "O" + kValue()
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
    //A lot of blank lines [Don't delete]
}): String {
    val z = "body"
    return initParams()
}

// FILE: 2.kt
import test.*

fun box(): String {
    return run {
        lParams()
    }
}

// FILE: 1.smap
SMAP
1.kt
Kotlin
*S Kotlin
*F
+ 1 1.kt
test/_1Kt
*L
1#1,74:1
70#1,2:75
*E

SMAP
1.kt
Kotlin
*S Kotlin
*F
+ 1 1.kt
test/_1Kt$lParams$1
+ 2 1.kt
test/_1Kt
*L
1#1,74:1
29#2:75
*E
*S KotlinDebug
*F
+ 1 1.kt
test/_1Kt$lParams$1
*L
50#1:75
*E

// FILE: 2.smap

SMAP
2.kt
Kotlin
*S Kotlin
*F
+ 1 2.kt
_2Kt
+ 2 Standard.kt
kotlin/StandardKt__StandardKt
+ 3 1.kt
test/_1Kt
+ 4 1.kt
test/_1Kt$lParams$1
*L
1#1,10:1
34#2,4:11
31#3:15
70#3,2:16
29#3:19
50#4:18
68#4:20
*E
*S KotlinDebug
*F
+ 1 2.kt
_2Kt
*L
5#1,4:11
5#1:15
5#1,2:16
5#1:19
5#1:18
5#1:20
*E