import kotlinx.browser.document

fun main(){
    console.log("hello")
    println("hello world")
    val elementById = document.getElementById("content")
    console.log(elementById)
    elementById?.innerHTML = "<a href='contact.json'>contacts</a>"
}