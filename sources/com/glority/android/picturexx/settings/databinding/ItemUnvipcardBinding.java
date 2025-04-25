package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class ItemUnvipcardBinding extends ViewDataBinding {
    public final TextView beMemberTv;
    public final TextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemUnvipcardBinding(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.beMemberTv = textView;
        this.title = textView2;
    }

    public static ItemUnvipcardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemUnvipcardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemUnvipcardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_unvipcard, viewGroup, z, obj);
    }

    public static ItemUnvipcardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemUnvipcardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemUnvipcardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_unvipcard, null, false, obj);
    }

    public static ItemUnvipcardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemUnvipcardBinding bind(View view, Object obj) {
        return (ItemUnvipcardBinding) bind(obj, view, R.layout.item_unvipcard);
    }
}
