package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModel::class])
interface NewComponent {

    fun getKeyboard(): Keyboard

    fun getMonitor(): Monitor

    fun getMouse(): Mouse

    fun inject(activity: Activity) {

    }
}