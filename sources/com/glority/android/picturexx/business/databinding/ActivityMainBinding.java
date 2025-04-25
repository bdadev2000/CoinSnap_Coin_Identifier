package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {
    public final FragmentContainerView fcv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fcv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fcv = fcv;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_main, null, false, component);
    }

    public static ActivityMainBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding bind(View view, Object component) {
        return (ActivityMainBinding) bind(component, view, R.layout.activity_main);
    }
}
