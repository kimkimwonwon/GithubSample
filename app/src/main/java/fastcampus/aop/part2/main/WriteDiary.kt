package fastcampus.aop.part2.main

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import fastcampus.aop.part2.main.databinding.FragmentWritediaryBinding

class WriteDiary : AppCompatActivity() {

    private lateinit var wBinding: FragmentWritediaryBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val wBinding = FragmentWritediaryBinding.inflate(layoutInflater)

        setContentView(wBinding.root)

        //edit 한걸 listtext 를 리스트에 집어넣는 방법을 배워야함
        //getstring?




    }
}