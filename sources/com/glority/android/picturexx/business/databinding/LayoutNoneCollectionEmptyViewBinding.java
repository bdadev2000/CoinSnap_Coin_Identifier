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
public abstract class LayoutNoneCollectionEmptyViewBinding extends ViewDataBinding {
    public final ConstraintLayout clEmptyView;
    public final LinearLayout llEmptyCollectionAddCoins;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutNoneCollectionEmptyViewBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clEmptyView, LinearLayout llEmptyCollectionAddCoins) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clEmptyView = clEmptyView;
        this.llEmptyCollectionAddCoins = llEmptyCollectionAddCoins;
    }

    public static LayoutNoneCollectionEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCollectionEmptyViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutNoneCollectionEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_collection_empty_view, root, attachToRoot, component);
    }

    public static LayoutNoneCollectionEmptyViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCollectionEmptyViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutNoneCollectionEmptyViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_none_collection_empty_view, null, false, component);
    }

    public static LayoutNoneCollectionEmptyViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutNoneCollectionEmptyViewBinding bind(View view, Object component) {
        return (LayoutNoneCollectionEmptyViewBinding) bind(component, view, R.layout.layout_none_collection_empty_view);
    }
}
