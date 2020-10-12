package com.jio.launcher

import android.app.Application
import com.jio.launcher.icons.IconHandler
import com.jio.launcher.prefs.PreferencesUpdater
import com.jio.launcher.util.iconHandler

class LauncherApplication : Application() {

    val prefUpdater = PreferencesUpdater()

    override fun onCreate() {
        super.onCreate()

        /*getSharedPreferences("${packageName}_preferences", Context.MODE_PRIVATE).apply {
            registerOnSharedPreferenceChangeListener(prefUpdater)
            loadPreferences(this)
        }*/

        iconHandler = IconHandler(baseContext)
//        iconHandler.loadIconPack(ICON_PACK)
    }
}
