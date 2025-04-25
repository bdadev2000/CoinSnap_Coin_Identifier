package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewMeCollectionSummaryMeltPriceBinding extends ViewDataBinding {
    public final AppCompatImageView ivMeltPriceInfo;
    public final AppCompatImageView ivMeltPriceMore;
    public final LinearLayout llMeltPriceContainer;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionSummaryMeltPriceBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivMeltPriceInfo, AppCompatImageView ivMeltPriceMore, LinearLayout llMeltPriceContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivMeltPriceInfo = ivMeltPriceInfo;
        this.ivMeltPriceMore = ivMeltPriceMore;
        this.llMeltPriceContainer = llMeltPriceContainer;
    }

    public static ViewMeCollectionSummaryMeltPriceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryMeltPriceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionSummaryMeltPriceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_melt_price, root, attachToRoot, component);
    }

    public static ViewMeCollectionSummaryMeltPriceBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryMeltPriceBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionSummaryMeltPriceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_melt_price, null, false, component);
    }

    public static ViewMeCollectionSummaryMeltPriceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryMeltPriceBinding bind(View view, Object component) {
        return (ViewMeCollectionSummaryMeltPriceBinding) bind(component, view, R.layout.view_me_collection_summary_melt_price);
    }
}
