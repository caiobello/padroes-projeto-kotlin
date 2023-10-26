/*As Extension Functions, ou Funções de Extensão, são recursos poderosos disponíveis em linguagens de programação que permitem adicionar métodos a classes existentes sem a necessidade de modificar o código-fonte original dessas classes. Isso facilita a criação de novas funcionalidades ou comportamentos para tipos de dados já existentes, mesmo quando você não tem acesso ao código fonte original desses tipos.*/

fun main() {
        val titulo = readLine() ?: ""
        val autor = readLine() ?: ""

        println("Slug gerado para o livro:")
        println("${titulo.generateSlug()}_${autor.generateSlug()}")
}

fun String.generateSlug(): String {
        return this.toLowerCase()
                .replace("\\s+".toRegex(), "-")
                .replace("[^a-zA-Z0-9-]".toRegex(), "")
                .replace("-{2,}".toRegex(), "-")
                .trim('-')
}
