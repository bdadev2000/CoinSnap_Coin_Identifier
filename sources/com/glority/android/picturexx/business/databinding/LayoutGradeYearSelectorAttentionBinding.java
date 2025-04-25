package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutGradeYearSelectorAttentionBinding extends ViewDataBinding {
    public final AppCompatTextView tvAttention;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutGradeYearSelectorAttentionBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatTextView tvAttention) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tvAttention = tvAttention;
    }

    public static LayoutGradeYearSelectorAttentionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutGradeYearSelectorAttentionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutGradeYearSelectorAttentionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_grade_year_selector_attention, root, attachToRoot, component);
    }

    public static LayoutGradeYearSelectorAttentionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutGradeYearSelectorAttentionBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutGradeYearSelectorAttentionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_grade_year_selector_attention, null, false, component);
    }

    public static LayoutGradeYearSelectorAttentionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutGradeYearSelectorAttentionBinding bind(View view, Object component) {
        return (LayoutGradeYearSelectorAttentionBinding) bind(component, view, R.layout.layout_grade_year_selector_attention);
    }
}
