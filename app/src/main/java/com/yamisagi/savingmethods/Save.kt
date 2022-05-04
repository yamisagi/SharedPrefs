package com.yamisagi.savingmethods

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Save {

    /*
    // SharedPreferences
    // SharePreferences küçük verileri kaydetmek için kullanılır.
    // Çünkü "unique- key" ile kaydedilir.
    class MainActivity : AppCompatActivity() {
        private lateinit var sharedPreferences: SharedPreferences
        // sharedPreferences adlı bir değişken oluşturduk. Ve this ile içerisinde bulunduğu aktiviteye eriştik.
        // Bu şekilde aktivite için sharedPreferencesin methodlarına ulaşabiliriz.

        private var textV: String? = null
        private var edit: Int? = null
        private var result: String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            sharedPreferences = this.getSharedPreferences("com.yamisagi.savingmethods", MODE_PRIVATE)

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // sharedPreferences içerisine kayıtlı verileri onCreate metodunda alıyoruz ki uygulama açılır açılmaz çağırılsın.

            var agePreferences = sharedPreferences.getInt("edit", -1)
            if (agePreferences == -1) {
                textView.text = "Nothing to show!"
            } else {
                textView.text = "Your age is $agePreferences"
            }


        }

        fun save(view: View) {


            if (editText.text.isNotEmpty()) {
                sharedPreferences.edit().putInt("edit", editText.text.toString().toInt()).apply()
                // editText ile girilen değeri sharedPreferences'e kaydediyoruz.
                // Sondaki .apply() ile yapılan değişilikleri kaydetmeyi sağlıyoruz.


                textV = editText.text.toString()
                edit = editText.text.toString().toIntOrNull()
                result = "Your age: $edit"
                textView.text = result

            } else {
                textView.text = "Nothing to save"
            }
        }

        fun delete(view: View) {


            result = textView.setText("Clean!").toString()

        }
    }
}
*/
}