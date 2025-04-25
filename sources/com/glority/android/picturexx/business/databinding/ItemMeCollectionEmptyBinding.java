package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemMeCollectionEmptyBinding extends ViewDataBinding {
    public final ImageView cpBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeCollectionEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView cpBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cpBt = cpBt;
    }

    public static ItemMeCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_empty, root, attachToRoot, component);
    }

    public static ItemMeCollectionEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_empty, null, false, component);
    }

    public static ItemMeCollectionEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionEmptyBinding bind(View view, Object component) {
        return (ItemMeCollectionEmptyBinding) bind(component, view, R.layout.item_me_collection_empty);
    }
}
