package carregistration

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CarroControllerSpec extends Specification implements ControllerUnitTest<CarroController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
