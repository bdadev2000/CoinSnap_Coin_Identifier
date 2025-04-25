package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ViewSummaryBestVarietiesPageBinding extends ViewDataBinding {
    public final AppCompatImageView ivCoinCover1;
    public final AppCompatImageView ivCoinCover2;
    public final LinearLayout llVarietyContainer;
    public final AppCompatTextView tvCoinName;
    public final AppCompatTextView tvVarietyTitle;
    public final AppCompatTextView tvVarietyValue;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewSummaryBestVarietiesPageBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivCoinCover1, AppCompatImageView ivCoinCover2, LinearLayout llVarietyContainer, AppCompatTextView tvCoinName, AppCompatTextView tvVarietyTitle, AppCompatTextView tvVarietyValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivCoinCover1 = ivCoinCover1;
        this.ivCoinCover2 = ivCoinCover2;
        this.llVarietyContainer = llVarietyContainer;
        this.tvCoinName = tvCoinName;
        this.tvVarietyTitle = tvVarietyTitle;
        this.tvVarietyValue = tvVarietyValue;
    }

    public static ViewSummaryBestVarietiesPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryBestVarietiesPageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewSummaryBestVarietiesPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_best_varieties_page, root, attachToRoot, component);
    }

    public static ViewSummaryBestVarietiesPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryBestVarietiesPageBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewSummaryBestVarietiesPageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_summary_best_varieties_page, null, false, component);
    }

    public static ViewSummaryBestVarietiesPageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSummaryBestVarietiesPageBinding bind(View view, Object component) {
        return (ViewSummaryBestVarietiesPageBinding) bind(component, view, R.layout.view_summary_best_varieties_page);
    }
}
