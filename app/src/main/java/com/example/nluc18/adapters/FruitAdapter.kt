package com.example.nluc18.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.nluc18.R
import com.example.nluc18.model.Fruit
import kotlinx.android.synthetic.main.ftut_item.view.*

class FruitAdapter( var activity:Activity , var data:ArrayList<Fruit>): BaseAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var root = convertView
        if(root==null)
            root = LayoutInflater.from(activity).inflate(R.layout.ftut_item, null, false)

        root!!.tvName.text = data[position].name
        root.tvDetails.text = data[position].details
        root.imgFruit.setImageResource(data[position].image)
        return root
    }

}