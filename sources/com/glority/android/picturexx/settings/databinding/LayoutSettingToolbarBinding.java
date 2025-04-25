package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class LayoutSettingToolbarBinding extends ViewDataBinding {
    public final Toolbar toolbar;
    public final AppCompatTextView toolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutSettingToolbarBinding(Object obj, View view, int i, Toolbar toolbar, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.toolbar = toolbar;
        this.toolbarTitle = appCompatTextView;
    }

    public static LayoutSettingToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutSettingToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_setting_toolbar, viewGroup, z, obj);
    }

    public static LayoutSettingToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingToolbarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutSettingToolbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_setting_toolbar, null, false, obj);
    }

    public static LayoutSettingToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingToolbarBinding bind(View view, Object obj) {
        return (LayoutSettingToolbarBinding) bind(obj, view, R.layout.layout_setting_toolbar);
    }
}
