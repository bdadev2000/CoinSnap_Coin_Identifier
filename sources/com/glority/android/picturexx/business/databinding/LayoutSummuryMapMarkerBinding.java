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
public abstract class LayoutSummuryMapMarkerBinding extends ViewDataBinding {
    public final AppCompatImageView ivMarker;
    public final AppCompatImageView ivTriangle;
    public final LinearLayout llMarkerContainer;
    public final AppCompatTextView tvCount;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutSummuryMapMarkerBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivMarker, AppCompatImageView ivTriangle, LinearLayout llMarkerContainer, AppCompatTextView tvCount) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivMarker = ivMarker;
        this.ivTriangle = ivTriangle;
        this.llMarkerContainer = llMarkerContainer;
        this.tvCount = tvCount;
    }

    public static LayoutSummuryMapMarkerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummuryMapMarkerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutSummuryMapMarkerBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_summury_map_marker, root, attachToRoot, component);
    }

    public static LayoutSummuryMapMarkerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummuryMapMarkerBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutSummuryMapMarkerBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_summury_map_marker, null, false, component);
    }

    public static LayoutSummuryMapMarkerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummuryMapMarkerBinding bind(View view, Object component) {
        return (LayoutSummuryMapMarkerBinding) bind(component, view, R.layout.layout_summury_map_marker);
    }
}
