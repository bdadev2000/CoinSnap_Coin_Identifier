package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewSeriesCollectionFolderLayoutBinding extends ViewDataBinding {
    public final AppCompatImageView ivSeriesCollectionFolder1;
    public final AppCompatImageView ivSeriesCollectionFolder2;
    public final AppCompatImageView ivSeriesCollectionFolder3;
    public final AppCompatImageView ivSeriesCollectionFolder4;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewSeriesCollectionFolderLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivSeriesCollectionFolder1, AppCompatImageView ivSeriesCollectionFolder2, AppCompatImageView ivSeriesCollectionFolder3, AppCompatImageView ivSeriesCollectionFolder4) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivSeriesCollectionFolder1 = ivSeriesCollectionFolder1;
        this.ivSeriesCollectionFolder2 = ivSeriesCollectionFolder2;
        this.ivSeriesCollectionFolder3 = ivSeriesCollectionFolder3;
        this.ivSeriesCollectionFolder4 = ivSeriesCollectionFolder4;
    }

    public static ViewSeriesCollectionFolderLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSeriesCollectionFolderLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewSeriesCollectionFolderLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_series_collection_folder_layout, root, attachToRoot, component);
    }

    public static ViewSeriesCollectionFolderLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSeriesCollectionFolderLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewSeriesCollectionFolderLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_series_collection_folder_layout, null, false, component);
    }

    public static ViewSeriesCollectionFolderLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSeriesCollectionFolderLayoutBinding bind(View view, Object component) {
        return (ViewSeriesCollectionFolderLayoutBinding) bind(component, view, R.layout.view_series_collection_folder_layout);
    }
}
