package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes5.dex */
public abstract class FragmentPremuimServiceBinding extends ViewDataBinding {
    public final LinearLayout containerV;
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout premiumTitle;
    public final ItemUnvipcardBinding unvipCard;
    public final ItemVipcardBinding vipCard;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentPremuimServiceBinding(Object obj, View view, int i, LinearLayout linearLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout2, ItemUnvipcardBinding itemUnvipcardBinding, ItemVipcardBinding itemVipcardBinding) {
        super(obj, view, i);
        this.containerV = linearLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.premiumTitle = linearLayout2;
        this.unvipCard = itemUnvipcardBinding;
        this.vipCard = itemVipcardBinding;
    }

    public static FragmentPremuimServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPremuimServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPremuimServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_premuim_service, viewGroup, z, obj);
    }

    public static FragmentPremuimServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPremuimServiceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPremuimServiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_premuim_service, null, false, obj);
    }

    public static FragmentPremuimServiceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPremuimServiceBinding bind(View view, Object obj) {
        return (FragmentPremuimServiceBinding) bind(obj, view, R.layout.fragment_premuim_service);
    }
}
