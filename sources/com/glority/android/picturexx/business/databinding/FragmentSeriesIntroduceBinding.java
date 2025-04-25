package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.CoinLoadingLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes2.dex */
public abstract class FragmentSeriesIntroduceBinding extends ViewDataBinding {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ImageView headerIv;
    public final CoinLoadingLayout loadingLayout;
    public final RecyclerView rv;
    public final MaterialToolbar toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSeriesIntroduceBinding(Object _bindingComponent, View _root, int _localFieldCount, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbar, ImageView headerIv, CoinLoadingLayout loadingLayout, RecyclerView rv, MaterialToolbar toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbar;
        this.headerIv = headerIv;
        this.loadingLayout = loadingLayout;
        this.rv = rv;
        this.toolBar = toolBar;
    }

    public static FragmentSeriesIntroduceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesIntroduceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSeriesIntroduceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_introduce, root, attachToRoot, component);
    }

    public static FragmentSeriesIntroduceBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesIntroduceBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSeriesIntroduceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_series_introduce, null, false, component);
    }

    public static FragmentSeriesIntroduceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSeriesIntroduceBinding bind(View view, Object component) {
        return (FragmentSeriesIntroduceBinding) bind(component, view, R.layout.fragment_series_introduce);
    }
}
