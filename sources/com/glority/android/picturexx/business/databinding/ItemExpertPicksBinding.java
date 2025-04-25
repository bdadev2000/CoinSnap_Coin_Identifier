package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemExpertPicksBinding extends ViewDataBinding {
    public final TextView contentTv;
    public final HorizontalScrollView imageHsv;
    public final LinearLayout imageLl;
    public final MaterialButton lockBtn;
    public final FrameLayout lockMaskFl;
    public final LinearLayout tagLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemExpertPicksBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView contentTv, HorizontalScrollView imageHsv, LinearLayout imageLl, MaterialButton lockBtn, FrameLayout lockMaskFl, LinearLayout tagLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.contentTv = contentTv;
        this.imageHsv = imageHsv;
        this.imageLl = imageLl;
        this.lockBtn = lockBtn;
        this.lockMaskFl = lockMaskFl;
        this.tagLl = tagLl;
    }

    public static ItemExpertPicksBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertPicksBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemExpertPicksBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_expert_picks, root, attachToRoot, component);
    }

    public static ItemExpertPicksBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertPicksBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemExpertPicksBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_expert_picks, null, false, component);
    }

    public static ItemExpertPicksBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertPicksBinding bind(View view, Object component) {
        return (ItemExpertPicksBinding) bind(component, view, R.layout.item_expert_picks);
    }
}
