package com.jio.launcher.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jio/launcher/viewmodel/ApplicationsModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "apps", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/jio/launcher/model/AppInfo;", "getApps", "()Landroid/arch/lifecycle/MutableLiveData;", "setApps", "(Landroid/arch/lifecycle/MutableLiveData;)V", "app_debug"})
public final class ApplicationsModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<com.jio.launcher.model.AppInfo>> apps;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.jio.launcher.model.AppInfo>> getApps() {
        return null;
    }
    
    public final void setApps(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<com.jio.launcher.model.AppInfo>> p0) {
    }
    
    public ApplicationsModel() {
        super();
    }
}