package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ActivityBanknoteCongratsBinding extends ViewDataBinding {
    public final TextView claimTv;
    public final GlTextView contentTv;
    public final TextView notInterestedTv;
    public final ScrollView sv;
    public final ImageView tvCancel;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityBanknoteCongratsBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView claimTv, GlTextView contentTv, TextView notInterestedTv, ScrollView sv, ImageView tvCancel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.claimTv = claimTv;
        this.contentTv = contentTv;
        this.notInterestedTv = notInterestedTv;
        this.sv = sv;
        this.tvCancel = tvCancel;
    }

    public static ActivityBanknoteCongratsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBanknoteCongratsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityBanknoteCongratsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_banknote_congrats, root, attachToRoot, component);
    }

    public static ActivityBanknoteCongratsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBanknoteCongratsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityBanknoteCongratsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_banknote_congrats, null, false, component);
    }

    public static ActivityBanknoteCongratsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBanknoteCongratsBinding bind(View view, Object component) {
        return (ActivityBanknoteCongratsBinding) bind(component, view, R.layout.activity_banknote_congrats);
    }
}
