package com.acme

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "adding two numbers and return the sum"() {
        when: "A new calculator is created"
        def calculator = new Calculator();

        then: "1 plus 1 is 2"
        calculator.add(1, 1) == 2
    }
}
