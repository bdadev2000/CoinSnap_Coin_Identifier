package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentSimpleCollectionListBinding extends ViewDataBinding {
    public final ItemMeCollectionTopBarOutpageBinding outSearchBar;
    public final RecyclerView rv;
    public final ItemMeCollectionTopBarInpageBinding searchBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSimpleCollectionListBinding(Object _bindingComponent, View _root, int _localFieldCount, ItemMeCollectionTopBarOutpageBinding outSearchBar, RecyclerView rv, ItemMeCollectionTopBarInpageBinding searchBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.outSearchBar = outSearchBar;
        this.rv = rv;
        this.searchBar = searchBar;
    }

    public static FragmentSimpleCollectionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSimpleCollectionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSimpleCollectionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_simple_collection_list, root, attachToRoot, component);
    }

    public static FragmentSimpleCollectionListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSimpleCollectionListBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSimpleCollectionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_simple_collection_list, null, false, component);
    }

    public static FragmentSimpleCollectionListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSimpleCollectionListBinding bind(View view, Object component) {
        return (FragmentSimpleCollectionListBinding) bind(component, view, R.layout.fragment_simple_collection_list);
    }
}
