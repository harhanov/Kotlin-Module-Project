class Main {
    private val archives =  mutableListOf<String>()
    private val notes =  mutableListOf<Pair<String, String>>() //Одна строка для названия, вторая содержит текст заметки.

    fun start() {
        val management = Management()
        management.manageArchives(archives, notes)
    }
}

fun main() {
    val noteApp = Main()
    noteApp.start()
}