package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemAddImageBinding extends ViewDataBinding {
    public final ShapeableImageView iv;
    public final ImageView ivClose1;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemAddImageBinding(Object _bindingComponent, View _root, int _localFieldCount, ShapeableImageView iv, ImageView ivClose1) {
        super(_bindingComponent, _root, _localFieldCount);
        this.iv = iv;
        this.ivClose1 = ivClose1;
    }

    public static ItemAddImageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemAddImageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_image, root, attachToRoot, component);
    }

    public static ItemAddImageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemAddImageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_image, null, false, component);
    }

    public static ItemAddImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBinding bind(View view, Object component) {
        return (ItemAddImageBinding) bind(component, view, R.layout.item_add_image);
    }
}
