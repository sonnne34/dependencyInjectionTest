package com.example.dependencyinjectionstart.example1

import javax.inject.Inject


class Activity {

    private val component = DaggerNewComponent.create()
//    val keyboard = component.getKeyboard()
//    val monitor = component.getMonitor()
//    val mouse = component.getMouse()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse

    init {
        DaggerNewComponent.create().inject(this)
    }
}
