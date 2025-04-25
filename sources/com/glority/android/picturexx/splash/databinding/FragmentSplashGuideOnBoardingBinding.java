package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class FragmentSplashGuideOnBoardingBinding extends ViewDataBinding {
    public final ComposeView composeView;
    public final TextView tvSkip;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSplashGuideOnBoardingBinding(Object obj, View view, int i, ComposeView composeView, TextView textView) {
        super(obj, view, i);
        this.composeView = composeView;
        this.tvSkip = textView;
    }

    public static FragmentSplashGuideOnBoardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashGuideOnBoardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSplashGuideOnBoardingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash_guide_on_boarding, viewGroup, z, obj);
    }

    public static FragmentSplashGuideOnBoardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashGuideOnBoardingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSplashGuideOnBoardingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash_guide_on_boarding, null, false, obj);
    }

    public static FragmentSplashGuideOnBoardingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashGuideOnBoardingBinding bind(View view, Object obj) {
        return (FragmentSplashGuideOnBoardingBinding) bind(obj, view, R.layout.fragment_splash_guide_on_boarding);
    }
}
