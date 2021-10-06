package fastcampus.aop.part2.main.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fastcampus.aop.part2.main.Content.DiaryContent
import fastcampus.aop.part2.main.R
import fastcampus.aop.part2.main.databinding.ItemDiarycontentBinding

class RecyclerViewAdapter: ListAdapter<DiaryContent,RecyclerViewAdapter.diaryItemViewHolder>(diffUtil){

    inner class diaryItemViewHolder (private val  binding: ItemDiarycontentBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(DiaryModel : DiaryContent) {
        binding.rvDiaryContents.text = DiaryModel.Dcontent
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): diaryItemViewHolder {

        return diaryItemViewHolder(ItemDiarycontentBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: diaryItemViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object{
        val diffUtil = object : DiffUtil.ItemCallback<DiaryContent>(){
            override fun areItemsTheSame(oldItem: DiaryContent, newItem: DiaryContent): Boolean {

                return oldItem== newItem
            }

            override fun areContentsTheSame(oldItem: DiaryContent, newItem: DiaryContent): Boolean {
                return oldItem.Dcontent == newItem.Dcontent
            }

        }
    }
}

