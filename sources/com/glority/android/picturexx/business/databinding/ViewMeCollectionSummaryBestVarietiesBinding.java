package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewMeCollectionSummaryBestVarietiesBinding extends ViewDataBinding {
    public final AppCompatImageView ivIndicator1;
    public final AppCompatImageView ivIndicator2;
    public final AppCompatImageView ivIndicator3;
    public final AppCompatImageView ivMore;
    public final ViewPager2 pager2;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewMeCollectionSummaryBestVarietiesBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivIndicator1, AppCompatImageView ivIndicator2, AppCompatImageView ivIndicator3, AppCompatImageView ivMore, ViewPager2 pager2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivIndicator1 = ivIndicator1;
        this.ivIndicator2 = ivIndicator2;
        this.ivIndicator3 = ivIndicator3;
        this.ivMore = ivMore;
        this.pager2 = pager2;
    }

    public static ViewMeCollectionSummaryBestVarietiesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestVarietiesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewMeCollectionSummaryBestVarietiesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_best_varieties, root, attachToRoot, component);
    }

    public static ViewMeCollectionSummaryBestVarietiesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestVarietiesBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewMeCollectionSummaryBestVarietiesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_me_collection_summary_best_varieties, null, false, component);
    }

    public static ViewMeCollectionSummaryBestVarietiesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewMeCollectionSummaryBestVarietiesBinding bind(View view, Object component) {
        return (ViewMeCollectionSummaryBestVarietiesBinding) bind(component, view, R.layout.view_me_collection_summary_best_varieties);
    }
}
