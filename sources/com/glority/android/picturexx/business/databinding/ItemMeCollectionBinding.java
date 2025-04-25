package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemMeCollectionBinding extends ViewDataBinding {
    public final TextView gradeTv;
    public final FrameLayout ivMeCollectionMore;
    public final ShapeableImageView ivMeCollectionPicture;
    public final TextView numTv;
    public final TextView timeTv;
    public final GlTextView tvMeCollectionName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeCollectionBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView gradeTv, FrameLayout ivMeCollectionMore, ShapeableImageView ivMeCollectionPicture, TextView numTv, TextView timeTv, GlTextView tvMeCollectionName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gradeTv = gradeTv;
        this.ivMeCollectionMore = ivMeCollectionMore;
        this.ivMeCollectionPicture = ivMeCollectionPicture;
        this.numTv = numTv;
        this.timeTv = timeTv;
        this.tvMeCollectionName = tvMeCollectionName;
    }

    public static ItemMeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection, root, attachToRoot, component);
    }

    public static ItemMeCollectionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection, null, false, component);
    }

    public static ItemMeCollectionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionBinding bind(View view, Object component) {
        return (ItemMeCollectionBinding) bind(component, view, R.layout.item_me_collection);
    }
}
