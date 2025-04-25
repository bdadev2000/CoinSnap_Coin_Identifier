package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.base.widget.ScrollControlViewPager;

/* loaded from: classes2.dex */
public abstract class FragmentCustomHomeContainerBinding extends ViewDataBinding {
    public final CoinWidgetCommonMenuBarBinding menuBar;
    public final ScrollControlViewPager vp;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomHomeContainerBinding(Object _bindingComponent, View _root, int _localFieldCount, CoinWidgetCommonMenuBarBinding menuBar, ScrollControlViewPager vp) {
        super(_bindingComponent, _root, _localFieldCount);
        this.menuBar = menuBar;
        this.vp = vp;
    }

    public static FragmentCustomHomeContainerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeContainerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomHomeContainerBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_home_container, root, attachToRoot, component);
    }

    public static FragmentCustomHomeContainerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeContainerBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomHomeContainerBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_home_container, null, false, component);
    }

    public static FragmentCustomHomeContainerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeContainerBinding bind(View view, Object component) {
        return (FragmentCustomHomeContainerBinding) bind(component, view, R.layout.fragment_custom_home_container);
    }
}
