package org.pandawarrior.app

/**
 * Created by jt on 5/28/15.
 */
class CalculationTest extends GroovyTestCase {
    void testAddition(){
        assert Calculation.addition(1, 3) == 2
    }
}
