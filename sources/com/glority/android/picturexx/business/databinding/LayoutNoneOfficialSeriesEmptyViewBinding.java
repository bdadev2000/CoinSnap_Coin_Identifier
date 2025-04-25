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
public abstract class LayoutNoneOfficialSeriesEmptyViewBinding extends ViewDataBinding {
    public final ConstraintLayout clEmptyView;
    public final LinearLayout llCheckAllOfficialSet;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutNoneOfficialSeriesEmptyViewBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clEmptyView, LinearLayout llCheckAllOfficialSet) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clEmptyView = clEmptyView;
        this.llCheckAllOfficialSet = llCheckAllOfficialSet;
    }

    public static LayoutNoneOfficialSeriesEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneOfficialSeriesEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutNoneOfficialSeriesEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_official_series_empty_view, root, attachToRoot, component);
    }

    public static LayoutNoneOfficialSeriesEmptyViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneOfficialSeriesEmptyViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutNoneOfficialSeriesEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_official_series_empty_view, null, false, component);
    }

    public static LayoutNoneOfficialSeriesEmptyViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneOfficialSeriesEmptyViewBinding bind(View view, Object component) {
        return (LayoutNoneOfficialSeriesEmptyViewBinding) bind(component, view, R.layout.layout_none_official_series_empty_view);
    }
}
