package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes5.dex */
public abstract class ItemMultiCaptureSmallImageBinding extends ViewDataBinding {
    public final ImageView ivMultiCaptureDelete;
    public final ShapeableImageView ivMultiCaptureImage;
    public final GlTextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMultiCaptureSmallImageBinding(Object obj, View view, int i, ImageView imageView, ShapeableImageView shapeableImageView, GlTextView glTextView) {
        super(obj, view, i);
        this.ivMultiCaptureDelete = imageView;
        this.ivMultiCaptureImage = shapeableImageView;
        this.tvTitle = glTextView;
    }

    public static ItemMultiCaptureSmallImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMultiCaptureSmallImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemMultiCaptureSmallImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_multi_capture_small_image, viewGroup, z, obj);
    }

    public static ItemMultiCaptureSmallImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMultiCaptureSmallImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemMultiCaptureSmallImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_multi_capture_small_image, null, false, obj);
    }

    public static ItemMultiCaptureSmallImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMultiCaptureSmallImageBinding bind(View view, Object obj) {
        return (ItemMultiCaptureSmallImageBinding) bind(obj, view, R.layout.item_multi_capture_small_image);
    }
}
