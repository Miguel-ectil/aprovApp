import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aprovapp.databinding.ActivityCarrosselItemBinding

class CarrosselAdapter(
    private val imageList: List<Int>,
    private val titleList: List<String>
) : RecyclerView.Adapter<CarrosselAdapter.CarouselViewHolder>() {

    inner class CarouselViewHolder(private val binding: ActivityCarrosselItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(image: Int, title: String) {
            binding.imageView.setImageResource(image)
            binding.textTitle.text = title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            ActivityCarrosselItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(imageList[position], titleList[position])
    }
}