package me.miguelmanosalva.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.miguelmanosalva.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen() {
    Column(modifier = Modifier.background(Color.Gray).padding(18.dp).fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Row(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .padding(18.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Inicio",
                modifier = Modifier.background(Color.Red)
            )
            Text(
                text = "Perfil",
                modifier = Modifier.background(Color.Yellow)
            )
            Text(
                text = "Configuracion",
                modifier = Modifier.background(Color.Blue)
            )
        }
        Text(
            text = "Encabezado",
            modifier = Modifier.background(Color.Red)
        )
        Text(
            text = "Cuerpo",
            modifier = Modifier.background(Color.Yellow)
        )
        Text(
            text = "Footer",
            modifier = Modifier.background(Color.Blue))
    }


}