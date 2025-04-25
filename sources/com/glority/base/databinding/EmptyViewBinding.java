package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;

/* loaded from: classes6.dex */
public abstract class EmptyViewBinding extends ViewDataBinding {
    public final TextView btn;
    public final ImageView iv;
    public final ConstraintLayout root;
    public final TextView tv;

    /* JADX INFO: Access modifiers changed from: protected */
    public EmptyViewBinding(Object obj, View view, int i, TextView textView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.btn = textView;
        this.iv = imageView;
        this.root = constraintLayout;
        this.tv = textView2;
    }

    public static EmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static EmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (EmptyViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.empty_view, viewGroup, z, obj);
    }

    public static EmptyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static EmptyViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (EmptyViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.empty_view, null, false, obj);
    }

    public static EmptyViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static EmptyViewBinding bind(View view, Object obj) {
        return (EmptyViewBinding) bind(obj, view, R.layout.empty_view);
    }
}
