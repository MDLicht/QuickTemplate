package com.mdlicht.zb.quicktemplate.common

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<P>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun setData(position: Int, params: P?)
}