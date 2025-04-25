package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemCollectionSearchEmptyBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCollectionSearchEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static ItemCollectionSearchEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollectionSearchEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCollectionSearchEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_collection_search_empty, root, attachToRoot, component);
    }

    public static ItemCollectionSearchEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollectionSearchEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCollectionSearchEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_collection_search_empty, null, false, component);
    }

    public static ItemCollectionSearchEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollectionSearchEmptyBinding bind(View view, Object component) {
        return (ItemCollectionSearchEmptyBinding) bind(component, view, R.layout.item_collection_search_empty);
    }
}
