package carregistration

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CarroSpec extends Specification implements DomainUnitTest<Carro> {

     void "test domain constraints"() {
        when:
        Carro domain = new Carro()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
