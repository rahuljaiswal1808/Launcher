package com.jio.launcher.prefs;

import java.lang.System;

/**
 * * Subscribes to all SharedPreference updates and ensures values are updated.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/jio/launcher/prefs/PreferencesUpdater;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "onSharedPreferenceChanged", "", "prefs", "Landroid/content/SharedPreferences;", "key", "", "app_debug"})
public final class PreferencesUpdater implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences prefs, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public PreferencesUpdater() {
        super();
    }
}