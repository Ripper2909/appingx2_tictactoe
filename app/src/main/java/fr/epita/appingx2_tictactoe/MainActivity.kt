package fr.epita.appingx2_tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
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
                    Log.d("MainActivity", "Going to SecondActivity")
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clickedView -> else reached")
                }
            }
        }
    }

    private fun goToSecondActivity() {
        val playerName = findViewById<TextView>(R.id.plain_text_name)
        val explicitIntent = Intent(this, SecondActivity::class.java)
        val name = playerName.text.toString()
        explicitIntent.putExtra("NAME", name)
        startActivity(explicitIntent)
    }
}
