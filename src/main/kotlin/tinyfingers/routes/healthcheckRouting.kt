package tinyfingers.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.healthcheckRouting() {
    route("/healthcheck") {
        get {
            call.respondText("Welcome to CinePass", status = HttpStatusCode.OK)
        }
    }

}
