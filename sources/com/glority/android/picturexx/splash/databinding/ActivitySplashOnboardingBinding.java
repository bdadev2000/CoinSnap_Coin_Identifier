package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class ActivitySplashOnboardingBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySplashOnboardingBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ActivitySplashOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivitySplashOnboardingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash_onboarding, viewGroup, z, obj);
    }

    public static ActivitySplashOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashOnboardingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivitySplashOnboardingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash_onboarding, null, false, obj);
    }

    public static ActivitySplashOnboardingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashOnboardingBinding bind(View view, Object obj) {
        return (ActivitySplashOnboardingBinding) bind(obj, view, R.layout.activity_splash_onboarding);
    }
}
