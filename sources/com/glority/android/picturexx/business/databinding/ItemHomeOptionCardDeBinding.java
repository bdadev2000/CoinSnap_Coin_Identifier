package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemHomeOptionCardDeBinding extends ViewDataBinding {
    public final ConstraintLayout idenfityLl;
    public final AppCompatImageView identifyIv;
    public final ImageView scanIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeOptionCardDeBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout idenfityLl, AppCompatImageView identifyIv, ImageView scanIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.idenfityLl = idenfityLl;
        this.identifyIv = identifyIv;
        this.scanIv = scanIv;
    }

    public static ItemHomeOptionCardDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeOptionCardDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeOptionCardDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_option_card_de, root, attachToRoot, component);
    }

    public static ItemHomeOptionCardDeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeOptionCardDeBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeOptionCardDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_option_card_de, null, false, component);
    }

    public static ItemHomeOptionCardDeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeOptionCardDeBinding bind(View view, Object component) {
        return (ItemHomeOptionCardDeBinding) bind(component, view, R.layout.item_home_option_card_de);
    }
}
