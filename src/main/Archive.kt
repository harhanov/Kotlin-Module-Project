class Archive(title: String):MainView() {
    header = "Список архивов:"
    while (true){
        println(header)
        println("0. Создать архив")
        println("1. Это мой уже созданный архив")
        println("2. Выход")
        val scan = Scanner(System.`in`).nextLine()
        if(scan.equals("2")){
            break;
        }
    }
    val fun addNote(){

    }
}