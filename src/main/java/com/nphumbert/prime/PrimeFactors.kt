package com.nphumbert.prime

import java.util.*

fun generate(n: Int) : List<Int> {

    var remains = n
    var primes = ArrayList<Int>()

    while (remains % 2 == 0) {
        primes.add(2)
        remains /= 2
    }

    if (remains > 1) {
        primes.add(remains)
    }

    return primes
}
