package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.widget.GlDividerView;
import com.glority.widget.GlTextView;

/* loaded from: classes5.dex */
public abstract class ItemPremiumServerBinding extends ViewDataBinding {
    public final LinearLayout cLl;
    public final GlTextView desc;
    public final GlDividerView dividerV;
    public final ImageView iv;
    public final GlTextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemPremiumServerBinding(Object obj, View view, int i, LinearLayout linearLayout, GlTextView glTextView, GlDividerView glDividerView, ImageView imageView, GlTextView glTextView2) {
        super(obj, view, i);
        this.cLl = linearLayout;
        this.desc = glTextView;
        this.dividerV = glDividerView;
        this.iv = imageView;
        this.title = glTextView2;
    }

    public static ItemPremiumServerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPremiumServerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPremiumServerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_premium_server, viewGroup, z, obj);
    }

    public static ItemPremiumServerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPremiumServerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPremiumServerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_premium_server, null, false, obj);
    }

    public static ItemPremiumServerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPremiumServerBinding bind(View view, Object obj) {
        return (ItemPremiumServerBinding) bind(obj, view, R.layout.item_premium_server);
    }
}
