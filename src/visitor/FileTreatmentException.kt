package visitor

class FileTreatmentException() : RuntimeException() {
    constructor(msg: String) : this() {
        RuntimeException(msg)
    }
}