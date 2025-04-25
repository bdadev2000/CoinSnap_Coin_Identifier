package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemCustomMeTabLayoutBinding extends ViewDataBinding {
    public final AppCompatTextView tvMeTabCategory;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomMeTabLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatTextView tvMeTabCategory) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tvMeTabCategory = tvMeTabCategory;
    }

    public static ItemCustomMeTabLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomMeTabLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomMeTabLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_me_tab_layout, root, attachToRoot, component);
    }

    public static ItemCustomMeTabLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomMeTabLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomMeTabLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_me_tab_layout, null, false, component);
    }

    public static ItemCustomMeTabLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomMeTabLayoutBinding bind(View view, Object component) {
        return (ItemCustomMeTabLayoutBinding) bind(component, view, R.layout.item_custom_me_tab_layout);
    }
}
