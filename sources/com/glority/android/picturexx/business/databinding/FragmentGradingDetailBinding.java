package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.ChatbotView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public abstract class FragmentGradingDetailBinding extends ViewDataBinding {
    public final LinearLayout appBarLayout;
    public final AppBarLayout appbar;
    public final CmsDetailBottomBar3Binding bottomBar;
    public final ChatbotView chatbotView;
    public final ConstraintLayout clNameContainer;
    public final CmsView cmsView;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final CoordinatorLayout coordinatorLayout;
    public final AppCompatImageView headerIv;
    public final ImageView ivClose;
    public final ImageView ivClose2;
    public final AppCompatImageView ivNameArrow;
    public final LinearLayout llGradingMask;
    public final AppCompatTextView toolbarTitle;
    public final AppCompatTextView tvCmsGradingReport;
    public final AppCompatTextView tvName;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGradingDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout appBarLayout, AppBarLayout appbar, CmsDetailBottomBar3Binding bottomBar, ChatbotView chatbotView, ConstraintLayout clNameContainer, CmsView cmsView, CollapsingToolbarLayout collapsingToolbar, CoordinatorLayout coordinatorLayout, AppCompatImageView headerIv, ImageView ivClose, ImageView ivClose2, AppCompatImageView ivNameArrow, LinearLayout llGradingMask, AppCompatTextView toolbarTitle, AppCompatTextView tvCmsGradingReport, AppCompatTextView tvName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appBarLayout = appBarLayout;
        this.appbar = appbar;
        this.bottomBar = bottomBar;
        this.chatbotView = chatbotView;
        this.clNameContainer = clNameContainer;
        this.cmsView = cmsView;
        this.collapsingToolbar = collapsingToolbar;
        this.coordinatorLayout = coordinatorLayout;
        this.headerIv = headerIv;
        this.ivClose = ivClose;
        this.ivClose2 = ivClose2;
        this.ivNameArrow = ivNameArrow;
        this.llGradingMask = llGradingMask;
        this.toolbarTitle = toolbarTitle;
        this.tvCmsGradingReport = tvCmsGradingReport;
        this.tvName = tvName;
    }

    public static FragmentGradingDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentGradingDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_grading_detail, root, attachToRoot, component);
    }

    public static FragmentGradingDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentGradingDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_grading_detail, null, false, component);
    }

    public static FragmentGradingDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGradingDetailBinding bind(View view, Object component) {
        return (FragmentGradingDetailBinding) bind(component, view, R.layout.fragment_grading_detail);
    }
}
