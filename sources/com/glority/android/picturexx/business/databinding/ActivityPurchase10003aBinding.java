package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.base.widget.AutoPollRecyclerView;
import com.glority.widget.GlTextView;
import com.glority.widget.purchase.policy.GlPolicyView1;
import com.glority.widget.purchase.purchase.GlPurchaseView3;

/* loaded from: classes2.dex */
public abstract class ActivityPurchase10003aBinding extends ViewDataBinding {
    public final GlPolicyView1 gpv1;
    public final GlPurchaseView3 gpv3;
    public final AutoPollRecyclerView rv;
    public final ScrollView sv;
    public final GlTextView titleTv;
    public final TextView tvCancel;
    public final TextView tvRestore;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityPurchase10003aBinding(Object _bindingComponent, View _root, int _localFieldCount, GlPolicyView1 gpv1, GlPurchaseView3 gpv3, AutoPollRecyclerView rv, ScrollView sv, GlTextView titleTv, TextView tvCancel, TextView tvRestore) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gpv1 = gpv1;
        this.gpv3 = gpv3;
        this.rv = rv;
        this.sv = sv;
        this.titleTv = titleTv;
        this.tvCancel = tvCancel;
        this.tvRestore = tvRestore;
    }

    public static ActivityPurchase10003aBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10003aBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPurchase10003aBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10003a, root, attachToRoot, component);
    }

    public static ActivityPurchase10003aBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10003aBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPurchase10003aBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10003a, null, false, component);
    }

    public static ActivityPurchase10003aBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10003aBinding bind(View view, Object component) {
        return (ActivityPurchase10003aBinding) bind(component, view, R.layout.activity_purchase_10003a);
    }
}
