package mx.ipn.upiicsa.programacionmovil.citas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.ipn.upiicsa.programacionmovil.citas.entity.Genero
import mx.ipn.upiicsa.programacionmovil.citas.entity.Persona
import mx.ipn.upiicsa.programacionmovil.citas.ui.theme.CitasTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CitasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    var persona : Persona = Persona(1,"Montes","Hermes Francisco","Casiano", LocalDate.now())
    var generoA : Genero = Genero(1,"Masculino")
    var generoB : Genero = Genero(2,"Femenino", "Genero asignado a quienes se identifican con una mujer", true)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CitasTheme {
        Greeting("Android")
    }
}