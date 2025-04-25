package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class LayoutSummaryCardBinding extends ViewDataBinding {
    public final GlTextView counrtyTv;
    public final GlTextView countLabelTv;
    public final GlTextView countTv;
    public final GlTextView countryLabelTv;
    public final GlTextView priceLabelTv;
    public final GlTextView priceTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutSummaryCardBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView counrtyTv, GlTextView countLabelTv, GlTextView countTv, GlTextView countryLabelTv, GlTextView priceLabelTv, GlTextView priceTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.counrtyTv = counrtyTv;
        this.countLabelTv = countLabelTv;
        this.countTv = countTv;
        this.countryLabelTv = countryLabelTv;
        this.priceLabelTv = priceLabelTv;
        this.priceTv = priceTv;
    }

    public static LayoutSummaryCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummaryCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutSummaryCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_summary_card, root, attachToRoot, component);
    }

    public static LayoutSummaryCardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummaryCardBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutSummaryCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_summary_card, null, false, component);
    }

    public static LayoutSummaryCardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSummaryCardBinding bind(View view, Object component) {
        return (LayoutSummaryCardBinding) bind(component, view, R.layout.layout_summary_card);
    }
}
