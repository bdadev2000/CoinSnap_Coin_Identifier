package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class DialogForceUpdateBinding extends ViewDataBinding {
    public final LinearLayout llUpdateContent;
    public final TextView tvContent;
    public final TextView tvDescription;
    public final TextView tvUpdate;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogForceUpdateBinding(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.llUpdateContent = linearLayout;
        this.tvContent = textView;
        this.tvDescription = textView2;
        this.tvUpdate = textView3;
    }

    public static DialogForceUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogForceUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (DialogForceUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_force_update, viewGroup, z, obj);
    }

    public static DialogForceUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogForceUpdateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (DialogForceUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_force_update, null, false, obj);
    }

    public static DialogForceUpdateBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogForceUpdateBinding bind(View view, Object obj) {
        return (DialogForceUpdateBinding) bind(obj, view, R.layout.dialog_force_update);
    }
}
