package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes2.dex */
public abstract class FragmentCustomSnapHistoryBinding extends ViewDataBinding {
    public final RecyclerView rv;
    public final LayoutToolbarBinding toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomSnapHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rv, LayoutToolbarBinding toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rv = rv;
        this.toolBar = toolBar;
    }

    public static FragmentCustomSnapHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSnapHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomSnapHistoryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_snap_history, root, attachToRoot, component);
    }

    public static FragmentCustomSnapHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSnapHistoryBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomSnapHistoryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_snap_history, null, false, component);
    }

    public static FragmentCustomSnapHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSnapHistoryBinding bind(View view, Object component) {
        return (FragmentCustomSnapHistoryBinding) bind(component, view, R.layout.fragment_custom_snap_history);
    }
}
