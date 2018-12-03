package fr.epita.appingx2_tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    var turn = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button1.setOnClickListener(this@SecondActivity)
        button2.setOnClickListener(this@SecondActivity)
        button3.setOnClickListener(this@SecondActivity)
        button4.setOnClickListener(this@SecondActivity)
        button5.setOnClickListener(this@SecondActivity)
        button6.setOnClickListener(this@SecondActivity)
        button7.setOnClickListener(this@SecondActivity)
        button8.setOnClickListener(this@SecondActivity)
        button9.setOnClickListener(this@SecondActivity)

        val originIntent = intent
        val name = originIntent.getStringExtra("NAME")
        val playerName = findViewById<TextView>(R.id.text_player)
        playerName.text = "O ($name)"

    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.button1 -> {
                    val button1 = findViewById<TextView>(R.id.button1)
                    if (button1.text != "X" && button1.text != "O")
                        if (turn % 2 == 0) {
                            button1.text = "X"
                            turn += 1
                        } else {
                            button1.text = "O"
                            turn += 1
                        }
                }
                R.id.button2 -> {
                    val button2 = findViewById<TextView>(R.id.button2)
                    if (button2.text != "X" && button2.text != "O")
                        if (turn % 2 == 0) {
                            button2.text = "X"
                            turn += 1
                        } else {
                            button2.text = "O"
                            turn += 1
                        }
                }
                R.id.button3 -> {
                    val button3 = findViewById<TextView>(R.id.button3)
                    if (button3.text != "X" && button3.text != "O")
                        if (turn % 2 == 0) {
                            button3.text = "X"
                            turn += 1
                        } else {
                            button3.text = "O"
                            turn += 1
                        }
                }
                R.id.button4 -> {
                    val button4 = findViewById<TextView>(R.id.button4)
                    if (button4.text != "X" && button4.text != "O")
                        if (turn % 2 == 0) {
                            button4.text = "X"
                            turn += 1
                        } else {
                            button4.text = "O"
                            turn += 1
                        }
                }
                R.id.button5 -> {
                    val button5 = findViewById<TextView>(R.id.button5)
                    if (button5.text != "X" && button5.text != "O")
                        if (turn % 2 == 0) {
                            button5.text = "X"
                            turn += 1
                        } else {
                            button5.text = "O"
                            turn += 1
                        }
                }
                R.id.button6 -> {
                    val button6 = findViewById<TextView>(R.id.button6)
                    if (button6.text != "X" && button6.text != "O")
                        if (turn % 2 == 0) {
                            button6.text = "X"
                            turn += 1
                        } else {
                            button6.text = "O"
                            turn += 1
                        }
                }
                R.id.button7 -> {
                    val button7 = findViewById<TextView>(R.id.button7)
                    if (button7.text != "X" && button7.text != "O")
                        if (turn % 2 == 0) {
                            button7.text = "X"
                            turn += 1
                        } else {
                            button7.text = "O"
                            turn += 1
                        }
                }
                R.id.button8 -> {
                    val button8 = findViewById<TextView>(R.id.button8)
                    if (button8.text != "X" && button8.text != "O")
                        if (turn % 2 == 0) {
                            button8.text = "X"
                            turn += 1
                        } else {
                            button8.text = "O"
                            turn += 1
                        }
                }
                R.id.button9 -> {
                    val button9 = findViewById<TextView>(R.id.button9)
                    if (button9.text != "X" && button9.text != "O")
                        if (turn % 2 == 0) {
                            button9.text = "X"
                            turn += 1
                        } else {
                            button9.text = "O"
                            turn += 1
                        }
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clickedView -> else reached")
                }
            }
        }
    }
}