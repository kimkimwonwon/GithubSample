package fastcampus.aop.part2.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.FragmentDiaryAnalyzeBinding
import fastcampus.aop.part2.main.databinding.FragmentFishBinding

class FishFragment : Fragment(R.layout.fragment_fish) {
    private var mbinding : FragmentFishBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFishBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root
    }
}


