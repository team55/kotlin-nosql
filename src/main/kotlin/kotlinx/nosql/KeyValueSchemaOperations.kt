package kotlinx.nosql

trait KeyValueSchemaOperations {
    fun <T : KeyValueSchema, C> T.get(c: T.() -> AbstractColumn<C, T, *>): C
    fun <T : KeyValueSchema, C> T.set(c: () -> AbstractColumn<C, T, *>, v: C)

    fun <X, S: Number, T: KeyValueSchema> AbstractColumn<X, T, S>.incr(value: S = 1 as S): X {
        val value = Session.current<Session>().incr(schema, this, value)
        if (columnType.id) {
            return Id<Any, TableSchema<Any>>(value) as X
        } else {
            return value as X
        }
    }
}
