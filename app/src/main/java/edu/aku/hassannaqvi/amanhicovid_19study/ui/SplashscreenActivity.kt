package edu.aku.hassannaqvi.naunehal.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.aku.hassannaqvi.naunehal.R
import edu.aku.hassannaqvi.naunehal.ui.login_activity.LoginActivity
import edu.aku.hassannaqvi.naunehal.utils.extension.gotoActivity
import kotlinx.coroutines.*

/*
* @author Ali Azaz Alam dt. 12.16.20
* */
class SplashscreenActivity : AppCompatActivity() {
    private lateinit var activityScope: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        activityScope = launchSplashScope()
    }

    override fun onPause() {
        super.onPause()
        activityScope.cancel()
    }

    override fun onResume() {
        super.onResume()
        if (activityScope.isActive.not())
            launchSplashScope()
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }

    private fun launchSplashScope() =
            CoroutineScope(Dispatchers.Main).launch {
                delay(SPLASH_TIME_OUT.toLong())
                finish()
                gotoActivity(LoginActivity::class.java)
            }

    companion object {
        private const val SPLASH_TIME_OUT = 1000
    }
}