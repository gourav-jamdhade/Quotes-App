package com.example.quotesapp.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.quotesapp.models.Quote


@Composable
fun QuoteList(data : Array<Quote>,onClick:(quote:Quote)->Unit) {

    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it,onClick)
        }
    })
}