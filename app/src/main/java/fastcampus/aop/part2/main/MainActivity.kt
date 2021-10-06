package fastcampus.aop.part2.main

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.internal.ContextUtils.getActivity
import com.google.android.material.navigation.NavigationView
import fastcampus.aop.part2.main.Adapter.ViewPagerAdapter
import fastcampus.aop.part2.main.databinding.ActivityMainBinding
import fastcampus.aop.part2.main.databinding.FragmentTalkBinding
import fastcampus.aop.part2.main.databinding.FragmentWritediaryBinding
import fastcampus.aop.part2.main.databinding.SplashScreenBinding
import fastcampus.aop.part2.main.fragments.*

class MainActivity : AppCompatActivity() {
    private var navController: NavController? =null

   // private val viewPager : ViewPager2 by lazy{
    //    findViewById(R.id.vp_calendar)
    //
    //private val viewPagerAdapter = ViewPagerAdapter(this)

    private lateinit var toggle : ActionBarDrawerToggle

    private lateinit var SpBinding :SplashScreenBinding

    private lateinit var mBinding : ActivityMainBinding

    private lateinit var dBinding: FragmentTalkBinding

    private lateinit var wBinding : FragmentWritediaryBinding
    val settings:Button by lazy{findViewById(R.id.settings)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        SpBinding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(SpBinding.root)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        dBinding = FragmentTalkBinding.inflate(layoutInflater)
        wBinding = FragmentWritediaryBinding.inflate(layoutInflater)

        replaceFragment(FishFragment())

        var spaghetti =0

        wBinding.btnDiarySend.setOnClickListener(){
            //글씨넘기기
            // 분석 애니메이션틀기


        }



        mBinding.talkWitCatmal.setOnClickListener(){
            if(spaghetti ==1){
                spaghetti= 0
                setContentView(wBinding.root)
            }
            else
                replaceFragment(TalkFragment())
                spaghetti = 1
        }








        val fragments : ArrayList<Fragment> = arrayListOf(
            CalendarFragment()
        )

        settings.setOnClickListener(){
            var intent2 = Intent(this,Settings::class.java)
            startActivity(intent2)

        }
        //val navHostFragment = supportFragmentManager.findFragmentById(R.id.//my_nav_host) as NavHostFragment
        //val navController = navHostFragment.navController
        //
        // viewPager.adapter = viewPagerAdapter
        val drawerLayout :DrawerLayout =findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)


        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_lock -> Toast.makeText(applicationContext,"Clicked Lock",Toast.LENGTH_SHORT).show()

            }
            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){

            return true
        }


        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManger = supportFragmentManager
        val fragmentTransaction =fragmentManger.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()

    }
}