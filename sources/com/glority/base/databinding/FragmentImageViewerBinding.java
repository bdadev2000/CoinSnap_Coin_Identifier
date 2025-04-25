package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;
import com.glority.base.widget.NPImageZoomViewPager;

/* loaded from: classes6.dex */
public abstract class FragmentImageViewerBinding extends ViewDataBinding {
    public final NPImageZoomViewPager viewPager;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentImageViewerBinding(Object obj, View view, int i, NPImageZoomViewPager nPImageZoomViewPager) {
        super(obj, view, i);
        this.viewPager = nPImageZoomViewPager;
    }

    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentImageViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_image_viewer, viewGroup, z, obj);
    }

    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentImageViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_image_viewer, null, false, obj);
    }

    public static FragmentImageViewerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentImageViewerBinding bind(View view, Object obj) {
        return (FragmentImageViewerBinding) bind(obj, view, R.layout.fragment_image_viewer);
    }
}
