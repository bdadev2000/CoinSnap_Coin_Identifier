package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class ListItemVipSupportAddImageBinding extends ViewDataBinding {
    public final ConstraintLayout clAddImages;

    /* JADX INFO: Access modifiers changed from: protected */
    public ListItemVipSupportAddImageBinding(Object obj, View view, int i, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.clAddImages = constraintLayout;
    }

    public static ListItemVipSupportAddImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportAddImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ListItemVipSupportAddImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.list_item_vip_support_add_image, viewGroup, z, obj);
    }

    public static ListItemVipSupportAddImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportAddImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ListItemVipSupportAddImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.list_item_vip_support_add_image, null, false, obj);
    }

    public static ListItemVipSupportAddImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportAddImageBinding bind(View view, Object obj) {
        return (ListItemVipSupportAddImageBinding) bind(obj, view, R.layout.list_item_vip_support_add_image);
    }
}
