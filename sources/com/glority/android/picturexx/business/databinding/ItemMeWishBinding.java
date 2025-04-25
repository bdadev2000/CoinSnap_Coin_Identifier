package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public abstract class ItemMeWishBinding extends ViewDataBinding {
    public final FrameLayout ivMeCollectionMore;
    public final ShapeableImageView ivMeCollectionPicture;
    public final MaterialTextView timeTv;
    public final GlTextView tvMeCollectionName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeWishBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout ivMeCollectionMore, ShapeableImageView ivMeCollectionPicture, MaterialTextView timeTv, GlTextView tvMeCollectionName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivMeCollectionMore = ivMeCollectionMore;
        this.ivMeCollectionPicture = ivMeCollectionPicture;
        this.timeTv = timeTv;
        this.tvMeCollectionName = tvMeCollectionName;
    }

    public static ItemMeWishBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeWishBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_wish, root, attachToRoot, component);
    }

    public static ItemMeWishBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeWishBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_wish, null, false, component);
    }

    public static ItemMeWishBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishBinding bind(View view, Object component) {
        return (ItemMeWishBinding) bind(component, view, R.layout.item_me_wish);
    }
}
