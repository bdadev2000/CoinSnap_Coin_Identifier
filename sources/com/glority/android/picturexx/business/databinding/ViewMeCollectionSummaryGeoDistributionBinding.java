package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewMeCollectionSummaryGeoDistributionBinding extends ViewDataBinding {
    public final ConstraintLayout clMapContainer;
    public final AppCompatImageView ivMore;
    public final LinearLayout llGeoDistributionContainer;
    public final AppCompatImageView map;
    public final AppCompatImageView mapZoom;
    public final AppCompatTextView tvGeoDistributionSummary;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionSummaryGeoDistributionBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clMapContainer, AppCompatImageView ivMore, LinearLayout llGeoDistributionContainer, AppCompatImageView map, AppCompatImageView mapZoom, AppCompatTextView tvGeoDistributionSummary) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clMapContainer = clMapContainer;
        this.ivMore = ivMore;
        this.llGeoDistributionContainer = llGeoDistributionContainer;
        this.map = map;
        this.mapZoom = mapZoom;
        this.tvGeoDistributionSummary = tvGeoDistributionSummary;
    }

    public static ViewMeCollectionSummaryGeoDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryGeoDistributionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionSummaryGeoDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_geo_distribution, root, attachToRoot, component);
    }

    public static ViewMeCollectionSummaryGeoDistributionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryGeoDistributionBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionSummaryGeoDistributionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_geo_distribution, null, false, component);
    }

    public static ViewMeCollectionSummaryGeoDistributionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryGeoDistributionBinding bind(View view, Object component) {
        return (ViewMeCollectionSummaryGeoDistributionBinding) bind(component, view, R.layout.view_me_collection_summary_geo_distribution);
    }
}
