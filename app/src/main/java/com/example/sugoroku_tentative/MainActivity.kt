package com.example.sugoroku_tentative

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sugoroku_tentative.databinding.ActivityMainBinding
import java.util.*
import kotlin.random.Random

//8~14までのコード、grableの象
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // nuberButtonの背景にiroirosujiを設定
        binding.numberButton.setBackgroundResource(R.drawable.iroirosuji)

        //viewの背景に設定したiroirosujiのアニメーションを取得
        var randomanimation = binding.numberButton.background
//isPlayをfalseにしておく
        var isPlay=false
        //numberButtonをクリックしたときの処理
        binding.numberButton.setOnClickListener {

            // randomanimationがAnimatableの場合
            if (randomanimation is Animatable) {
                if (isPlay) {
                    // randomanimationが再生している場合，停止する．
                    randomanimation.stop()
                    val number:Int=Random.nextInt(5)
                    Log.d("randomAnimation", (number+1).toString())
                    when(number){
                        //アニメーションは背景で流れてる、だから表示する数字も背景に移す
                        0 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random1)

                        }
                        1 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random2)

                        }
                        2 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random3)

                        }
                        3 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random4)

                        }
                        4 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random5)

                        }
                        5 ->{
                            binding.numberButton.setBackgroundResource(R.drawable.random6)

                        }
                    }
                    isPlay=false



                } else {
                    // nuberButtonの背景にiroirosujiを設定
                    binding.numberButton.setBackgroundResource(R.drawable.iroirosuji)

                    //viewの背景に設定したiroirosujiのアニメーションを取得
                    val animation = binding.numberButton.background as Animatable
//                    val num = "apple"
//                    Log.d("add", "${1 + num as Int}")
                    // randomanimationが停止している場合，再生する．
                    animation.start()
                    isPlay=true


                }
                Log.d("randomAnimation", "Animationだよ！")
            } else {
                Log.d("randomAnimation", "Animationじゃないよ！")
            }

//            val number:Int=Random.nextInt(5)
//            when(number){
//                //アニメーションは背景で流れてる、だから表示する数字も背景に移す
//                0 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random1)
//
//                }
//                1 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random2)
//
//                }
//                2 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random3)
//
//                }
//                3 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random4)
//
//                }
//                4 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random5)
//
//                }
//                5 ->{
//                    binding.numberButton.setBackgroundResource(R.drawable.random6)
//
//                }
//            }
        }
    }

    fun main() {
        if ((0..5).random() == 0) {
        }
    }
}


