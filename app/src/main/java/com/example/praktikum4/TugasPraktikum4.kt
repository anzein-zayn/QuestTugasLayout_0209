package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasPraktikum4(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 10.dp)
            .fillMaxSize().background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.universitas),
            color = Color.Black,
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .align(Alignment.CenterHorizontally)
                .padding(all = 15.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.kartu_abu)
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column() {
                    Text(
                        stringResource(R.string.name),
                        fontSize = 23.sp,
                        fontStyle = FontStyle.Italic,
                        color = Color.White,
                        modifier = Modifier.padding(top = 20.dp, end = 2.dp)

                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 1.dp).padding(bottom = 1.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 0.dp).align(Alignment.CenterVertically),
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .align(Alignment.CenterHorizontally)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.kartu_ungu)
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 1.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column() {
                    Text(
                        stringResource(R.string.name1),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.White,
                        modifier = Modifier.padding(top = 5.dp, end = 25.dp)
                    )
                    Text(
                        stringResource(R.string.noTelp),
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.Cyan,
                        modifier = Modifier.padding(top = 2.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 2.dp).padding(bottom = 5.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(top = 2.dp)
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .align(Alignment.CenterHorizontally)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.kartu_biru)
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 1.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column() {
                    Text(
                        stringResource(R.string.name2),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.White,
                        modifier = Modifier.padding(top = 5.dp, end = 35.dp)
                    )
                    Text(
                        stringResource(R.string.noTelp1),
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.White,
                        modifier = Modifier.padding(top = 2.dp)
                    )
                    Text(
                        stringResource(R.string.alamat1),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 1.dp).padding(bottom = 5.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 1.dp)
                )
            }
        }
