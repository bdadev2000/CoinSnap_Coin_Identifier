package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemMeHistoryEmptyBinding extends ViewDataBinding {
    public final ImageView cpBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeHistoryEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView cpBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cpBt = cpBt;
    }

    public static ItemMeHistoryEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeHistoryEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_history_empty, root, attachToRoot, component);
    }

    public static ItemMeHistoryEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeHistoryEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_history_empty, null, false, component);
    }

    public static ItemMeHistoryEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryEmptyBinding bind(View view, Object component) {
        return (ItemMeHistoryEmptyBinding) bind(component, view, R.layout.item_me_history_empty);
    }
}
