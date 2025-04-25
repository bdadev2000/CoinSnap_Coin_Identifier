package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.CoinLoadingLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes2.dex */
public abstract class FragmentSeriesDetailBinding extends ViewDataBinding {
    public final LinearLayout gotItTv;
    public final CoinLoadingLayout loadingView;
    public final RecyclerView rv;
    public final MaterialToolbar toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSeriesDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout gotItTv, CoinLoadingLayout loadingView, RecyclerView rv, MaterialToolbar toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gotItTv = gotItTv;
        this.loadingView = loadingView;
        this.rv = rv;
        this.toolBar = toolBar;
    }

    public static FragmentSeriesDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSeriesDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_detail, root, attachToRoot, component);
    }

    public static FragmentSeriesDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSeriesDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_detail, null, false, component);
    }

    public static FragmentSeriesDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesDetailBinding bind(View view, Object component) {
        return (FragmentSeriesDetailBinding) bind(component, view, R.layout.fragment_series_detail);
    }
}
