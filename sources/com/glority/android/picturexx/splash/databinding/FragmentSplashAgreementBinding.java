package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class FragmentSplashAgreementBinding extends ViewDataBinding {
    public final AppCompatTextView ivLogo;
    public final ConstraintLayout splashPolicyContainer;
    public final TextView tvPolicyContinue;
    public final TextView tvPolicyHint;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSplashAgreementBinding(Object obj, View view, int i, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivLogo = appCompatTextView;
        this.splashPolicyContainer = constraintLayout;
        this.tvPolicyContinue = textView;
        this.tvPolicyHint = textView2;
    }

    public static FragmentSplashAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSplashAgreementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash_agreement, viewGroup, z, obj);
    }

    public static FragmentSplashAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashAgreementBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSplashAgreementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_splash_agreement, null, false, obj);
    }

    public static FragmentSplashAgreementBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSplashAgreementBinding bind(View view, Object obj) {
        return (FragmentSplashAgreementBinding) bind(obj, view, R.layout.fragment_splash_agreement);
    }
}
