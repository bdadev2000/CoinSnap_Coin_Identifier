package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.wheelpicker.GlWheelPickerView;

/* loaded from: classes2.dex */
public abstract class DialogVarietySelectBinding extends ViewDataBinding {
    public final TextView tvCancel;
    public final TextView tvDone;
    public final GlWheelPickerView wheel1;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogVarietySelectBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView tvCancel, TextView tvDone, GlWheelPickerView wheel1) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tvCancel = tvCancel;
        this.tvDone = tvDone;
        this.wheel1 = wheel1;
    }

    public static DialogVarietySelectBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietySelectBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogVarietySelectBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_variety_select, root, attachToRoot, component);
    }

    public static DialogVarietySelectBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietySelectBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogVarietySelectBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_variety_select, null, false, component);
    }

    public static DialogVarietySelectBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietySelectBinding bind(View view, Object component) {
        return (DialogVarietySelectBinding) bind(component, view, R.layout.dialog_variety_select);
    }
}
