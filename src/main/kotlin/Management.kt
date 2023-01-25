class Management {
    fun <T> manage(title: String, list: List<T>, onSelect: (T) -> Unit, onCreate: () -> Unit) {
        while (true) {
            println(title)
            for ((index, item) in list.withIndex()) {
                println("$index. $item")
            }
            println("${list.size}. Создать")
            println("${list.size + 1}. Выход")

            val input = readLine() ?: continue
            if (!input.matches(Regex("[0-${list.size + 1}]"))) {
                println("Пожалуйста, введите корректный символ.")
                continue
            }
            when (input.toInt()) {
                in 0 until list.size -> onSelect(list[input.toInt()])
                list.size -> onCreate()
                list.size + 1 -> return
            }
        }
    }
}