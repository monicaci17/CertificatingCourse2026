package com.example.certificatingcourse2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificatingcourse2026.ui.theme.CertificatingCourse2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificatingCourse2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Mónica Jacqueline Cortina Islas",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(name: String, modifier: Modifier = Modifier) {
    val course = "Android\n"
    val number = 2
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
            verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.unam),
                contentDescription = null,
                modifier = modifier.size(50.dp,50.dp),
            )
            Text(
                text = "Facultad de Ingeniería\nUNAM",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = modifier
            )
            Image(
                painter = painterResource(id = R.drawable.fiunam),
                contentDescription = null,
                modifier = modifier.size(50.dp,50.dp),
            )

        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "This certificate is presented to:",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp),
                alpha = 0.3F
            )
            Text(
                text = name,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = " has completed a $number hours course on ",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = course,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.momo),
                    contentDescription = null,
                    modifier = modifier.size(90.dp, 90.dp),
                )
                Text(
                    text = "Nora Pedraza",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                )
                Text(
                    text = "Representatives",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                )
            }
            Column(
                modifier = modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hoshi),
                    contentDescription = null,
                    modifier = modifier.size(100.dp, 90.dp),
                )
                Text(
                    text = "Leo Flores",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                )
                Text(
                    text = "Representatives",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificatingCourse2026Theme {
        CertificatingCourse("Mónica Jacqueline Cortina Islas")
    }
}