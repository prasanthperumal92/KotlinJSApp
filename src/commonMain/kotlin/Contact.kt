import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Contact(val name: String,val phone:String){
    override fun toString(): String {
        return Json.encodeToString(this)
    }
}