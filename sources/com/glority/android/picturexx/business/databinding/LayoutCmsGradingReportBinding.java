package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutCmsGradingReportBinding extends ViewDataBinding {
    public final AppCompatImageView ivCmsGradingReportCopy;
    public final AppCompatImageView ivCmsGradingReportHelpful;
    public final AppCompatImageView ivCmsGradingReportUnhelpful;
    public final LottieAnimationView lottieAnimCmsGradingReport;
    public final AppCompatTextView tvCmsGradingReport;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutCmsGradingReportBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatImageView ivCmsGradingReportCopy, AppCompatImageView ivCmsGradingReportHelpful, AppCompatImageView ivCmsGradingReportUnhelpful, LottieAnimationView lottieAnimCmsGradingReport, AppCompatTextView tvCmsGradingReport) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivCmsGradingReportCopy = ivCmsGradingReportCopy;
        this.ivCmsGradingReportHelpful = ivCmsGradingReportHelpful;
        this.ivCmsGradingReportUnhelpful = ivCmsGradingReportUnhelpful;
        this.lottieAnimCmsGradingReport = lottieAnimCmsGradingReport;
        this.tvCmsGradingReport = tvCmsGradingReport;
    }

    public static LayoutCmsGradingReportBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCmsGradingReportBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutCmsGradingReportBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_cms_grading_report, root, attachToRoot, component);
    }

    public static LayoutCmsGradingReportBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCmsGradingReportBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutCmsGradingReportBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_cms_grading_report, null, false, component);
    }

    public static LayoutCmsGradingReportBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutCmsGradingReportBinding bind(View view, Object component) {
        return (LayoutCmsGradingReportBinding) bind(component, view, R.layout.layout_cms_grading_report);
    }
}
