package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes2.dex */
public abstract class FragmentSeriesCoinListBinding extends ViewDataBinding {
    public final RecyclerView rv;
    public final MaterialToolbar toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSeriesCoinListBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rv, MaterialToolbar toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rv = rv;
        this.toolBar = toolBar;
    }

    public static FragmentSeriesCoinListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesCoinListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSeriesCoinListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_coin_list, root, attachToRoot, component);
    }

    public static FragmentSeriesCoinListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesCoinListBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSeriesCoinListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_coin_list, null, false, component);
    }

    public static FragmentSeriesCoinListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesCoinListBinding bind(View view, Object component) {
        return (FragmentSeriesCoinListBinding) bind(component, view, R.layout.fragment_series_coin_list);
    }
}
