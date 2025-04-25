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
public abstract class ItemMeHistoryBinding extends ViewDataBinding {
    public final MaterialTextView gradeTv;
    public final FrameLayout ivMeCollectionMore;
    public final ShapeableImageView ivMeCollectionPicture;
    public final GlTextView tvMeCollectionName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialTextView gradeTv, FrameLayout ivMeCollectionMore, ShapeableImageView ivMeCollectionPicture, GlTextView tvMeCollectionName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gradeTv = gradeTv;
        this.ivMeCollectionMore = ivMeCollectionMore;
        this.ivMeCollectionPicture = ivMeCollectionPicture;
        this.tvMeCollectionName = tvMeCollectionName;
    }

    public static ItemMeHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeHistoryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_history, root, attachToRoot, component);
    }

    public static ItemMeHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeHistoryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_history, null, false, component);
    }

    public static ItemMeHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeHistoryBinding bind(View view, Object component) {
        return (ItemMeHistoryBinding) bind(component, view, R.layout.item_me_history);
    }
}
