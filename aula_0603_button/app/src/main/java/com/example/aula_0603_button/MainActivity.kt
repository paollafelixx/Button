package com.example.aula_0603_button

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula_0603_button.ui.theme.Aula_0603_buttonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        //Função que implementa o evento de clique em um botão
        btnCalcular.setOnClickListener {view : View? ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            // declaração implicita do tipo da variável
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()
            // declração explícita do tipo da variável
            var resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            }
            else if (resultado < 0.7){
                mensagem = "Álcool"
            }
            else {
                mensagem "Tanto faz"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula_0603_buttonTheme {
        Greeting("Android")
    }
}