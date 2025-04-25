package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public abstract class FragmentCollectDetailBinding extends ViewDataBinding {
    public final LinearLayout appBarLayout;
    public final AppBarLayout appbar;
    public final FrameLayout bottomBar;
    public final CmsView cmsView;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final CoordinatorLayout coordinatorLayout;
    public final ImageView headerIv;
    public final AppCompatImageView ivClose;
    public final ImageView ivClose2;
    public final ImageView ivShare;
    public final ImageView ivShare2;
    public final FrameLayout progressFl;
    public final AppCompatTextView toolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCollectDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout appBarLayout, AppBarLayout appbar, FrameLayout bottomBar, CmsView cmsView, CollapsingToolbarLayout collapsingToolbar, CoordinatorLayout coordinatorLayout, ImageView headerIv, AppCompatImageView ivClose, ImageView ivClose2, ImageView ivShare, ImageView ivShare2, FrameLayout progressFl, AppCompatTextView toolbarTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appBarLayout = appBarLayout;
        this.appbar = appbar;
        this.bottomBar = bottomBar;
        this.cmsView = cmsView;
        this.collapsingToolbar = collapsingToolbar;
        this.coordinatorLayout = coordinatorLayout;
        this.headerIv = headerIv;
        this.ivClose = ivClose;
        this.ivClose2 = ivClose2;
        this.ivShare = ivShare;
        this.ivShare2 = ivShare2;
        this.progressFl = progressFl;
        this.toolbarTitle = toolbarTitle;
    }

    public static FragmentCollectDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCollectDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collect_detail, root, attachToRoot, component);
    }

    public static FragmentCollectDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCollectDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collect_detail, null, false, component);
    }

    public static FragmentCollectDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectDetailBinding bind(View view, Object component) {
        return (FragmentCollectDetailBinding) bind(component, view, R.layout.fragment_collect_detail);
    }
}
