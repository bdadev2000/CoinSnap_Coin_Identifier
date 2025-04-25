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

/* loaded from: classes2.dex */
public abstract class ActivityPurchase10002bBinding extends ViewDataBinding {
    public final GlPolicyView1 gpv1;
    public final GlTextView infoTv;
    public final GlTextView priceTv;
    public final TextView purchaseTv;
    public final AutoPollRecyclerView rv;
    public final ScrollView sv;
    public final GlTextView titleTv;
    public final TextView tvCancel;
    public final TextView tvRestore;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityPurchase10002bBinding(Object _bindingComponent, View _root, int _localFieldCount, GlPolicyView1 gpv1, GlTextView infoTv, GlTextView priceTv, TextView purchaseTv, AutoPollRecyclerView rv, ScrollView sv, GlTextView titleTv, TextView tvCancel, TextView tvRestore) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gpv1 = gpv1;
        this.infoTv = infoTv;
        this.priceTv = priceTv;
        this.purchaseTv = purchaseTv;
        this.rv = rv;
        this.sv = sv;
        this.titleTv = titleTv;
        this.tvCancel = tvCancel;
        this.tvRestore = tvRestore;
    }

    public static ActivityPurchase10002bBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10002bBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPurchase10002bBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10002b, root, attachToRoot, component);
    }

    public static ActivityPurchase10002bBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10002bBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPurchase10002bBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_purchase_10002b, null, false, component);
    }

    public static ActivityPurchase10002bBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPurchase10002bBinding bind(View view, Object component) {
        return (ActivityPurchase10002bBinding) bind(component, view, R.layout.activity_purchase_10002b);
    }
}
