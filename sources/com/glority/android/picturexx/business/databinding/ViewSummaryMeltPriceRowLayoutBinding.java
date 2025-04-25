package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.picturecoin.generatedAPI.kotlinAPI.enums.MetalType;

/* loaded from: classes2.dex */
public abstract class ViewSummaryMeltPriceRowLayoutBinding extends ViewDataBinding {

    @Bindable
    protected MetalType mMetalType;
    public final AppCompatTextView tvMeltPrice;
    public final AppCompatTextView tvMeltWeight;

    public abstract void setMetalType(MetalType metalType);

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewSummaryMeltPriceRowLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatTextView tvMeltPrice, AppCompatTextView tvMeltWeight) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tvMeltPrice = tvMeltPrice;
        this.tvMeltWeight = tvMeltWeight;
    }

    public MetalType getMetalType() {
        return this.mMetalType;
    }

    public static ViewSummaryMeltPriceRowLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryMeltPriceRowLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewSummaryMeltPriceRowLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_melt_price_row_layout, root, attachToRoot, component);
    }

    public static ViewSummaryMeltPriceRowLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryMeltPriceRowLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewSummaryMeltPriceRowLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_melt_price_row_layout, null, false, component);
    }

    public static ViewSummaryMeltPriceRowLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryMeltPriceRowLayoutBinding bind(View view, Object component) {
        return (ViewSummaryMeltPriceRowLayoutBinding) bind(component, view, R.layout.view_summary_melt_price_row_layout);
    }
}
