package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class ListItemVipSupportImageBinding extends ViewDataBinding {
    public final CardView cvCard;
    public final ImageView iv;
    public final ImageView ivClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public ListItemVipSupportImageBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.cvCard = cardView;
        this.iv = imageView;
        this.ivClose = imageView2;
    }

    public static ListItemVipSupportImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ListItemVipSupportImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.list_item_vip_support_image, viewGroup, z, obj);
    }

    public static ListItemVipSupportImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ListItemVipSupportImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.list_item_vip_support_image, null, false, obj);
    }

    public static ListItemVipSupportImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ListItemVipSupportImageBinding bind(View view, Object obj) {
        return (ListItemVipSupportImageBinding) bind(obj, view, R.layout.list_item_vip_support_image);
    }
}
