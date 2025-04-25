package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.R;
import com.glority.widget.GlTextView;
import com.glority.widget.wheelpicker.GlWheelPickerView;

/* loaded from: classes14.dex */
public abstract class CmsGradingYearSelectedDialogBinding extends ViewDataBinding {
    public final TextView cancelTv;
    public final GlTextView doneTv;
    public final LinearLayout llAdditionalView;
    public final GlWheelPickerView wheel1;

    /* JADX INFO: Access modifiers changed from: protected */
    public CmsGradingYearSelectedDialogBinding(Object obj, View view, int i, TextView textView, GlTextView glTextView, LinearLayout linearLayout, GlWheelPickerView glWheelPickerView) {
        super(obj, view, i);
        this.cancelTv = textView;
        this.doneTv = glTextView;
        this.llAdditionalView = linearLayout;
        this.wheel1 = glWheelPickerView;
    }

    public static CmsGradingYearSelectedDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsGradingYearSelectedDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CmsGradingYearSelectedDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.cms_grading_year_selected_dialog, viewGroup, z, obj);
    }

    public static CmsGradingYearSelectedDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsGradingYearSelectedDialogBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CmsGradingYearSelectedDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.cms_grading_year_selected_dialog, null, false, obj);
    }

    public static CmsGradingYearSelectedDialogBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsGradingYearSelectedDialogBinding bind(View view, Object obj) {
        return (CmsGradingYearSelectedDialogBinding) bind(obj, view, R.layout.cms_grading_year_selected_dialog);
    }
}
