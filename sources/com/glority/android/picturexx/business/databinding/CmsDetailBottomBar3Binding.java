package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class CmsDetailBottomBar3Binding extends ViewDataBinding {
    public final MaterialButton addBt;
    public final LinearLayout llBottom;
    public final ImageView newIv;
    public final ImageView shareIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public CmsDetailBottomBar3Binding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton addBt, LinearLayout llBottom, ImageView newIv, ImageView shareIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addBt = addBt;
        this.llBottom = llBottom;
        this.newIv = newIv;
        this.shareIv = shareIv;
    }

    public static CmsDetailBottomBar3Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar3Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CmsDetailBottomBar3Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar3, root, attachToRoot, component);
    }

    public static CmsDetailBottomBar3Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar3Binding inflate(LayoutInflater inflater, Object component) {
        return (CmsDetailBottomBar3Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar3, null, false, component);
    }

    public static CmsDetailBottomBar3Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar3Binding bind(View view, Object component) {
        return (CmsDetailBottomBar3Binding) bind(component, view, R.layout.cms_detail_bottom_bar3);
    }
}
