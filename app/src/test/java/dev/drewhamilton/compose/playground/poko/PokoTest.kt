package dev.drewhamilton.compose.playground.poko

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PokoTest {

    @Test fun twoEquivalentPokoItems_areEquals() {
        val poko1 = PokoItem("abc")
        val poko2 = PokoItem("abc")
        assertThat(poko1).isEqualTo(poko2)
    }

    @Test fun twoEquivalentPokoItems_haveSameHashCode() {
        val poko1 = PokoItem("abc")
        val poko2 = PokoItem("abc")
        assertThat(poko1.hashCode()).isEqualTo(poko2.hashCode())
    }

    @Test fun twoEquivalentPokoItems_haveSameToString() {
        val poko1 = PokoItem("abc")
        val poko2 = PokoItem("abc")
        assertThat(poko1.toString()).isEqualTo(poko2.toString())
        assertThat(poko1.toString()).isEqualTo("PokoItem(id=abc, count=1)")
    }
}
