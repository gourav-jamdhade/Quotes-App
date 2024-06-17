package com.example.quotesapp.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesapp.R
import com.example.quotesapp.models.Quote


val data: Array<Quote> = emptyArray()

@Preview()
@Composable
private fun preview() {
    QuoteListScreen(data) { }
}

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote:Quote) -> Unit) {

    Column {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineMedium,
            fontFamily = FontFamily(Font( R.font.montserrat_regular))
        )
        QuoteList(data,onClick)
    }

}