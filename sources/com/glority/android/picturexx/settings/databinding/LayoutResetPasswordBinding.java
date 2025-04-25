package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes5.dex */
public abstract class LayoutResetPasswordBinding extends ViewDataBinding {
    public final Button btContinue;
    public final TextInputEditText etEmail;
    public final TextInputLayout textInputResetPwdEmail;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutResetPasswordBinding(Object obj, View view, int i, Button button, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.btContinue = button;
        this.etEmail = textInputEditText;
        this.textInputResetPwdEmail = textInputLayout;
    }

    public static LayoutResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_reset_password, viewGroup, z, obj);
    }

    public static LayoutResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutResetPasswordBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_reset_password, null, false, obj);
    }

    public static LayoutResetPasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutResetPasswordBinding bind(View view, Object obj) {
        return (LayoutResetPasswordBinding) bind(obj, view, R.layout.layout_reset_password);
    }
}
