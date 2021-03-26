package com.bybutter.sisyphus.benchmark.official

import com.bybutter.sisyphus.benchmark.datasets.BenchmarkMessage1Proto3
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State

@State(Scope.Benchmark)
open class OfficialRunner {
    private val message = BenchmarkMessage1Proto3.GoogleMessage1.newBuilder().apply {
        field1 = "sisyphus benchmark"
        field9 = """
            Due to analyzing product documents completely, it is not particularly difficult to write an exquisite and easy-to-use API at the beginning for most APIs.

            However, many people will break the initial design of the API in the endless updates of products.

            It's hard to create a strong and extensible API in the whole project lifetime, just like rolling a huge boulder endlessly up a steep hill.

            So we need an all-encompassing guide book to guide us in creating, updating, and modifying APIs.

            The Google API Improvement Proposals is the all-encompassing guide book. Google created it in their rich and extensive API design experience. It laid the foundation for anyone to create an extensible API.
        """.trimIndent()
        field80 = true
        field81 = false
        field2 = 123456
        field3 = 2147483647
        field280 = 0
        field22 = 9223372036854775807
        field4 = ""
        addField5(123456)
        addField5(123456)
        addField5(0)
        addField5(2147483647)
        addField5(9223372036854775807)
        field7 = ""
        field16 = -2147483648
        field130 = -1
        field12 = true
        field17 = false
        field13 = true
        field14 = false
        field104 = 654321
        field100 = 1234657821
        field101 = -987416734
        field102 = "sisyphus benchmark"
        field103 = "sisyphus benchmark"
        field29 = 0
        field30 = true
        field60 = 60
        field271 = 271
        field272 = 272
        field150 = 150
        field23 = 23
        field24 = false
        field25 = 25
        field15 = BenchmarkMessage1Proto3.GoogleMessage1SubMessage.newBuilder().apply {
            field1 = 1
            field2 = 2
            field3 = 3
            field15 = ""
            field12 = false
            field13 = 13
            field14 = 14
            field16 = 16
            field19 = 19
            field20 = false
            field28 = false
            field21 = 21
            field22 = 22
            field23 = false
            field206 = false
            field203 = 203
            field204 = 204
            field205 = "205"
            field207 = 207
            field300 = 300
        }.build()
        field78 = false
        field67 = 67
        field68 = 68
        field128 = 128
        field129 =
            "Sisyphus is the way how we provide backend services. It integrates all tools and libraries needed for designing API which follows the Google API Improvement Proposals."
        field131 = 131
    }.build()
    private val data = message.toByteArray()

    @Benchmark
    fun operate() {
        val message = BenchmarkMessage1Proto3.GoogleMessage1.parseFrom(data)
        message.toByteArray()
    }
}