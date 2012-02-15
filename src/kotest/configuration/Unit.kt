package kotest.configuration

import java.util.ArrayList
import java.util.List
import kotest.Suite
import kotest.Group
import kotest.Test
import kotest.Describable

abstract class SuiteConfig : Suite {

    val groups = ArrayList<Group>

    val nothing = configure()

    fun group(name : String, init : ConfigurableGroup.()->Unit) {

        val config = ConfigurableGroup(name)

        config.init()

        groups.add(config)
    }
    override fun groups() = groups

    override fun describe(): String {
        return "TODO"
    }

    abstract fun configure()

}

class ConfigurableGroup(val name : String) : Group {

    val tests = ArrayList<Test>()

    fun test(name : String, exec : () -> Unit) {
        tests.add(object : ConfigurableTest(name) {

            override fun execute() {
                exec()
            }
        })
    }

    override fun tests() = tests

    override fun describe() = name
}

// todo avoid copy paste
abstract class ConfigurableTest(val name : String) : Test {

    override fun describe() = name


}

