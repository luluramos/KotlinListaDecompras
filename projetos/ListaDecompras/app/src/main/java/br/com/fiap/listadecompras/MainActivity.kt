package br.com.fiap.listadecompras

import android.os.Bundle
import android.widget.Button
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
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.listadecompras.ui.theme.ListaDecomprasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    setContentView(R.layout.activity_main)

    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
    val itemsAdapter = ItemsAdapter()
    recyclerView.adapter = itemsAdapter

    val button = findViewById<Button>(R.id.button)
    val editText = findViewById<EditText>(R.id.editText)

    //O editText devolve um objeto

    button.setOnClickListener
    {
        val item = ItemModel(
            name = editText.text.toString()
        )

        itemsAdapter.addItem(item)
    }
}
