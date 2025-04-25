package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentMeCollectionAllBinding extends ViewDataBinding {
    public final RecyclerView rvCollections;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMeCollectionAllBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rvCollections) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rvCollections = rvCollections;
    }

    public static FragmentMeCollectionAllBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionAllBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMeCollectionAllBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_all, root, attachToRoot, component);
    }

    public static FragmentMeCollectionAllBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionAllBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMeCollectionAllBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_all, null, false, component);
    }

    public static FragmentMeCollectionAllBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionAllBinding bind(View view, Object component) {
        return (FragmentMeCollectionAllBinding) bind(component, view, R.layout.fragment_me_collection_all);
    }
}
