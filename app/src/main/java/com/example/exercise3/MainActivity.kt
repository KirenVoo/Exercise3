package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener{

            var premium = 0
            val spinnerAges = findViewById<Spinner>(R.id.spinnerAge)

            if(spinnerAges.selectedItem.equals("Less than 17")){
                premium += 60
            }
            else if(spinnerAges.selectedItem.equals("17 to 25")){
                premium += 70
                if(radioButtonMale.isChecked){
                    premium += 50
                }
                if(checkBoxSmoker.isChecked){
                    premium += 100
                }
            }
            else if(spinnerAges.selectedItem.equals("26 to 30")){
                premium += 90
                if(radioButtonMale.isChecked){
                    premium += 100
                }
                if(checkBoxSmoker.isChecked){
                    premium += 150
                }
            }
            else if(spinnerAges.selectedItem.equals("31 to 40")){
                premium += 120
                if(radioButtonMale.isChecked){
                    premium += 150
                }
                if(checkBoxSmoker.isChecked){
                    premium += 200
                }
            }
            else if(spinnerAges.selectedItem.equals("41 to 55")){
                premium += 150
                if(radioButtonMale.isChecked){
                    premium += 200
                }
                if(checkBoxSmoker.isChecked){
                    premium += 250
                }
            }
            else if(spinnerAges.selectedItem.equals("More than 55")){
                premium += 150
                if(radioButtonMale.isChecked){
                    premium += 200
                }
                if(checkBoxSmoker.isChecked){
                    premium += 300
                }
            }
            textViewPremium.setText("RM " + premium.toString())
        }
        buttonReset.setOnClickListener {
            textViewPremium.setText("Insurance Premium :")
            checkBoxSmoker.isChecked = false
            radioButtonMale.isChecked = false
        }
    }
}
