package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes5.dex */
public abstract class FragmentSignUpBinding extends ViewDataBinding {
    public final Button btSignup;
    public final TextInputEditText etEmail;
    public final TextInputEditText etPassword;
    public final ImageView ivBack;
    public final TextInputLayout textLayoutEmail;
    public final TextInputLayout textLayoutPassword;
    public final TextView tvLogin;
    public final TextView tvPrivacyPolicy;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSignUpBinding(Object obj, View view, int i, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btSignup = button;
        this.etEmail = textInputEditText;
        this.etPassword = textInputEditText2;
        this.ivBack = imageView;
        this.textLayoutEmail = textInputLayout;
        this.textLayoutPassword = textInputLayout2;
        this.tvLogin = textView;
        this.tvPrivacyPolicy = textView2;
    }

    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSignUpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sign_up, viewGroup, z, obj);
    }

    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSignUpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sign_up, null, false, obj);
    }

    public static FragmentSignUpBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding bind(View view, Object obj) {
        return (FragmentSignUpBinding) bind(obj, view, R.layout.fragment_sign_up);
    }
}
