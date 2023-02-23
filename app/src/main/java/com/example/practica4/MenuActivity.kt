package com.example.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)



        var btnAntojitos:Button=findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades:Button=findViewById(R.id.btnEspecialidades) as Button
        var btnCombinations:Button=findViewById(R.id.btnCombinations) as Button
        var btnSopas:Button=findViewById(R.id.btnSopas) as Button
        var btnTortas:Button=findViewById(R.id.btnTortas) as Button
        var btnDrinks:Button=findViewById(R.id.btnDrinks) as Button


        btnAntojitos.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }
        btnCombinations.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }
        btnSopas.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }
        btnTortas.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }
        btnDrinks.setOnClickListener{
            var intent:Intent=Intent(this,ProductoActivity::class.java)
            intent.putExtra("menuType", "Drinks")
            startActivity(intent)
        }
    }
}