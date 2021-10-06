package fastcampus.aop.part2.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.FragmentCalendarBinding


class CalendarFragment : Fragment(R.layout.fragment_calendar) {
    private var mbinding : FragmentCalendarBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCalendarBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root

    }

}