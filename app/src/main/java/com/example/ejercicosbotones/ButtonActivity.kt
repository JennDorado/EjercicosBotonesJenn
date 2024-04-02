package com.example.ejercicosbotones

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicosbotones.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityButtonBinding
    val TAG ="ButtonActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_button)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            //val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            //insets
        binding.containedButton.setOnClickListener(this)
        binding.containedButton2.setOnClickListener(this)
        binding.outlinedButton.setOnClickListener(this)
        binding.outlinedButton2.setOnClickListener(this)
        binding.textButton.setOnClickListener(this)
        binding.textButton2.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)

        Log.d("ButtonActivity","llamada")

    }

        //val Button1 = findViewById<Button>(R.id.containedButton)
        //val Button2 = findViewById<Button>(R.id.containedButton2)
       // val Button3 = findViewById<Button>(R.id.outlinedButton)
        //val Button4 = findViewById<Button>(R.id.outlinedButton2)
        //val Button5 = findViewById<Button>(R.id.textButton)
        //val Button6 = findViewById<Button>(R.id.textButton2)
        //val Button7 = findViewById<Button>(R.id.button1)
        //val Button8 = findViewById<Button>(R.id.button2)
        //val Button9 = findViewById<Button>(R.id.button3)



        //Button1.setOnClickListener(this)
        //Button2.setOnClickListener(this)
        //Button3.setOnClickListener(this)
        //Button4.setOnClickListener(this)
        //Button5.setOnClickListener(this)
        //Button6.setOnClickListener(this)
        //Button7.setOnClickListener(this)
        //Button8.setOnClickListener(this)
        //Button9.setOnClickListener(this)





    override fun onClick(v: View?){
        when(v){
            binding.containedButton-> Toast.makeText(this,"Contained Button",Toast.LENGTH_LONG).show()
            binding.containedButton2->Toast.makeText(this,"Contained Button 2",Toast.LENGTH_LONG).show()
            binding.outlinedButton->Toast.makeText(this,"Outlined Button",Toast.LENGTH_LONG).show()
            binding.outlinedButton2->Toast.makeText(this,"Outlined Button 2",Toast.LENGTH_LONG).show()
            binding.textButton->Toast.makeText(this,"Text Button",Toast.LENGTH_LONG).show()
            binding.textButton2->Toast.makeText(this,"Text Button 2",Toast.LENGTH_LONG).show()
            binding.button1->Toast.makeText(this,"Toggle Button 1",Toast.LENGTH_LONG).show()
            binding.button2->Toast.makeText(this,"Toggle Button 2",Toast.LENGTH_LONG).show()
            binding.button3->Toast.makeText(this,"Toggle Button 3",Toast.LENGTH_LONG).show()
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStar Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Called")
    }


}