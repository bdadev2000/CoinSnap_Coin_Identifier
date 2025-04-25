package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ActivityGradingGuideBinding extends ViewDataBinding {
    public final MaterialButton getStartBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityGradingGuideBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton getStartBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.getStartBt = getStartBt;
    }

    public static ActivityGradingGuideBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingGuideBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityGradingGuideBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_grading_guide, root, attachToRoot, component);
    }

    public static ActivityGradingGuideBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingGuideBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityGradingGuideBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_grading_guide, null, false, component);
    }

    public static ActivityGradingGuideBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityGradingGuideBinding bind(View view, Object component) {
        return (ActivityGradingGuideBinding) bind(component, view, R.layout.activity_grading_guide);
    }
}
