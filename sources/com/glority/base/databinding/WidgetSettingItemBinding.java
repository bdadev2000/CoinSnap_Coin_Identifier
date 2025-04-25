package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;

/* loaded from: classes6.dex */
public abstract class WidgetSettingItemBinding extends ViewDataBinding {
    public final View bottomLine;
    public final AppCompatImageView ivIcon;
    public final AppCompatImageView ivRightIcon;
    public final AppCompatTextView tvRightInfo;
    public final AppCompatTextView tvSubtitle;
    public final AppCompatTextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public WidgetSettingItemBinding(Object obj, View view, int i, View view2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i);
        this.bottomLine = view2;
        this.ivIcon = appCompatImageView;
        this.ivRightIcon = appCompatImageView2;
        this.tvRightInfo = appCompatTextView;
        this.tvSubtitle = appCompatTextView2;
        this.tvTitle = appCompatTextView3;
    }

    public static WidgetSettingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetSettingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (WidgetSettingItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_setting_item, viewGroup, z, obj);
    }

    public static WidgetSettingItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetSettingItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (WidgetSettingItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_setting_item, null, false, obj);
    }

    public static WidgetSettingItemBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetSettingItemBinding bind(View view, Object obj) {
        return (WidgetSettingItemBinding) bind(obj, view, R.layout.widget_setting_item);
    }
}
