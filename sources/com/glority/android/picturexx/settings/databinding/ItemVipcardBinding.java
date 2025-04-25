package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.widget.GlTextView;

/* loaded from: classes5.dex */
public abstract class ItemVipcardBinding extends ViewDataBinding {
    public final GlTextView numberTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemVipcardBinding(Object obj, View view, int i, GlTextView glTextView) {
        super(obj, view, i);
        this.numberTv = glTextView;
    }

    public static ItemVipcardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemVipcardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemVipcardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_vipcard, viewGroup, z, obj);
    }

    public static ItemVipcardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemVipcardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemVipcardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_vipcard, null, false, obj);
    }

    public static ItemVipcardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemVipcardBinding bind(View view, Object obj) {
        return (ItemVipcardBinding) bind(obj, view, R.layout.item_vipcard);
    }
}
