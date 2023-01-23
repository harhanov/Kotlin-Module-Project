class Management {
    fun manageArchives(archives: MutableList<String>, notes: MutableList<Pair<String, String>>) {
        while (true) {
            println("Список архивов:")
            for ((index, archive) in archives.withIndex()) {
                println("$index. $archive")
            }
            println("${archives.size}. Создать архив")
            println("${archives.size + 1}. Выход")

            val input = readLine() ?: continue
            if (!input.matches(Regex("[0-${archives.size + 1}]"))) {
                println("Пожалуйста, введите корректный символ.")
                continue
            }
            when (input.toInt()) {
                in 0 until archives.size -> manageNotes(archives[input.toInt()], notes)
                archives.size -> {
                    println("Введите название архива:")
                    val archiveName = readLine() ?: continue
                    archives.add(archiveName)
                }

                archives.size + 1 -> return
            }
        }
    }

    private fun manageNotes(selectedArchive: String, notes: MutableList<Pair<String, String>>) {
        while (true) {
            println("Заметки в архиве $selectedArchive:")
            for ((index, note) in notes.withIndex()) {
                println("$index. ${note.first}")
            }
            println("${notes.size}. Добавить заметку")
            println("${notes.size + 1}. Назад")

            val input = readLine() ?: continue
            if (!input.matches(Regex("[0-${notes.size + 1}]"))) {
                println("Пожалуйста, введите корректный символ.")
                continue
            }

            when (input.toInt()) {
                in 0 until notes.size -> {
                    println("Заголовок: ${notes[input.toInt()].first}")
                    println("Нажмите enter чтобы просмотреть текст заметки")
                    readLine()
                    println("Текст: ${notes[input.toInt()].second}")
                    println("Нажмите enter чтобы вернуться к списку заметок")
                    readLine()
                }

                notes.size -> {
                    println("Введите заголовок:")
                    val title = readLine() ?: continue
                    println("Введите текст:")
                    val text = readLine() ?: continue
                    notes.add(Pair(title, text))
                }

                notes.size + 1 -> return
            }
        }
    }
}