package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;
import com.glority.base.databinding.EmptyViewBinding;

/* loaded from: classes5.dex */
public abstract class FragmentSplashBinding extends ViewDataBinding {
    public final ConstraintLayout clSplashContainer;
    public final EmptyViewBinding icEmpty;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSplashBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, EmptyViewBinding emptyViewBinding) {
        super(obj, view, i);
        this.clSplashContainer = constraintLayout;
        this.icEmpty = emptyViewBinding;
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash, viewGroup, z, obj);
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash, null, false, obj);
    }

    public static FragmentSplashBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashBinding bind(View view, Object obj) {
        return (FragmentSplashBinding) bind(obj, view, R.layout.fragment_splash);
    }
}
