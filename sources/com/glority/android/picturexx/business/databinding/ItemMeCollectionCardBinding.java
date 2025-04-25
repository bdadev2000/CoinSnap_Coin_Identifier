package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemMeCollectionCardBinding extends ViewDataBinding {
    public final AppCompatTextView gradeTv;
    public final AppCompatImageView ivMeCollectionCoinHeader;
    public final AppCompatImageView ivMeCollectionCoinToe;
    public final FrameLayout ivMeCollectionMore;
    public final LinearLayout ivMeCollectionPicture;
    public final LinearLayout llGradeInfoContainer;
    public final TextView numTv;
    public final AppCompatTextView priceTv;
    public final AppCompatTextView tvMeCollectionName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeCollectionCardBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatTextView gradeTv, AppCompatImageView ivMeCollectionCoinHeader, AppCompatImageView ivMeCollectionCoinToe, FrameLayout ivMeCollectionMore, LinearLayout ivMeCollectionPicture, LinearLayout llGradeInfoContainer, TextView numTv, AppCompatTextView priceTv, AppCompatTextView tvMeCollectionName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gradeTv = gradeTv;
        this.ivMeCollectionCoinHeader = ivMeCollectionCoinHeader;
        this.ivMeCollectionCoinToe = ivMeCollectionCoinToe;
        this.ivMeCollectionMore = ivMeCollectionMore;
        this.ivMeCollectionPicture = ivMeCollectionPicture;
        this.llGradeInfoContainer = llGradeInfoContainer;
        this.numTv = numTv;
        this.priceTv = priceTv;
        this.tvMeCollectionName = tvMeCollectionName;
    }

    public static ItemMeCollectionCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeCollectionCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_card, root, attachToRoot, component);
    }

    public static ItemMeCollectionCardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionCardBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeCollectionCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_card, null, false, component);
    }

    public static ItemMeCollectionCardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionCardBinding bind(View view, Object component) {
        return (ItemMeCollectionCardBinding) bind(component, view, R.layout.item_me_collection_card);
    }
}
