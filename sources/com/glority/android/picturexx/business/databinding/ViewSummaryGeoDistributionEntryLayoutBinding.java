package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewSummaryGeoDistributionEntryLayoutBinding extends ViewDataBinding {
    public final AppCompatImageView ivGeoDistributionCountryFlag;
    public final AppCompatTextView tvGeoDistributionCoinCount;
    public final AppCompatTextView tvGeoDistributionCountryName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewSummaryGeoDistributionEntryLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivGeoDistributionCountryFlag, AppCompatTextView tvGeoDistributionCoinCount, AppCompatTextView tvGeoDistributionCountryName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivGeoDistributionCountryFlag = ivGeoDistributionCountryFlag;
        this.tvGeoDistributionCoinCount = tvGeoDistributionCoinCount;
        this.tvGeoDistributionCountryName = tvGeoDistributionCountryName;
    }

    public static ViewSummaryGeoDistributionEntryLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryGeoDistributionEntryLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewSummaryGeoDistributionEntryLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_geo_distribution_entry_layout, root, attachToRoot, component);
    }

    public static ViewSummaryGeoDistributionEntryLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryGeoDistributionEntryLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewSummaryGeoDistributionEntryLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_geo_distribution_entry_layout, null, false, component);
    }

    public static ViewSummaryGeoDistributionEntryLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryGeoDistributionEntryLayoutBinding bind(View view, Object component) {
        return (ViewSummaryGeoDistributionEntryLayoutBinding) bind(component, view, R.layout.view_summary_geo_distribution_entry_layout);
    }
}
