package fastcampus.aop.part2.main.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.FragmentFishBinding
import fastcampus.aop.part2.main.databinding.FragmentTalkBinding

class TalkFragment : Fragment(R.layout.fragment_talk) {
    private var mbinding : FragmentTalkBinding? = null

    override fun onAttach(context: Context) {
        if (context != null) {
            super.onAttach(context)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTalkBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root
    }
}