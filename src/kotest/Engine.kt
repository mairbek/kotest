package kotest

trait Engine {
    fun runSuite(suite : Suite)
}

class StubEngine : Engine {

    override fun runSuite(suite: Suite) {
        val groups = suite.groups()

        for (group in groups) {
            println("====== group " + group.describe() + " ======")

            for (test in group.tests()) {
                println("--- test " + test.describe() + " ------")

                test.execute()

                println("------------------------")
            }
            println("====================")
        }
    }
}