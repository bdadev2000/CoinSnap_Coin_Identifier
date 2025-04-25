package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBinding;
import com.glority.android.picturexx.widget.CoinLoadingLayout;

/* loaded from: classes2.dex */
public abstract class FragmentCoinSecondLevelBinding extends ViewDataBinding {
    public final CoinLoadingLayout loadingLayout;
    public final LayoutSettingToolbarBinding naviBar;
    public final RecyclerView rv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCoinSecondLevelBinding(Object _bindingComponent, View _root, int _localFieldCount, CoinLoadingLayout loadingLayout, LayoutSettingToolbarBinding naviBar, RecyclerView rv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.loadingLayout = loadingLayout;
        this.naviBar = naviBar;
        this.rv = rv;
    }

    public static FragmentCoinSecondLevelBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoinSecondLevelBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCoinSecondLevelBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_coin_second_level, root, attachToRoot, component);
    }

    public static FragmentCoinSecondLevelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoinSecondLevelBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCoinSecondLevelBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_coin_second_level, null, false, component);
    }

    public static FragmentCoinSecondLevelBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoinSecondLevelBinding bind(View view, Object component) {
        return (FragmentCoinSecondLevelBinding) bind(component, view, R.layout.fragment_coin_second_level);
    }
}
