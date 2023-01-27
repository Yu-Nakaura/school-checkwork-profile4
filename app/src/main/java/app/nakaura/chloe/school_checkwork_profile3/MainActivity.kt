package app.nakaura.chloe.school_checkwork_profile3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakaura.chloe.school_checkwork_profile3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }


        // 名前ボタンを押したとき
        binding.showProfileButton.setOnClickListener{
            binding.profileImage.setImageResource(R.drawable.profile_image)
            binding.profileLabelText.text = "名前"
            binding.profileCommentText.text = "Androidメンターのくろえだよ"
        }

        //　好きな食べ物ボタンを押したとき
        binding.showFoodButton.setOnClickListener{
            binding.profileImage.setImageResource(R.drawable.food_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileCommentText.text = "辛い物が大好き"
        }
    }
}