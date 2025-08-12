package br.senai.sp.jandira.clientesapp.screens.cliente.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.clientesapp.R
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme
import br.senai.sp.jandira.clientesapp.ui.theme.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraDeTitulo(modifier: Modifier = Modifier){
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Maia Reficco",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = "maia@gmail.com",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(4.dp),
                    shape = CircleShape
                ) {
                    Image(
                        painter = painterResource(R.drawable.maia),
                        contentDescription = "Foto de perfil",
                        contentScale = ContentScale.Crop
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}

@Preview
@Composable
private fun BarraDeTituloPreview(){
    ClientesAppTheme {
        BarraDeTitulo()
    }
}