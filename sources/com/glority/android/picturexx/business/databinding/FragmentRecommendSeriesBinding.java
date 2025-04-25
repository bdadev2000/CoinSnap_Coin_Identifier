package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.CoinLoadingLayout;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes2.dex */
public abstract class FragmentRecommendSeriesBinding extends ViewDataBinding {
    public final CoinLoadingLayout loadingView;
    public final LayoutToolbarBinding naviBar;
    public final RecyclerView rv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentRecommendSeriesBinding(Object _bindingComponent, View _root, int _localFieldCount, CoinLoadingLayout loadingView, LayoutToolbarBinding naviBar, RecyclerView rv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.loadingView = loadingView;
        this.naviBar = naviBar;
        this.rv = rv;
    }

    public static FragmentRecommendSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecommendSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentRecommendSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recommend_series, root, attachToRoot, component);
    }

    public static FragmentRecommendSeriesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecommendSeriesBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentRecommendSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recommend_series, null, false, component);
    }

    public static FragmentRecommendSeriesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecommendSeriesBinding bind(View view, Object component) {
        return (FragmentRecommendSeriesBinding) bind(component, view, R.layout.fragment_recommend_series);
    }
}
