package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.views.CollectionFunctionZoneView;
import com.glority.android.picturexx.views.CollectionPageSwitchView;
import com.glority.base.widget.ScrollControlViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public abstract class FragmentCustomMeCollectionBinding extends ViewDataBinding {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final CollectionFunctionZoneView headerFunctionZone;
    public final CollectionPageSwitchView pageSwitchView;
    public final ScrollControlViewPager viewPager;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomMeCollectionBinding(Object _bindingComponent, View _root, int _localFieldCount, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbar, CollectionFunctionZoneView headerFunctionZone, CollectionPageSwitchView pageSwitchView, ScrollControlViewPager viewPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbar;
        this.headerFunctionZone = headerFunctionZone;
        this.pageSwitchView = pageSwitchView;
        this.viewPager = viewPager;
    }

    public static FragmentCustomMeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomMeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomMeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_me_collection, root, attachToRoot, component);
    }

    public static FragmentCustomMeCollectionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomMeCollectionBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomMeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_me_collection, null, false, component);
    }

    public static FragmentCustomMeCollectionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomMeCollectionBinding bind(View view, Object component) {
        return (FragmentCustomMeCollectionBinding) bind(component, view, R.layout.fragment_custom_me_collection);
    }
}
