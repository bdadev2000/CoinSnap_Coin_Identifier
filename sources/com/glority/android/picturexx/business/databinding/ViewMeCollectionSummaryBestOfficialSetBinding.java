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
public abstract class ViewMeCollectionSummaryBestOfficialSetBinding extends ViewDataBinding {
    public final AppCompatImageView ivMore;
    public final LayoutOfficialSetProgressBaseViewBinding officialSetProgressView;
    public final AppCompatTextView tvCheckAllOfficialSet;
    public final AppCompatTextView tvSetPercentageSummary;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionSummaryBestOfficialSetBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivMore, LayoutOfficialSetProgressBaseViewBinding officialSetProgressView, AppCompatTextView tvCheckAllOfficialSet, AppCompatTextView tvSetPercentageSummary) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivMore = ivMore;
        this.officialSetProgressView = officialSetProgressView;
        this.tvCheckAllOfficialSet = tvCheckAllOfficialSet;
        this.tvSetPercentageSummary = tvSetPercentageSummary;
    }

    public static ViewMeCollectionSummaryBestOfficialSetBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestOfficialSetBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionSummaryBestOfficialSetBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_best_official_set, root, attachToRoot, component);
    }

    public static ViewMeCollectionSummaryBestOfficialSetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestOfficialSetBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionSummaryBestOfficialSetBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_best_official_set, null, false, component);
    }

    public static ViewMeCollectionSummaryBestOfficialSetBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestOfficialSetBinding bind(View view, Object component) {
        return (ViewMeCollectionSummaryBestOfficialSetBinding) bind(component, view, R.layout.view_me_collection_summary_best_official_set);
    }
}
