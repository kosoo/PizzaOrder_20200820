package kr.co.tjoeun.pizzaorder_20200820.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kr.co.tjoeun.pizzaorder_20200820.R
import kr.co.tjoeun.pizzaorder_20200820.datas.Store

class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>
) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nametxt = row.findViewById<TextView>(R.id.nameTxt)

        val data = mList[position]

        nametxt.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(logoImg)

        return row
    }
}