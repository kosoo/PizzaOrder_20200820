package kr.co.tjoeun.pizzaorder_20200820

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzaorder_20200820.adapters.MainViewPagerAdapter
import kr.co.tjoeun.pizzaorder_20200820.datas.Store

class MainActivity : BaseActivity() {

    var pizzaStoreList = ArrayList<Store>()

    lateinit var mvpa : MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizzaStoreList.add(Store("","피자헛", ""))
        pizzaStoreList.add(Store("","파파존스", ""))
        pizzaStoreList.add(Store("","도미노 피자", ""))
        pizzaStoreList.add(Store("","피스터 피자", ""))

        //mvpa = MainViewPagerAdapter(this, R.layout.fragment_pizza_store, pizzaStoreList)

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

