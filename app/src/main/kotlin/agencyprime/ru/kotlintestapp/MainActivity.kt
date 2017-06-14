package agencyprime.ru.kotlintestapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneTeamButton = findViewById(R.id.button_main_one_team) as Button
        val twoTeamButton = findViewById(R.id.button_main_two_team) as Button

        oneTeamButton?.setOnClickListener({startActivity(Intent(this, DiceActivity::class.java))})
        twoTeamButton?.setOnClickListener({startActivity(Intent(this, DiceActivity::class.java))})
    }
}
