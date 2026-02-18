package mx.edu.itson.practica3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import mx.edu.itson.practica3.ProductosActivity
import mx.edu.itson.practica3.R




class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.hide()

        var cold_drinks: Button = findViewById(R.id.button_cold_drinks) as Button
        var hot_drinks: Button = findViewById(R.id.button_hot_drinks) as Button
        var combos: Button = findViewById(R.id.button_combos) as Button
        var salties: Button = findViewById(R.id.button_salties) as Button
        var custom: Button = findViewById(R.id.button_custom) as Button
        var sweets: Button = findViewById(R.id.button_sweets) as Button


        cold_drinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Cold_Drinks")
            intent.putExtra("Cold_Drinks", R.drawable.drinks)
            startActivity(intent)
        }

        hot_drinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Hot_Drinks")
            intent.putExtra("Hot_Drinks", R.drawable.drinks)
            startActivity(intent)

        }
        combos.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Combos")
            intent.putExtra("Combos", R.drawable.combinations)
            startActivity(intent)
        }
        salties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Salties")
            intent.putExtra("Salties", R.drawable.antojitos)
            startActivity(intent)
        }
        custom.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Custom")
            intent.putExtra("Custom", R.drawable.especialidades)
            startActivity(intent)
        }
        sweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Sweets")
            intent.putExtra("Sweets", R.drawable.especialidades)
            startActivity(intent)
        }

    }
}