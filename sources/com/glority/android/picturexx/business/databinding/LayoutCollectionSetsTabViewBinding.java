package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutCollectionSetsTabViewBinding extends ViewDataBinding {
    public final AppCompatTextView setsMySetsTab;
    public final AppCompatTextView setsOfficialSetTab;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutCollectionSetsTabViewBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatTextView setsMySetsTab, AppCompatTextView setsOfficialSetTab) {
        super(_bindingComponent, _root, _localFieldCount);
        this.setsMySetsTab = setsMySetsTab;
        this.setsOfficialSetTab = setsOfficialSetTab;
    }

    public static LayoutCollectionSetsTabViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionSetsTabViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutCollectionSetsTabViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_collection_sets_tab_view, root, attachToRoot, component);
    }

    public static LayoutCollectionSetsTabViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionSetsTabViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutCollectionSetsTabViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_collection_sets_tab_view, null, false, component);
    }

    public static LayoutCollectionSetsTabViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionSetsTabViewBinding bind(View view, Object component) {
        return (LayoutCollectionSetsTabViewBinding) bind(component, view, R.layout.layout_collection_sets_tab_view);
    }
}
