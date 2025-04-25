package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutNoneCustomSeriesEmptyViewBinding extends ViewDataBinding {
    public final ConstraintLayout clEmptyView;
    public final LinearLayout llEmptySeriesCreateNew;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutNoneCustomSeriesEmptyViewBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clEmptyView, LinearLayout llEmptySeriesCreateNew) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clEmptyView = clEmptyView;
        this.llEmptySeriesCreateNew = llEmptySeriesCreateNew;
    }

    public static LayoutNoneCustomSeriesEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCustomSeriesEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutNoneCustomSeriesEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_custom_series_empty_view, root, attachToRoot, component);
    }

    public static LayoutNoneCustomSeriesEmptyViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCustomSeriesEmptyViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutNoneCustomSeriesEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_custom_series_empty_view, null, false, component);
    }

    public static LayoutNoneCustomSeriesEmptyViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCustomSeriesEmptyViewBinding bind(View view, Object component) {
        return (LayoutNoneCustomSeriesEmptyViewBinding) bind(component, view, R.layout.layout_none_custom_series_empty_view);
    }
}
