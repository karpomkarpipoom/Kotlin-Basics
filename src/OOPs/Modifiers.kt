package OOPs

open class CentralGovernment {

    val publicStatement = "Public Message - to All over India"

    private val PrivateStatement = "Private Message - Inside Office"

    protected val ProtectStatement = "Protected Message - Inside Government Message"

    internal val internamlMessage = "Public Media - Accessing People"

}

class StateGovernment : CentralGovernment(){

    fun GetStatements(){

        this.publicStatement
        this.ProtectStatement
        this.internamlMessage

    }

}

fun main(){

    val media = StateGovernment()
    media.internamlMessage
    media.publicStatement

}