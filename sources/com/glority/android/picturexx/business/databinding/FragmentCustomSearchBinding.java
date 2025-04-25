package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.SearchComponentView;

/* loaded from: classes2.dex */
public abstract class FragmentCustomSearchBinding extends ViewDataBinding {
    public final SearchComponentView sv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomSearchBinding(Object _bindingComponent, View _root, int _localFieldCount, SearchComponentView sv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.sv = sv;
    }

    public static FragmentCustomSearchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomSearchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_search, root, attachToRoot, component);
    }

    public static FragmentCustomSearchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomSearchBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_search, null, false, component);
    }

    public static FragmentCustomSearchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchBinding bind(View view, Object component) {
        return (FragmentCustomSearchBinding) bind(component, view, R.layout.fragment_custom_search);
    }
}
