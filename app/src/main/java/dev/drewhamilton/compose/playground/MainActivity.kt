package dev.drewhamilton.compose.playground

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.material.composethemeadapter.MdcTheme
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        assertPokoCorrectness()

        setContent {
            ProvideWindowInsets {
                MdcTheme {
                    Surface(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Compose Playground",
                            style = MaterialTheme.typography.h5
                        )
                    }
                }
            }
        }
    }

    private fun assertPokoCorrectness() {
        val poko1 = PokoItem("abc")
        val poko2 = PokoItem("abc")
        require(poko1 == poko2) {
            "Poko failure: <$poko1> and <$poko2> not equals"
        }
        require(poko1.hashCode() == poko2.hashCode()) {
            "Poko failure: <${poko1.hashCode()}> and <${poko2.hashCode()}> not equals"
        }
        require(poko1.toString() == poko2.toString() && poko1.toString() == "PokoItem(id=abc)") {
            "Poko failure: <$poko1> and <$poko2> produce unexpected strings"
        }
    }
}
