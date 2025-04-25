package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.views.CollectionSetsTabView;
import com.glority.base.widget.ScrollControlViewPager;

/* loaded from: classes2.dex */
public abstract class FragmentMeCollectionSetsBinding extends ViewDataBinding {
    public final CollectionSetsTabView tabView;
    public final ScrollControlViewPager viewPager;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMeCollectionSetsBinding(Object _bindingComponent, View _root, int _localFieldCount, CollectionSetsTabView tabView, ScrollControlViewPager viewPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tabView = tabView;
        this.viewPager = viewPager;
    }

    public static FragmentMeCollectionSetsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSetsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMeCollectionSetsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_sets, root, attachToRoot, component);
    }

    public static FragmentMeCollectionSetsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSetsBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMeCollectionSetsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_sets, null, false, component);
    }

    public static FragmentMeCollectionSetsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSetsBinding bind(View view, Object component) {
        return (FragmentMeCollectionSetsBinding) bind(component, view, R.layout.fragment_me_collection_sets);
    }
}
