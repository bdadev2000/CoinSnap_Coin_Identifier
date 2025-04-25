package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class CmsDetailBottomBar2Binding extends ViewDataBinding {
    public final LinearLayout llBottom;
    public final ImageView newIv;
    public final ImageView shareIv;
    public final ImageView wishIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public CmsDetailBottomBar2Binding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout llBottom, ImageView newIv, ImageView shareIv, ImageView wishIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.llBottom = llBottom;
        this.newIv = newIv;
        this.shareIv = shareIv;
        this.wishIv = wishIv;
    }

    public static CmsDetailBottomBar2Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar2Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CmsDetailBottomBar2Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar2, root, attachToRoot, component);
    }

    public static CmsDetailBottomBar2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar2Binding inflate(LayoutInflater inflater, Object component) {
        return (CmsDetailBottomBar2Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar2, null, false, component);
    }

    public static CmsDetailBottomBar2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar2Binding bind(View view, Object component) {
        return (CmsDetailBottomBar2Binding) bind(component, view, R.layout.cms_detail_bottom_bar2);
    }
}
