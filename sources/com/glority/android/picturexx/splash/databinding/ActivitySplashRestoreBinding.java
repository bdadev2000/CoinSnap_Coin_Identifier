package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class ActivitySplashRestoreBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySplashRestoreBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static ActivitySplashRestoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashRestoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivitySplashRestoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash_restore, viewGroup, z, obj);
    }

    public static ActivitySplashRestoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashRestoreBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivitySplashRestoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash_restore, null, false, obj);
    }

    public static ActivitySplashRestoreBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashRestoreBinding bind(View view, Object obj) {
        return (ActivitySplashRestoreBinding) bind(obj, view, R.layout.activity_splash_restore);
    }
}
