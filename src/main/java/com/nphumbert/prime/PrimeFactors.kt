package com.nphumbert.prime

import java.util.*

fun generate(n: Int): List<Int> {

    var remains = n
    var factors = ArrayList<Int>()
    val primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)

    primes.forEach {
        while (remains % it == 0) {
            factors.add(it)
            remains /= it
        }
    }

    return factors
}

