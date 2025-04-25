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
public abstract class LayoutConfirmPasswordBinding extends ViewDataBinding {
    public final Button btChangePassword;
    public final TextInputEditText etConfirm;
    public final TextInputEditText etPassword;
    public final TextInputLayout textInputPasswordConfirm;
    public final TextInputLayout textInputResetPassword;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutConfirmPasswordBinding(Object obj, View view, int i, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        super(obj, view, i);
        this.btChangePassword = button;
        this.etConfirm = textInputEditText;
        this.etPassword = textInputEditText2;
        this.textInputPasswordConfirm = textInputLayout;
        this.textInputResetPassword = textInputLayout2;
    }

    public static LayoutConfirmPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutConfirmPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutConfirmPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_confirm_password, viewGroup, z, obj);
    }

    public static LayoutConfirmPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutConfirmPasswordBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutConfirmPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_confirm_password, null, false, obj);
    }

    public static LayoutConfirmPasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutConfirmPasswordBinding bind(View view, Object obj) {
        return (LayoutConfirmPasswordBinding) bind(obj, view, R.layout.layout_confirm_password);
    }
}
