package tinyfingers

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*
import tinyfingers.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello World!", bodyAsText())
        }
        client.get("/healthcheck").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Welcome to CinePass", bodyAsText())
        }
    }
}
