package kr.co.tjoeun.pizzaorder_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzaorder_20200820.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    //var pizzaStoreList = ArrayList<pizzStore>()

    lateinit var mvpa : MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pizzaStoreList.add(pizzStore)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}

