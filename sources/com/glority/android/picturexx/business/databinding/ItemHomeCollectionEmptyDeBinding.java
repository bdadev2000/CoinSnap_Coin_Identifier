package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemHomeCollectionEmptyDeBinding extends ViewDataBinding {
    public final MaterialButton createBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeCollectionEmptyDeBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton createBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.createBt = createBt;
    }

    public static ItemHomeCollectionEmptyDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeCollectionEmptyDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_empty_de, root, attachToRoot, component);
    }

    public static ItemHomeCollectionEmptyDeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyDeBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeCollectionEmptyDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_empty_de, null, false, component);
    }

    public static ItemHomeCollectionEmptyDeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyDeBinding bind(View view, Object component) {
        return (ItemHomeCollectionEmptyDeBinding) bind(component, view, R.layout.item_home_collection_empty_de);
    }
}
