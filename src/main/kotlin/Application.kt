package ro.etataru.storemgmt

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ro.etataru.storemgmt.plugins.configureRouting
import ro.etataru.storemgmt.plugins.configureSerialization

fun main() {
    embeddedServer(
        Netty,
        port = 8080, // This is the port on which Ktor is listening
        host = "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureRouting()
    configureSerialization()
}