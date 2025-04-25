package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemIdentifyResultsFlagBinding extends ViewDataBinding {
    public final GlTextView countryNameTv;
    public final ShapeableImageView flagIv;
    public final LinearLayout flagLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemIdentifyResultsFlagBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView countryNameTv, ShapeableImageView flagIv, LinearLayout flagLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.countryNameTv = countryNameTv;
        this.flagIv = flagIv;
        this.flagLl = flagLl;
    }

    public static ItemIdentifyResultsFlagBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdentifyResultsFlagBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemIdentifyResultsFlagBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_identify_results_flag, root, attachToRoot, component);
    }

    public static ItemIdentifyResultsFlagBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdentifyResultsFlagBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemIdentifyResultsFlagBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_identify_results_flag, null, false, component);
    }

    public static ItemIdentifyResultsFlagBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdentifyResultsFlagBinding bind(View view, Object component) {
        return (ItemIdentifyResultsFlagBinding) bind(component, view, R.layout.item_identify_results_flag);
    }
}
