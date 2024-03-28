package com.example.test.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.test.data.model.InfoRes

@Composable
fun CardCharacters(
    funTextButton: (String) -> Unit,
    textButton: String,
    funIsShowMore: (Boolean) -> Unit,
    isShowMore: Boolean,
    infoRes: InfoRes
    ){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        elevation = CardDefaults.cardElevation(8.dp) ){
      Column(modifier = Modifier
          .fillMaxSize()
          .padding(20.dp),
            Arrangement.Center
          ){
          AsyncImage(modifier = Modifier
              .fillMaxWidth(),
              model = infoRes.image,
              contentDescription = "icture",

          )
          Text( modifier = Modifier
              .align(Alignment.CenterHorizontally),
              fontSize = 30.sp,
          text = infoRes.name)

          Button(modifier = Modifier
              .fillMaxWidth()
              .padding(horizontal = 8.dp),
              onClick = {
                  if(isShowMore){

                      funTextButton("ver detalle")
                      funIsShowMore(false)
                  }else{
                      funTextButton("ocultar detalle")
                      funIsShowMore(true)
                  }

              }) {
              Text(textButton)
          }
          if(isShowMore){
              Text("status: ${infoRes.status}, Especie: ${infoRes.species}, Tipe: ${infoRes.type}, Genero: ${infoRes.gender}, Origen: ${infoRes.origin.name}, Location: ${infoRes.location.name}")
          }
      }
    }

}