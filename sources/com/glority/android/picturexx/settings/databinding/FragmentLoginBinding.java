package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes5.dex */
public abstract class FragmentLoginBinding extends ViewDataBinding {
    public final Button btLogin;
    public final TextInputEditText etEmail;
    public final TextInputEditText etPassword;
    public final ImageView ivBack;
    public final ImageView ivThirdPartyLoginArrow;
    public final LinearLayout llContinueWithTitle;
    public final LinearLayout llLoginWithGoogle;
    public final LinearLayout llThirdPartyLogin;
    public final TextInputLayout textInputLayoutEmail;
    public final TextInputLayout textInputLayoutPassword;
    public final TextView tvForgot;
    public final TextView tvOtherContinueOption;
    public final TextView tvPrivacyPolicy;
    public final TextView tvSignUp;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentLoginBinding(Object obj, View view, int i, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btLogin = button;
        this.etEmail = textInputEditText;
        this.etPassword = textInputEditText2;
        this.ivBack = imageView;
        this.ivThirdPartyLoginArrow = imageView2;
        this.llContinueWithTitle = linearLayout;
        this.llLoginWithGoogle = linearLayout2;
        this.llThirdPartyLogin = linearLayout3;
        this.textInputLayoutEmail = textInputLayout;
        this.textInputLayoutPassword = textInputLayout2;
        this.tvForgot = textView;
        this.tvOtherContinueOption = textView2;
        this.tvPrivacyPolicy = textView3;
        this.tvSignUp = textView4;
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_login, viewGroup, z, obj);
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_login, null, false, obj);
    }

    public static FragmentLoginBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLoginBinding bind(View view, Object obj) {
        return (FragmentLoginBinding) bind(obj, view, R.layout.fragment_login);
    }
}
