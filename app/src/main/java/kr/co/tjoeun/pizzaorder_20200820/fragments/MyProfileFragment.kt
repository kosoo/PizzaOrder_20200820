package kr.co.tjoeun.pizzaorder_20200820.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.tjoeun.pizzaorder_20200820.BaseActivity
import kr.co.tjoeun.pizzaorder_20200820.EditNicknameActivity
import kr.co.tjoeun.pizzaorder_20200820.R

class MyProfileFragment : Fragment(){

    val REQ_FOR_NICKNAME = 1000


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        닉네임 변경 관련 코드 작성 필요

        changeNicknameBtn.setOnClickListener {

            val myIntent = Intent(context!!, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }
        

    }

}