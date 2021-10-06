package fastcampus.aop.part2.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fastcampus.aop.part2.main.databinding.FragmentShopBinding

class ShopFragment : Fragment(){
    private var mbinding : FragmentShopBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentShopBinding.inflate(inflater,container,false)
        mbinding = binding

        return mbinding?.root

    }
}