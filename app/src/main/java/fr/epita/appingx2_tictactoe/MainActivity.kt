package fr.epita.appingx2_tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start.setOnClickListener(this@MainActivity)
    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.button_start -> {
                    goToSecondActivity()
                    Log.d("MainActivity/TextCount", "text_count increased")
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clickedView -> else reached")
                }
            }
        }
    }

    private fun goToSecondActivity() {
        val explicitIntent = Intent(this, SecondActivity::class.java)
        val message = "Hello from another world"
        explicitIntent.putExtra("MESSAGE", message)
        startActivity(explicitIntent)
    }
}
