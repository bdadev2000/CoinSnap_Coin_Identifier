package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes5.dex */
public abstract class ActivityGradingSnaptipsBinding extends ViewDataBinding {
    public final MaterialButton tvContinue;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityGradingSnaptipsBinding(Object obj, View view, int i, MaterialButton materialButton) {
        super(obj, view, i);
        this.tvContinue = materialButton;
    }

    public static ActivityGradingSnaptipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingSnaptipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityGradingSnaptipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_grading_snaptips, viewGroup, z, obj);
    }

    public static ActivityGradingSnaptipsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingSnaptipsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityGradingSnaptipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_grading_snaptips, null, false, obj);
    }

    public static ActivityGradingSnaptipsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingSnaptipsBinding bind(View view, Object obj) {
        return (ActivityGradingSnaptipsBinding) bind(obj, view, R.layout.activity_grading_snaptips);
    }
}
