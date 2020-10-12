package com.jio.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00172\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0006\u0010$\u001a\u00020\u0017R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/jio/launcher/Adapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/jio/launcher/Adapter$ApplicationViewHolder;", "data", "", "Lcom/jio/launcher/model/AppInfo;", "pm", "Landroid/content/pm/PackageManager;", "(Ljava/util/List;Landroid/content/pm/PackageManager;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "filter", "", "getFilter", "()Ljava/lang/String;", "setFilter", "(Ljava/lang/String;)V", "filteredData", "layout", "Landroid/support/v7/widget/LinearLayoutManager;", "applyFilter", "", "filterStr", "getItemCount", "", "onAttachedToRecyclerView", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "reset", "ApplicationViewHolder", "app_debug"})
public final class Adapter extends android.support.v7.widget.RecyclerView.Adapter<com.jio.launcher.Adapter.ApplicationViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filter;
    private java.util.List<com.jio.launcher.model.AppInfo> filteredData;
    private android.support.v7.widget.LinearLayoutManager layout;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.jio.launcher.model.AppInfo> data;
    private final android.content.pm.PackageManager pm = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilter() {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jio.launcher.Adapter.ApplicationViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jio.launcher.Adapter.ApplicationViewHolder holder, int position) {
    }
    
    public final void applyFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filterStr) {
    }
    
    public final void reset() {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jio.launcher.model.AppInfo> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jio.launcher.model.AppInfo> p0) {
    }
    
    public Adapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jio.launcher.model.AppInfo> data, @org.jetbrains.annotations.NotNull()
    android.content.pm.PackageManager pm) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/jio/launcher/Adapter$ApplicationViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/jio/launcher/Adapter;Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "app_debug"})
    public final class ApplicationViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView icon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView name = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public ApplicationViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}