package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemHomeBannerVipBinding extends ViewDataBinding {
    public final CardView llBanknoteOffer;
    public final GlTextView tipsTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeBannerVipBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView llBanknoteOffer, GlTextView tipsTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.llBanknoteOffer = llBanknoteOffer;
        this.tipsTv = tipsTv;
    }

    public static ItemHomeBannerVipBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeBannerVipBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeBannerVipBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_banner_vip, root, attachToRoot, component);
    }

    public static ItemHomeBannerVipBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeBannerVipBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeBannerVipBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_banner_vip, null, false, component);
    }

    public static ItemHomeBannerVipBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeBannerVipBinding bind(View view, Object component) {
        return (ItemHomeBannerVipBinding) bind(component, view, R.layout.item_home_banner_vip);
    }
}
