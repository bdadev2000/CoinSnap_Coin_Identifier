package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentMeCollectionOfficialSetPageBinding extends ViewDataBinding {
    public final RecyclerView rvSeries;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMeCollectionOfficialSetPageBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rvSeries) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rvSeries = rvSeries;
    }

    public static FragmentMeCollectionOfficialSetPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionOfficialSetPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMeCollectionOfficialSetPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_official_set_page, root, attachToRoot, component);
    }

    public static FragmentMeCollectionOfficialSetPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionOfficialSetPageBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMeCollectionOfficialSetPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_official_set_page, null, false, component);
    }

    public static FragmentMeCollectionOfficialSetPageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionOfficialSetPageBinding bind(View view, Object component) {
        return (FragmentMeCollectionOfficialSetPageBinding) bind(component, view, R.layout.fragment_me_collection_official_set_page);
    }
}
