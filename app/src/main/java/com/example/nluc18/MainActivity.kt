package com.example.nluc18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nluc18.adapters.FruitAdapter
import com.example.nluc18.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = ArrayList<Fruit>()

        data.add(Fruit(1 , "Apple" , "Apple is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.apple))
        data.add(Fruit(2 , "Banana" , "Banana is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.banana))
        data.add(Fruit(3 , "Orange" , "Orange is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.orange))
        data.add(Fruit(4 , "Orange" , "Strawberry is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.strawberry))
        data.add(Fruit(5 , "lemon" , "Lemon is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.lemon))
        data.add(Fruit(6 , "watermelon" , "Watermelon is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.melonwater))
        data.add(Fruit(7 , "Melon" , "Melon is can iterate over the elements of an array or list using a for loop or using forEach" , R.drawable.melon))


        val fruitAdapter = FruitAdapter(this , data)

        lvFruit.adapter = fruitAdapter
    }
}