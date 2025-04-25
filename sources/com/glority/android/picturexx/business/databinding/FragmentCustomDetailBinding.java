package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.ChatbotView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public abstract class FragmentCustomDetailBinding extends ViewDataBinding {
    public final ItemAddCollectionNoticeBinding addCollectionNoticeLl;
    public final LinearLayout appBarLayout;
    public final AppBarLayout appbar;
    public final FrameLayout bottomBar;
    public final ChatbotView chatbotView;
    public final CmsView cmsView;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final CoordinatorLayout coordinatorLayout;
    public final ImageView ivClose;
    public final ImageView ivClose2;
    public final ImageView ivShare;
    public final ImageView ivShare2;
    public final FrameLayout progressFl;
    public final AppCompatTextView toolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, ItemAddCollectionNoticeBinding addCollectionNoticeLl, LinearLayout appBarLayout, AppBarLayout appbar, FrameLayout bottomBar, ChatbotView chatbotView, CmsView cmsView, CollapsingToolbarLayout collapsingToolbar, CoordinatorLayout coordinatorLayout, ImageView ivClose, ImageView ivClose2, ImageView ivShare, ImageView ivShare2, FrameLayout progressFl, AppCompatTextView toolbarTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addCollectionNoticeLl = addCollectionNoticeLl;
        this.appBarLayout = appBarLayout;
        this.appbar = appbar;
        this.bottomBar = bottomBar;
        this.chatbotView = chatbotView;
        this.cmsView = cmsView;
        this.collapsingToolbar = collapsingToolbar;
        this.coordinatorLayout = coordinatorLayout;
        this.ivClose = ivClose;
        this.ivClose2 = ivClose2;
        this.ivShare = ivShare;
        this.ivShare2 = ivShare2;
        this.progressFl = progressFl;
        this.toolbarTitle = toolbarTitle;
    }

    public static FragmentCustomDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_detail, root, attachToRoot, component);
    }

    public static FragmentCustomDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_detail, null, false, component);
    }

    public static FragmentCustomDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomDetailBinding bind(View view, Object component) {
        return (FragmentCustomDetailBinding) bind(component, view, R.layout.fragment_custom_detail);
    }
}
