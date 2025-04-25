package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogTrailPruchaseBinding extends ViewDataBinding {
    public final TextView textTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogTrailPruchaseBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView textTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.textTv = textTv;
    }

    public static DialogTrailPruchaseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogTrailPruchaseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogTrailPruchaseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_trail_pruchase, root, attachToRoot, component);
    }

    public static DialogTrailPruchaseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogTrailPruchaseBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogTrailPruchaseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_trail_pruchase, null, false, component);
    }

    public static DialogTrailPruchaseBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogTrailPruchaseBinding bind(View view, Object component) {
        return (DialogTrailPruchaseBinding) bind(component, view, R.layout.dialog_trail_pruchase);
    }
}
