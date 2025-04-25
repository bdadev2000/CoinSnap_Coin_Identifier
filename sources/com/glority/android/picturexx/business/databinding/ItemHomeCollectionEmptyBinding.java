package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemHomeCollectionEmptyBinding extends ViewDataBinding {
    public final LinearLayout collectionMoreLl;
    public final MaterialButton createBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeCollectionEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout collectionMoreLl, MaterialButton createBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.collectionMoreLl = collectionMoreLl;
        this.createBt = createBt;
    }

    public static ItemHomeCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_empty, root, attachToRoot, component);
    }

    public static ItemHomeCollectionEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_empty, null, false, component);
    }

    public static ItemHomeCollectionEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionEmptyBinding bind(View view, Object component) {
        return (ItemHomeCollectionEmptyBinding) bind(component, view, R.layout.item_home_collection_empty);
    }
}
