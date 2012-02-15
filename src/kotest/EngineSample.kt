package kotest

import java.util.List
import java.util.ArrayList
import kotest.configuration.SuiteConfig


fun main(args : Array<String>) {


    val engine = StubEngine()

    engine.runSuite(object : SuiteConfig() {

        override fun configure() {
            group("fun") {

                test("first test") {
                   println("TESTING")
                }

                test("second test") {
                   println("TESTING")

                }

            }
        }
    })

}
