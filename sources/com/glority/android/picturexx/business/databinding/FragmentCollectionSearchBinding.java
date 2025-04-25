package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentCollectionSearchBinding extends ViewDataBinding {
    public final FragmentContainerView fcv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCollectionSearchBinding(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fcv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fcv = fcv;
    }

    public static FragmentCollectionSearchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionSearchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCollectionSearchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_search, root, attachToRoot, component);
    }

    public static FragmentCollectionSearchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionSearchBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCollectionSearchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_search, null, false, component);
    }

    public static FragmentCollectionSearchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionSearchBinding bind(View view, Object component) {
        return (FragmentCollectionSearchBinding) bind(component, view, R.layout.fragment_collection_search);
    }
}
