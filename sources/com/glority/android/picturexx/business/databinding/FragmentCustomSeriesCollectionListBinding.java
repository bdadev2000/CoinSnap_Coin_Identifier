package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class FragmentCustomSeriesCollectionListBinding extends ViewDataBinding {
    public final MaterialButton addTv;
    public final ImageView backIv;
    public final LinearLayout exportLl;
    public final FragmentContainerView fcv;
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomSeriesCollectionListBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton addTv, ImageView backIv, LinearLayout exportLl, FragmentContainerView fcv, GlTextView titleTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addTv = addTv;
        this.backIv = backIv;
        this.exportLl = exportLl;
        this.fcv = fcv;
        this.titleTv = titleTv;
    }

    public static FragmentCustomSeriesCollectionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSeriesCollectionListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomSeriesCollectionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_series_collection_list, root, attachToRoot, component);
    }

    public static FragmentCustomSeriesCollectionListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSeriesCollectionListBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomSeriesCollectionListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_series_collection_list, null, false, component);
    }

    public static FragmentCustomSeriesCollectionListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSeriesCollectionListBinding bind(View view, Object component) {
        return (FragmentCustomSeriesCollectionListBinding) bind(component, view, R.layout.fragment_custom_series_collection_list);
    }
}
