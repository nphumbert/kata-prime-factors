package com.nphumbert.prime

import com.pholser.junit.quickcheck.Property
import com.pholser.junit.quickcheck.generator.InRange
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@RunWith(JUnitQuickcheck::class)
class PrimeFactorsTest {

    @Test
    fun should_have_no_prime_factors_when_1() {
        assertThat(generate(1)).isEmpty()
    }

    @Property
    fun should_generate_prime_factors(@InRange(minInt = 2, maxInt = 20) number: Int) {
        val factors = generate(number)
        val primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)

        factors.forEach { assertThat(primes).contains(it) }
        assertThat(number).isEqualTo(factors.reduce { first, second -> first * second })
    }

}