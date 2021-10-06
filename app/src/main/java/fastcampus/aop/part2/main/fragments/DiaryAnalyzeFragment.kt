package fastcampus.aop.part2.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.FragmentDiaryAnalyzeBinding
import fastcampus.aop.part2.main.databinding.FragmentWritediaryBinding

class DiaryAnalyzeFragment : Fragment(R.layout.fragment_diary_analyze_) {
    private var mbinding : FragmentDiaryAnalyzeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDiaryAnalyzeBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root
    }


}