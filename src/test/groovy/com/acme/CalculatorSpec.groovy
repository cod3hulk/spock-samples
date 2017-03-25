package com.acme

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "adding two numbers and return the sum"() {
        given: "A calculator"
        def calculator = new Calculator();

        when: "Two numbers are added"
        def result = calculator.add(1, 1)

        then: "The result is the sum of the two numbers"
        result == 2
    }

    def "subtract two numbers and return the difference"() {
        given: "A calculator"
        def calculator = new Calculator();

        expect: "Two numbers are added"
        calculator.sub(a, b) == c

        where: "The result is the difference of the two numbers"
        a | b || c
        1 | 1 || 0
        1 | 2 || -1
        2 | 1 || 1
    }
}
