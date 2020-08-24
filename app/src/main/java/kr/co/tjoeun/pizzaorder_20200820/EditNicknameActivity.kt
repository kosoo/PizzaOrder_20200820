package kr.co.tjoeun.pizzaorder_20200820

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        okBtn.setOnClickListener {

            val inputNickname = newNicknameEdt.text.toString()

            if (inputNickname.length<5){
                Toast.makeText(mContext, "닉네임은 5자 이상이어야 합니다.", Toast.LENGTH_SHORT).show()
            } else {
                val resultIntent = Intent()
                resultIntent.putExtra("nick", inputNickname)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }

        }
    }

    override fun setValues() {
    }

}