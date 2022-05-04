package com.yamisagi.savingmethods

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // We ll use lateinit to declare a variable that will be initialized later sharedPreferences.

    lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // When program called onCreate, it will call sharedPreferences.
        pref = this.getSharedPreferences("pref", MODE_PRIVATE)
        //  and we set if condition for default value of getInt method.
        // We set default value of getInt method to -1,because age can be positive or zero.
        //  If value is  ==  -1 , it will set text to current age.
        // But if value is not -1, it will set text to null zone. And show error message.
        var agePreferences = pref.getInt("pref", -1)
        if (agePreferences != -1) {
            textView.text = agePreferences.toString()
        } else {
            textView.text = "Enter your age"
        }

    }

    fun save(view: View) {
        // Then we use save method to save the value of age.
        // We use putInt method to save the value of age to sharedPreferences.
        // And we must check if the value of age is not null.
        if (editText.text.isNotEmpty()) {
            pref.edit().putInt("pref", editText.text.toString().toInt()).apply()
            textView.text = "Your age is ${editText.text}"
        } else {
            textView.text = "Please enter your age"
        }

    }

    fun delete(view: View) {
        // On delete method , we use clear method to clear the value of age.
        // If we dont use clear method, it wont clear the value of age.
        pref.edit().clear().apply()
        textView.text = "Clean"
    }
}