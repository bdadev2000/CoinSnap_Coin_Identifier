package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentRecognizeLoadingBinding extends ViewDataBinding {
    public final ImageView closeIv;
    public final ImageView iv;
    public final LottieAnimationView ivAnim;
    public final ImageView loadingBar;
    public final LinearLayout loadingContainer;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentRecognizeLoadingBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView closeIv, ImageView iv, LottieAnimationView ivAnim, ImageView loadingBar, LinearLayout loadingContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.closeIv = closeIv;
        this.iv = iv;
        this.ivAnim = ivAnim;
        this.loadingBar = loadingBar;
        this.loadingContainer = loadingContainer;
    }

    public static FragmentRecognizeLoadingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeLoadingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentRecognizeLoadingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recognize_loading, root, attachToRoot, component);
    }

    public static FragmentRecognizeLoadingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeLoadingBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentRecognizeLoadingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recognize_loading, null, false, component);
    }

    public static FragmentRecognizeLoadingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeLoadingBinding bind(View view, Object component) {
        return (FragmentRecognizeLoadingBinding) bind(component, view, R.layout.fragment_recognize_loading);
    }
}
