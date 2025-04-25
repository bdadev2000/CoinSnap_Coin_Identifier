package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutCollectionAllListHeaderBinding extends ViewDataBinding {
    public final AppCompatImageView ivRegionIcon;
    public final LinearLayout llCollectionExport;
    public final LinearLayout llRegionSelection;
    public final LinearLayout llSortTypeSelection;
    public final AppCompatTextView tvRegionName;
    public final AppCompatTextView tvSortTypeName;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutCollectionAllListHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivRegionIcon, LinearLayout llCollectionExport, LinearLayout llRegionSelection, LinearLayout llSortTypeSelection, AppCompatTextView tvRegionName, AppCompatTextView tvSortTypeName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivRegionIcon = ivRegionIcon;
        this.llCollectionExport = llCollectionExport;
        this.llRegionSelection = llRegionSelection;
        this.llSortTypeSelection = llSortTypeSelection;
        this.tvRegionName = tvRegionName;
        this.tvSortTypeName = tvSortTypeName;
    }

    public static LayoutCollectionAllListHeaderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionAllListHeaderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutCollectionAllListHeaderBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_collection_all_list_header, root, attachToRoot, component);
    }

    public static LayoutCollectionAllListHeaderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionAllListHeaderBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutCollectionAllListHeaderBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_collection_all_list_header, null, false, component);
    }

    public static LayoutCollectionAllListHeaderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCollectionAllListHeaderBinding bind(View view, Object component) {
        return (LayoutCollectionAllListHeaderBinding) bind(component, view, R.layout.layout_collection_all_list_header);
    }
}
