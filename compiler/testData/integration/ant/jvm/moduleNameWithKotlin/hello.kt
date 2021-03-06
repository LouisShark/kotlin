package hello

fun main(args: Array<String>) {
    val systemClassLoader = ClassLoader.getSystemClassLoader()
    val moduleFile = "META-INF/build.kotlin_module"
    val resourceAsStream = systemClassLoader.getResourceAsStream(moduleFile)

    if (resourceAsStream != null) {
        println("Module info '$moduleFile' exists")
    }
}
