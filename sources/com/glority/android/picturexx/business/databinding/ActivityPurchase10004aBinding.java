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
import com.glority.widget.purchase.policy.GlPolicyView1;
import com.glority.widget.purchase.purchase.GlPurchaseView3;

/* loaded from: classes2.dex */
public abstract class ActivityPurchase10004aBinding extends ViewDataBinding {
    public final GlTextView contentTv;
    public final GlPolicyView1 gpv1;
    public final GlPurchaseView3 gpv3;
    public final ScrollView sv;
    public final ImageView tvCancel;
    public final TextView tvRestore;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityPurchase10004aBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView contentTv, GlPolicyView1 gpv1, GlPurchaseView3 gpv3, ScrollView sv, ImageView tvCancel, TextView tvRestore) {
        super(_bindingComponent, _root, _localFieldCount);
        this.contentTv = contentTv;
        this.gpv1 = gpv1;
        this.gpv3 = gpv3;
        this.sv = sv;
        this.tvCancel = tvCancel;
        this.tvRestore = tvRestore;
    }

    public static ActivityPurchase10004aBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10004aBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPurchase10004aBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10004a, root, attachToRoot, component);
    }

    public static ActivityPurchase10004aBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10004aBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPurchase10004aBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10004a, null, false, component);
    }

    public static ActivityPurchase10004aBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10004aBinding bind(View view, Object component) {
        return (ActivityPurchase10004aBinding) bind(component, view, R.layout.activity_purchase_10004a);
    }
}
