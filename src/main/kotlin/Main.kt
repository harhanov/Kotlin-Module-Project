import java.util.Scanner
import jdk.tools.jlink.internal.Archive as Archive

fun main(args: Array<String>) {

    val notesArchive = mutableListOf<String>()

    while (true) {
        val header = "Список заметок:"
        println(header)
        println("0. Создать заметку")
        println("1. Вывести заметки")


        when (readLine()) {
            "0" -> {
                println("Введите заметку:")
                val note = readLine() ?: ""

                notesArchive.add(note)

                println("Заметка добавлена!")
            }

            "1" -> {
                if (notesArchive.isEmpty()) {
                    println("Архив заметок пуст!")
                    continue  // продолжить цикл со следующей итерации, не выполняя остальных действий этой итерации цикла.
                }

                for (note in notesArchive) println("${notesArchive.indexOf(note)+2}. $note")

            }
            notesArchive.size.toString() -> {
                break // выйти из цикла while.
            }

            else -> println("Неверная команда!") // default-case, выполняемое, если command != "add", "read", "exit".

        } // end of when-statement.

    } // end of while-loop.
}

