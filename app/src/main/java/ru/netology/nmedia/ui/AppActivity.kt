package ru.netology.nmedia.ui


import android.os.Bundle
import android.view.animation.Animation
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.netology.nmedia.databinding.ActivityAppBinding
import android.view.animation.AnimationUtils
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        val binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    /*    val view = binding.stats
        val label = binding.label*/
        binding.stats.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

       /* val viewAnim = AnimationUtils.loadAnimation(this, R.anim.animation).apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    label.text = "started"
                }

                override fun onAnimationEnd(animation: Animation?) {
                    label.text = "ended"
                }

                override fun onAnimationRepeat(animation: Animation?) {
                    label.text = "repeat"
                }
            })
        }

        view.startAnimation(viewAnim)*/
    }
}