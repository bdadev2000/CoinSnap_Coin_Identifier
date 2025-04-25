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
public abstract class CmsDetailBottomBar1Binding extends ViewDataBinding {
    public final MaterialButton addBt;
    public final LinearLayout llBottom;
    public final ImageView newIv;
    public final ImageView wishIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public CmsDetailBottomBar1Binding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton addBt, LinearLayout llBottom, ImageView newIv, ImageView wishIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addBt = addBt;
        this.llBottom = llBottom;
        this.newIv = newIv;
        this.wishIv = wishIv;
    }

    public static CmsDetailBottomBar1Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar1Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CmsDetailBottomBar1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar1, root, attachToRoot, component);
    }

    public static CmsDetailBottomBar1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar1Binding inflate(LayoutInflater inflater, Object component) {
        return (CmsDetailBottomBar1Binding) ViewDataBinding.inflateInternal(inflater, R.layout.cms_detail_bottom_bar1, null, false, component);
    }

    public static CmsDetailBottomBar1Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CmsDetailBottomBar1Binding bind(View view, Object component) {
        return (CmsDetailBottomBar1Binding) bind(component, view, R.layout.cms_detail_bottom_bar1);
    }
}
