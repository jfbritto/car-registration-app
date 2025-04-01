package carregistration

class Carro {
    String marca
    String modelo
    Integer ano

    static constraints = {
        marca nullable: false, blank: false
        modelo nullable: false, blank: false
        ano nullable: false, min: 1886  // O primeiro carro surgiu em 1886
    }
}
