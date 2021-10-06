package fastcampus.aop.part2.main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.TextView


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation)
        val bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        val topTextView: TextView = findViewById(R.id.topTextView)
        val bottomTextView: TextView = findViewById(R.id.bottomTextView)
        val middleTextView: TextView = findViewById(R.id.middleTextView)


        topTextView.startAnimation(topAnimation)
        middleTextView.startAnimation(middleAnimation)
        bottomTextView.startAnimation(bottomAnimation)

        val SplashScreenTimeOut=3000
        val homeIntent = Intent(this@SplashScreen,MainActivity::class.java)
        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        },SplashScreenTimeOut.toLong())
    }
    }