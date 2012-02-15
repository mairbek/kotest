package kotest

import java.util.List
import java.util.ArrayList

trait Describable {
    fun describe() : String
}

trait Suite : Describable {

    fun groups() : List<Group>
}

trait Group : Describable {

    fun tests() : List<Test>

}

trait Test : Describable {

    // todo pass some context here???
    fun execute()

}
