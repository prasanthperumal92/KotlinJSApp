external fun require(module: String): dynamic

fun main()  {
    val http = require("http")
    val hostname = "127.0.0.1"
    val port = 8080
    println("Server will try to run at http://$hostname:$port/")
    val server =
        http.createServer { _, res ->
            res.statusCode = 200
            res.setHeader("Content-Type", "application/json")
            res.end(Contact("John Doe", "9999999999").toString())
        }
    server.listen(
        port,
        hostname,
        fun() {
            println("Server running at http://$hostname:$port/")
        },
    )
}
