package com.abisayo.computerize1

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.abisayo.computerize1.Games.GameClaraActivity
import com.abisayo.computerize1.data.Constants
import com.abisayo.computerize1.databinding.ActivityFirstBinding
import com.google.firebase.auth.FirebaseAuth

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding
    private lateinit var builder : AlertDialog.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        supportActionBar?.hide(); // hide the title bar
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)


        builder = AlertDialog.Builder(this)

       binding.course.setOnClickListener {
            val intent = Intent(this, PretestActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)

        }


        binding.button3.setOnClickListener {
            builder.setTitle("Alert!")
                .setMessage("You will need an internet connection")
                .setCancelable(true)
                .setPositiveButton("Continue") { dialogInterface, it ->
                    dialogInterface.cancel()
                    val intent = Intent(this, EnterAdminPasswordActivity::class.java)
                    startActivity(intent)

                }
                .setNegativeButton("No") { dialogInterface, it ->
                    dialogInterface.cancel()
                }

                .show()

        }

        binding.playGame.setOnClickListener {
            val intent = Intent(this, EnterNameQuizActivity::class.java)
            intent.putExtra(Constants.TOPIC, "game")
            startActivity(intent)


        }
//
//       binding.game.setOnClickListener {
//            val intent = Intent(this, GameClaraActivity::class.java)
//            startActivity(intent)
//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//
//        }
//
//       binding.puzzle.setOnClickListener {
//            val intent = Intent(this, PuzzleActivity::class.java)
//            startActivity(intent)
//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//
//        }
    }
}