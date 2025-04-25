package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes5.dex */
public abstract class LayoutCheckEmailBinding extends ViewDataBinding {
    public final Button btVerify;
    public final TextInputEditText etCode;
    public final TextInputLayout textInputResetPwdVerifyCode;
    public final TextView tvDescription;
    public final TextView tvSend;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutCheckEmailBinding(Object obj, View view, int i, Button button, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btVerify = button;
        this.etCode = textInputEditText;
        this.textInputResetPwdVerifyCode = textInputLayout;
        this.tvDescription = textView;
        this.tvSend = textView2;
    }

    public static LayoutCheckEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCheckEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutCheckEmailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_check_email, viewGroup, z, obj);
    }

    public static LayoutCheckEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCheckEmailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutCheckEmailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_check_email, null, false, obj);
    }

    public static LayoutCheckEmailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCheckEmailBinding bind(View view, Object obj) {
        return (LayoutCheckEmailBinding) bind(obj, view, R.layout.layout_check_email);
    }
}
