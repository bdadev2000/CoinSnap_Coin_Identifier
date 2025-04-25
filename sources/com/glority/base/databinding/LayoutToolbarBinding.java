package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes6.dex */
public abstract class LayoutToolbarBinding extends ViewDataBinding {
    public final Toolbar toolbar;
    public final AppBarLayout toolbarLayout1;
    public final AppCompatTextView toolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutToolbarBinding(Object obj, View view, int i, Toolbar toolbar, AppBarLayout appBarLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.toolbar = toolbar;
        this.toolbarLayout1 = appBarLayout;
        this.toolbarTitle = appCompatTextView;
    }

    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_toolbar, viewGroup, z, obj);
    }

    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_toolbar, null, false, obj);
    }

    public static LayoutToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutToolbarBinding bind(View view, Object obj) {
        return (LayoutToolbarBinding) bind(obj, view, R.layout.layout_toolbar);
    }
}
