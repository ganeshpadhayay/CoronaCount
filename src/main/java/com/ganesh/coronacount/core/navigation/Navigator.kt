package com.ganesh.coronacount.core.navigation

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.ganesh.coronacount.features.home.HomeActivity
import com.ganesh.coronacount.features.login.Authenticator
import com.ganesh.coronacount.features.login.LoginActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Navigator
@Inject constructor(private val authenticator: Authenticator) {

    fun showMain(context: Context) {
        when (authenticator.userLoggedIn()) {
            true -> showHome(context)
            false -> showLogin(context)
        }
    }

    private fun showLogin(context: Context) =
        context.startActivity(LoginActivity.callingIntent(context))

    private fun showHome(context: Context) =
        context.startActivity(HomeActivity.callingIntent(context))

    fun showSomeOtherActivity(activity: FragmentActivity, data: Bundle) {}

    fun printMessage(){
        //Toast//
    }
}


