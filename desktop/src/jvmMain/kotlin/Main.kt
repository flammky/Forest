import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.flammky.vars.forest.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
