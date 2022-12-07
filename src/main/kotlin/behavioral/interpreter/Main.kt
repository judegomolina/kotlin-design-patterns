package behavioral.interpreter

fun main() {
    val sql = with(SqlDsl) {
        select("name, age") {
            from("users") {
                where("age > 25")
            }
        }
    }

    println(sql)
}
