fun main() {
    val noteApp = NoteApp()
    noteApp.start()
}

class NoteApp {
    private val archives = mutableListOf<String>()
    private val notes = mutableListOf<Pair<String, String>>()

    fun start() {
        val menu = Management()
        menu.manage("Список архивов:", archives, { selectedArchive ->
            menu.manage("Заметки в архиве $selectedArchive:", notes, { selectedNote ->
                println("Заголовок: ${selectedNote.first}")
                println("Нажмите enter чтобы просмотреть текст заметки")
                readLine()
                println("Текст: ${selectedNote.second}")
                println("Нажмите enter чтобы вернуться к списку заметок")
                readLine()
            }, {
                println("Введите заголовок:")
                val title = readLine() ?: return@manage
                println("Введите текст:")
                val text = readLine() ?: return@manage
                notes.add(Pair(title, text))
            })
        }, {
            println("Введите название архива:")
            val archiveName = readLine() ?: return@manage
            archives.add(archiveName)
        })
    }
}

