package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class ActivityDeeplinkHandlerBinding extends ViewDataBinding {
    public final ConstraintLayout clSplashContainer;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDeeplinkHandlerBinding(Object obj, View view, int i, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.clSplashContainer = constraintLayout;
    }

    public static ActivityDeeplinkHandlerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDeeplinkHandlerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityDeeplinkHandlerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_deeplink_handler, viewGroup, z, obj);
    }

    public static ActivityDeeplinkHandlerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDeeplinkHandlerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityDeeplinkHandlerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_deeplink_handler, null, false, obj);
    }

    public static ActivityDeeplinkHandlerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDeeplinkHandlerBinding bind(View view, Object obj) {
        return (ActivityDeeplinkHandlerBinding) bind(obj, view, R.layout.activity_deeplink_handler);
    }
}
