/*
* O Singleton é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.
* */
class User(val id: Int, val name: String)

object UserManager {
    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val id = users.size + 1
        val user = User(id, name)
        users.add(user)
    }

    fun listUsers() {
        for (user in users) {
            println("${user.id} - ${user.name}")
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}
