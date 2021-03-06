package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutt: Button=findViewById(R.id.button)
        val txtvw: TextView=findViewById(R.id.textView)
        val msg=Toast.makeText(this,"Rolled Successfully", Toast.LENGTH_SHORT)
        val imgvw: ImageView=findViewById(R.id.imageView)

        rollbutt.setOnClickListener {
            msg.show()
            if (rolls()==4) {
                txtvw.text= "FOUR \n hurray"
                imgvw.setImageResource(R.drawable.dice_4)
            }
            else if (rolls()==1){
                txtvw.text= "Hope for something better than 1 next time."
                imgvw.setImageResource(R.drawable.dice_1)
            }
            else if (rolls()==2) {
                txtvw.text= "TWO"
                imgvw.setImageResource(R.drawable.dice_2)
            }
            else if (rolls()==6) {
                txtvw.text= "Bravo, SIX!!"
                imgvw.setImageResource(R.drawable.dice_6)
            }
            else if (rolls()==3){
                txtvw.text= "That's a 3 for you..."
                imgvw.setImageResource(R.drawable.dice_3)
            }
            else {
                txtvw.text= "FIVE \n  good enough!"
                imgvw.setImageResource(R.drawable.dice_5)
            }

        }
    }
}

fun rolls():Int {
    return (1..6).random()

}