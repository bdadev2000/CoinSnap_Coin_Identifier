package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentMeCollectionMySetPageBinding extends ViewDataBinding {
    public final RecyclerView rv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMeCollectionMySetPageBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rv = rv;
    }

    public static FragmentMeCollectionMySetPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionMySetPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMeCollectionMySetPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_my_set_page, root, attachToRoot, component);
    }

    public static FragmentMeCollectionMySetPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionMySetPageBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMeCollectionMySetPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_my_set_page, null, false, component);
    }

    public static FragmentMeCollectionMySetPageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionMySetPageBinding bind(View view, Object component) {
        return (FragmentMeCollectionMySetPageBinding) bind(component, view, R.layout.fragment_me_collection_my_set_page);
    }
}
