package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class FragmentCustomSearchDetailBinding extends ViewDataBinding {
    public final LinearLayout appBarLayout;
    public final FrameLayout bottomBar;
    public final CmsView cmsView;
    public final ImageView ivClose;
    public final ImageView ivClose2;
    public final ImageView ivShare;
    public final ImageView ivShare2;
    public final FrameLayout progressFl;
    public final AppCompatTextView toolbarTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomSearchDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout appBarLayout, FrameLayout bottomBar, CmsView cmsView, ImageView ivClose, ImageView ivClose2, ImageView ivShare, ImageView ivShare2, FrameLayout progressFl, AppCompatTextView toolbarTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.appBarLayout = appBarLayout;
        this.bottomBar = bottomBar;
        this.cmsView = cmsView;
        this.ivClose = ivClose;
        this.ivClose2 = ivClose2;
        this.ivShare = ivShare;
        this.ivShare2 = ivShare2;
        this.progressFl = progressFl;
        this.toolbarTitle = toolbarTitle;
    }

    public static FragmentCustomSearchDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomSearchDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_search_detail, root, attachToRoot, component);
    }

    public static FragmentCustomSearchDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomSearchDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_search_detail, null, false, component);
    }

    public static FragmentCustomSearchDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomSearchDetailBinding bind(View view, Object component) {
        return (FragmentCustomSearchDetailBinding) bind(component, view, R.layout.fragment_custom_search_detail);
    }
}
