package com.nphumbert.prime

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PrimeFactorsTest {

    @Test
    fun should_have_no_prime_factors_when_1() {
        assertThat(generate(1)).isEmpty()
    }

    @Test
    fun should_have_2_as_prime_factor_when_2() {
        assertThat(generate(2)).containsOnly(2)
    }

    @Test
    fun should_have_3_as_prime_factor_when_3() {
        assertThat(generate(3)).containsOnly(3)
    }

    @Test
    fun should_have_2_twice_as_prime_factors_when_4() {
        assertThat(generate(4)).containsOnly(2, 2)
    }

    @Test
    fun should_have_3_and_2_as_prime_factors_when_6() {
        assertThat(generate(6)).containsOnly(3, 2)
    }

    @Test
    fun should_have_2_three_times_as_prime_factors_when_8() {
        assertThat(generate(8)).containsOnly(2, 2, 2)
    }

    @Test
    fun should_have_3_and_3_as_prime_factors_when_9() {
        assertThat(generate(9)).containsOnly(3, 3)
    }

}