package app.nakaura.chloe.school_checkwork_profile3

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakaura.chloe.school_checkwork_profile3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }


        //name
        binding.showProfileButton.setOnClickListener{
            binding.profileImage.setImageResource(R.drawable.chloe_image)
            binding.profileLabelText.text = "名前"
            binding.profileCommentText.text = "Androidメンターのくろえだよ"
            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 180, 220))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
        }

        //food
        binding.showFoodButton.setOnClickListener{
            binding.profileImage.setImageResource(R.drawable.korean_food_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileCommentText.text = "辛い物が大好き"
            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 180, 120))
        }
    }
}