import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File


//ТЗ: заполнить лист plantsList данными о растениях.
//Пример есть снизу.
//Затем записать результат в файл и скинуть его мне.

//Пример пути до файла
private const val PATH = "C:\\Users\\PC-Home\\Documents\\plantsInfo.txt"

fun main() {
    val json = Json.encodeToString(plantsList)
    File(PATH).writeText(json)
}

@Serializable
data class PlantModel(
    val name: String,
    val sort: String,
    val growingTime: Int // Время выращивания указать в днях
)

//Пример заполнения листа с данными
val plantsList = listOf(
    PlantModel(
        name = "Морковь",
        sort = "Наполи",
        growingTime = 90
    ),
    PlantModel(
        name = "Морковь",
        sort = "Дордонь",
        growingTime = 120
    )

)