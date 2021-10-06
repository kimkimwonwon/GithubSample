package fastcampus.aop.part2.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.FragmentSettingBinding

class SettingFragment : Fragment(R.layout.settingpage){
    private var mbinding : FragmentSettingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSettingBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root

    }
}