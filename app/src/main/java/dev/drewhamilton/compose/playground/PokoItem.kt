package dev.drewhamilton.compose.playground

import dev.drewhamilton.poko.Poko

@Poko class PokoItem(
    val id: String
) {
    // Uncomment this and compilation is fixed:
//    override fun hashCode(): Int = id.hashCode()
}
