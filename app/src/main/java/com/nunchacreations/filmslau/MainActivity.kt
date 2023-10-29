package com.nunchacreations.filmslau

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.cursosandroidant.filmsjcref.dataAccess.FakeDatabase
import com.nunchacreations.filmslau.ui.theme.FilmsLauTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmsLauTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // ListBasic(FakeDatabase.getAllFilms())
                    ListAdvance(FakeDatabase.getAllFilms())
                }
            }
        }
    }
}
@Composable
fun ListAdvance(films: List<Film>) {
    val context = LocalContext.current
    LazyColumn{
        items(films.size){
            /*ItemListClick(filmName = films[it].name, modifier = Modifier.clickable {
                var nameFilm = films[it].name
                Toast.makeText(context, "Película: ${nameFilm}", Toast.LENGTH_SHORT).show()
            })
            Divider()*/
            val film = films[it]
            ItemListAdvance(film = film, modifier = Modifier.clickable {
                var nameFilm = films[it].name
                Toast.makeText(context, "Película: ${nameFilm}", Toast.LENGTH_SHORT).show()
            })
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemListAdvance(film: Film, modifier: Modifier){
    Column(modifier = modifier){
        androidx.compose.material3.ListItem(
            headlineText = {Text(film.name, style = MaterialTheme.typography.bodyMedium)},
            supportingText = {Text(film.description,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis)},

            leadingContent = {
                Icon(
                    Icons.Filled.Star,
                    contentDescription ="Holitas",
                )
            })
        Row() {
            //Text(text = film.filmCast)
        }
        Divider()
    }
}
@Composable
fun ItemListClick(filmName : String, modifier : Modifier){
    Text(text = filmName, modifier = modifier
        .fillMaxWidth()
        .padding(dimensionResource(id = R.dimen.common_padding_default)),
        style= MaterialTheme.typography.headlineSmall)
}
@Composable
fun ListBasic(films: List<Film>){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        films.forEach {film ->
            ItemListBasic(film.name)
        }
    }
}

@Composable
fun ItemListBasic(filmName : String){
    Text(text = filmName, modifier = Modifier
        .fillMaxWidth()
        .padding(dimensionResource(id = R.dimen.common_padding_default)),
        style= MaterialTheme.typography.headlineSmall)
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FilmsLauTheme {
        ListBasic(FakeDatabase.getAllFilms())
    }
}