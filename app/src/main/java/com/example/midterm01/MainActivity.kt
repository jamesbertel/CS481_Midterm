package com.example.midterm01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val months = resources.getStringArray(R.array.Month);
        val years = resources.getStringArray(R.array.Year);
        val states = arrayOf("AL","AK","AS","AZ","AR","CA","CO","CT","DE","DC","FL","GA","GU","HI",
            "ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV",
            "NH","NJ","NM","NY","NC","ND","MP","OH","OK","OR","PA","PR","RI","SC","SD","TN","TX",
            "UT","VT","VA","VI","WA","WV","WI","WY")

        val monthSpinner = findViewById<Spinner>(R.id.monthSpinner);
        val yearSpinner = findViewById<Spinner>(R.id.yearSpinner);
        val stateSpinner = findViewById<Spinner>(R.id.stateSpinner);

        monthSpinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, months);
        yearSpinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, years);
        stateSpinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, states);



//        monthSpinner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>,
//                                        view: View, position: Int, id: Long) {
//                Toast.makeText(this@MainActivity,
//                    getString(R.string.selected_item) + " " +
//                            "" + languages[position], Toast.LENGTH_SHORT).show()
//            }

//            override fun onNothingSelected(parent: AdapterView<*>) {
//                // write code to perform some action
//            }
//        }
    }
}