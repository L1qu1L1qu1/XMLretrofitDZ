
class Somethink : ArrayList<SomethinkItem>()

data class SomethinkItem(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val deleted: Boolean,
    val source: String,
    val status: Status,
    val text: String,
    val type: String,
    val updatedAt: String,
    val used: Boolean,
    val user: String
)

data class Status(
    val feedback: String,
    val sentCount: Int,
    val verified: Boolean
)