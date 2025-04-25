package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;
import com.glority.widget.imagepager.GlImagePager;

/* loaded from: classes6.dex */
public abstract class ActivityImageViewerBinding extends ViewDataBinding {
    public final GlImagePager imagePager;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityImageViewerBinding(Object obj, View view, int i, GlImagePager glImagePager) {
        super(obj, view, i);
        this.imagePager = glImagePager;
    }

    public static ActivityImageViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImageViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityImageViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_image_viewer, viewGroup, z, obj);
    }

    public static ActivityImageViewerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImageViewerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityImageViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_image_viewer, null, false, obj);
    }

    public static ActivityImageViewerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImageViewerBinding bind(View view, Object obj) {
        return (ActivityImageViewerBinding) bind(obj, view, R.layout.activity_image_viewer);
    }
}
