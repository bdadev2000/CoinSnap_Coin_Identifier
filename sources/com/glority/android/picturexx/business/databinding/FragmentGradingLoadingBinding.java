package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.picturexx.business.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes2.dex */
public abstract class FragmentGradingLoadingBinding extends ViewDataBinding {
    public final ImageView closeIv;
    public final ImageView iv1;
    public final ImageView iv2;
    public final ImageView iv3;
    public final ImageView iv4;
    public final LottieAnimationView ivAnim;
    public final ProgressBar pb1;
    public final ProgressBar pb2;
    public final ProgressBar pb3;
    public final ProgressBar pb4;
    public final CircularProgressIndicator pd;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGradingLoadingBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView closeIv, ImageView iv1, ImageView iv2, ImageView iv3, ImageView iv4, LottieAnimationView ivAnim, ProgressBar pb1, ProgressBar pb2, ProgressBar pb3, ProgressBar pb4, CircularProgressIndicator pd) {
        super(_bindingComponent, _root, _localFieldCount);
        this.closeIv = closeIv;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.iv3 = iv3;
        this.iv4 = iv4;
        this.ivAnim = ivAnim;
        this.pb1 = pb1;
        this.pb2 = pb2;
        this.pb3 = pb3;
        this.pb4 = pb4;
        this.pd = pd;
    }

    public static FragmentGradingLoadingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingLoadingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentGradingLoadingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_grading_loading, root, attachToRoot, component);
    }

    public static FragmentGradingLoadingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingLoadingBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentGradingLoadingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_grading_loading, null, false, component);
    }

    public static FragmentGradingLoadingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingLoadingBinding bind(View view, Object component) {
        return (FragmentGradingLoadingBinding) bind(component, view, R.layout.fragment_grading_loading);
    }
}
