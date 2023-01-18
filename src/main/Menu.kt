abstract class MainView{
    abstract val menuItems: List<String>
    abstract val header: String
    abstract fun exit()
    abstract fun runActions()
    fun execute() {}

}
