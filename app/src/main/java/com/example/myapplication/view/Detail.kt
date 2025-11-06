package com.example.myapplication.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.myapplication.R



@Composable
fun TampilData(
    onBackBtnClick:() -> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = {Text(text = stringResource(id=R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.teal_700))
            )
        }){     isiRuang->
        Column
    }
}