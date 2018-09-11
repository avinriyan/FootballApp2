package com.larapin.kotlinsub2.event

import com.larapin.kotlinsub2.model.Event

/**
 * Created by Avin on 04/09/2018.
 */
interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}