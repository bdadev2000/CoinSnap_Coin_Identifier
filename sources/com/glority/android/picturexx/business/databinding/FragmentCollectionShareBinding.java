package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class FragmentCollectionShareBinding extends ViewDataBinding {
    public final LinearLayout acquisitionLl;
    public final CardView cardView;
    public final FrameLayout imageContainer;
    public final GlTextView ivEdit;
    public final FrameLayout llCost;
    public final FrameLayout llDateAcquired;
    public final LinearLayout llDownload;
    public final LinearLayout llShare;
    public final FrameLayout llYear;
    public final ViewPager2 mainImageVp;
    public final FrameLayout mintmarkYear;
    public final LinearLayout noteLl;
    public final GlTextView noteTv;
    public final TextView pagerIndex;
    public final GlTextView tvCost;
    public final GlTextView tvDate;
    public final GlTextView tvGrade;
    public final GlTextView tvMintmark;
    public final TextView tvName;
    public final GlTextView tvYear;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCollectionShareBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout acquisitionLl, CardView cardView, FrameLayout imageContainer, GlTextView ivEdit, FrameLayout llCost, FrameLayout llDateAcquired, LinearLayout llDownload, LinearLayout llShare, FrameLayout llYear, ViewPager2 mainImageVp, FrameLayout mintmarkYear, LinearLayout noteLl, GlTextView noteTv, TextView pagerIndex, GlTextView tvCost, GlTextView tvDate, GlTextView tvGrade, GlTextView tvMintmark, TextView tvName, GlTextView tvYear) {
        super(_bindingComponent, _root, _localFieldCount);
        this.acquisitionLl = acquisitionLl;
        this.cardView = cardView;
        this.imageContainer = imageContainer;
        this.ivEdit = ivEdit;
        this.llCost = llCost;
        this.llDateAcquired = llDateAcquired;
        this.llDownload = llDownload;
        this.llShare = llShare;
        this.llYear = llYear;
        this.mainImageVp = mainImageVp;
        this.mintmarkYear = mintmarkYear;
        this.noteLl = noteLl;
        this.noteTv = noteTv;
        this.pagerIndex = pagerIndex;
        this.tvCost = tvCost;
        this.tvDate = tvDate;
        this.tvGrade = tvGrade;
        this.tvMintmark = tvMintmark;
        this.tvName = tvName;
        this.tvYear = tvYear;
    }

    public static FragmentCollectionShareBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionShareBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCollectionShareBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_share, root, attachToRoot, component);
    }

    public static FragmentCollectionShareBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionShareBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCollectionShareBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_collection_share, null, false, component);
    }

    public static FragmentCollectionShareBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCollectionShareBinding bind(View view, Object component) {
        return (FragmentCollectionShareBinding) bind(component, view, R.layout.fragment_collection_share);
    }
}
