package com.jio.launcher.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005\"\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"HIDE_NAV", "", "getHIDE_NAV", "()Z", "setHIDE_NAV", "(Z)V", "HIDE_STATUS", "getHIDE_STATUS", "setHIDE_STATUS", "ICON_PACK", "", "getICON_PACK", "()Ljava/lang/String;", "setICON_PACK", "(Ljava/lang/String;)V", "KEY_HIDE_NAV", "KEY_HIDE_STAT", "KEY_ICON_PACK", "app_debug"})
public final class PreferencesKt {
    private static boolean HIDE_NAV;
    private static boolean HIDE_STATUS;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ICON_PACK;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HIDE_NAV = "pref_hide_nav";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HIDE_STAT = "pref_hide_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ICON_PACK = "icon_pack";
    
    public static final boolean getHIDE_NAV() {
        return false;
    }
    
    public static final void setHIDE_NAV(boolean p0) {
    }
    
    public static final boolean getHIDE_STATUS() {
        return false;
    }
    
    public static final void setHIDE_STATUS(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getICON_PACK() {
        return null;
    }
    
    public static final void setICON_PACK(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}