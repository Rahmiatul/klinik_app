package com.rahmi.klinik_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rahmi.klinik_app.adapter.AdapterListDoctors
import com.rahmi.klinik_app.adapter.AdapterMenuIcon
import com.rahmi.klinik_app.model.ModelIcon
import com.rahmi.klinik_app.model.ModelListDoctors

class doctorpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctorpage)
        val rvMenu : RecyclerView = findViewById(R.id.RvMenu)
        rvMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        val menuList = listOf(
            ModelIcon(R.drawable.icon_heart,"Cardiologyst"),
            ModelIcon(R.drawable.iconeye1,"Opthalmologyst"),
            ModelIcon(R.drawable.icontooth,"Dentist"),
            ModelIcon(R.drawable.icon_heart,"Cardiologyst")

            )
        rvMenu.adapter = AdapterMenuIcon(menuList)

        val rvDoctor : RecyclerView = findViewById(R.id.RvDoctor)
        rvDoctor.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val doctorList = listOf(


            ModelListDoctors("Dr. Floyd Miles", R.drawable.dokter1,"Pediatrics", "(123 reviews)", "4.9"),
            ModelListDoctors("Dr. Guy Hawkinds", R.drawable.dokter2,"Dentist", "(85 reviews)", "4.9"),
            ModelListDoctors("Dr. Floyd Miles", R.drawable.dokter1,"Pediatrics", "(123 reviews)", "4.9"),
            ModelListDoctors("Dr. Floyd Miles", R.drawable.dokter1,"Pediatrics", "(123 reviews)", "4.9"),
            ModelListDoctors("Dr. Jane Cooper", R.drawable.dokter3,"Pediatrics", "(44 reviews)", "4.8"),
            ModelListDoctors("Dr. Jacob Jones", R.drawable.dokter4,"Nephrologyst", "(101 reviews)", "5.0")
        )
        rvDoctor.adapter = AdapterListDoctors(doctorList)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}