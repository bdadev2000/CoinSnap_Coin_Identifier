package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemCustomSeriesSelectedBinding extends ViewDataBinding {
    public final GlTextView countTv;
    public final ShapeableImageView iv1;
    public final ShapeableImageView iv2;
    public final ShapeableImageView iv3;
    public final FrameLayout ivMeSeriesMore;
    public final GlTextView tvMeSeriesName;
    public final GlTextView updateTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomSeriesSelectedBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView countTv, ShapeableImageView iv1, ShapeableImageView iv2, ShapeableImageView iv3, FrameLayout ivMeSeriesMore, GlTextView tvMeSeriesName, GlTextView updateTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.countTv = countTv;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.iv3 = iv3;
        this.ivMeSeriesMore = ivMeSeriesMore;
        this.tvMeSeriesName = tvMeSeriesName;
        this.updateTv = updateTv;
    }

    public static ItemCustomSeriesSelectedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesSelectedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomSeriesSelectedBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_selected, root, attachToRoot, component);
    }

    public static ItemCustomSeriesSelectedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesSelectedBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomSeriesSelectedBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_selected, null, false, component);
    }

    public static ItemCustomSeriesSelectedBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesSelectedBinding bind(View view, Object component) {
        return (ItemCustomSeriesSelectedBinding) bind(component, view, R.layout.item_custom_series_selected);
    }
}
