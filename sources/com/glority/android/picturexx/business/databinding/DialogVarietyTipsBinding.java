package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.wheelpicker.GlWheelPickerView;

/* loaded from: classes2.dex */
public abstract class DialogVarietyTipsBinding extends ViewDataBinding {
    public final ImageView ivTips;
    public final TextView tvCancel;
    public final TextView tvDone;
    public final GlWheelPickerView wheel1;
    public final GlWheelPickerView wheel2;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogVarietyTipsBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivTips, TextView tvCancel, TextView tvDone, GlWheelPickerView wheel1, GlWheelPickerView wheel2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivTips = ivTips;
        this.tvCancel = tvCancel;
        this.tvDone = tvDone;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
    }

    public static DialogVarietyTipsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietyTipsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogVarietyTipsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_variety_tips, root, attachToRoot, component);
    }

    public static DialogVarietyTipsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietyTipsBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogVarietyTipsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_variety_tips, null, false, component);
    }

    public static DialogVarietyTipsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogVarietyTipsBinding bind(View view, Object component) {
        return (DialogVarietyTipsBinding) bind(component, view, R.layout.dialog_variety_tips);
    }
}
