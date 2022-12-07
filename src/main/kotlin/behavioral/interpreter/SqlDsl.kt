package behavioral.interpreter

object SqlDsl {

    fun select(columns: String, from: SelectClause.()->Unit): SelectClause {
        return SelectClause(columns).apply(from)
    }

    class SelectClause(private val columns: String) {
        private lateinit var from: FromClause

        fun from(table: String, where: FromClause.()->Unit): FromClause {
            this.from = FromClause(table)
            return this.from.apply(where)
        }

        override fun toString(): String {
            return "SELECT $columns ${this.from}"
        }
    }

    class FromClause(private val table: String) {
        private lateinit var where: WhereClause

        fun where(conditions: String) = this.apply {
            where = WhereClause(conditions)
        }

        override fun toString(): String {
            return "FROM $table ${this.where}"
        }
    }

    class WhereClause(private val conditions: String) {
        override fun toString(): String {
            return "WHERE $conditions"
        }
    }

}
