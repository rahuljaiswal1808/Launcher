package com.jio.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jio/launcher/PackageReceiver;", "Landroid/content/BroadcastReceiver;", "viewModel", "Lcom/jio/launcher/viewmodel/ApplicationsModel;", "(Lcom/jio/launcher/viewmodel/ApplicationsModel;)V", "filter", "Landroid/content/IntentFilter;", "getFilter", "()Landroid/content/IntentFilter;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
public final class PackageReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.IntentFilter filter = null;
    private final com.jio.launcher.viewmodel.ApplicationsModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.IntentFilter getFilter() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public PackageReceiver(@org.jetbrains.annotations.NotNull()
    com.jio.launcher.viewmodel.ApplicationsModel viewModel) {
        super();
    }
}