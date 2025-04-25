package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ActivityPurchase1Binding extends ViewDataBinding {
    public final AppCompatButton continueTv;
    public final GlTextView countTv;
    public final GlTextView dayTv;
    public final GlTextView giveUpTv;
    public final TextView policyTv;
    public final ScrollView sv;
    public final GlTextView yearTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityPurchase1Binding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatButton continueTv, GlTextView countTv, GlTextView dayTv, GlTextView giveUpTv, TextView policyTv, ScrollView sv, GlTextView yearTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.continueTv = continueTv;
        this.countTv = countTv;
        this.dayTv = dayTv;
        this.giveUpTv = giveUpTv;
        this.policyTv = policyTv;
        this.sv = sv;
        this.yearTv = yearTv;
    }

    public static ActivityPurchase1Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase1Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPurchase1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase1, root, attachToRoot, component);
    }

    public static ActivityPurchase1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase1Binding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPurchase1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase1, null, false, component);
    }

    public static ActivityPurchase1Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase1Binding bind(View view, Object component) {
        return (ActivityPurchase1Binding) bind(component, view, R.layout.activity_purchase1);
    }
}
