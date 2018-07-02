package composite

class FileTreatmentException() : RuntimeException() {
    constructor(msg: String) : this() {
        RuntimeException(msg)
    }
}