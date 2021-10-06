package fastcampus.aop.part2.main.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import fastcampus.aop.part2.main.fragments.CalendarFragment

class ViewPagerAdapter(
    activity: FragmentActivity
) :FragmentStateAdapter(activity){
    val fragments: List<Fragment>
    init {
        fragments= listOf(CalendarFragment())
    }
    override fun getItemCount(): Int {

        return fragments.size

    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}