import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import di.initializeKoin
import org.jetbrains.compose.ui.tooling.preview.Preview
import presenter.screen.HomeScreen

@Composable
@Preview
fun App() {

    //val colors = if (!isSystemInDarkTheme()) lightScheme else darkScheme
   
    MaterialTheme {
        Navigator(HomeScreen())
    }
}