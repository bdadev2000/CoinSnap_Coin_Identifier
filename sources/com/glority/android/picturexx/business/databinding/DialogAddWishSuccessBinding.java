package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogAddWishSuccessBinding extends ViewDataBinding {
    public final LinearLayout animateLl;
    public final ImageView heartIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogAddWishSuccessBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout animateLl, ImageView heartIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.animateLl = animateLl;
        this.heartIv = heartIv;
    }

    public static DialogAddWishSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogAddWishSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogAddWishSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_add_wish_success, root, attachToRoot, component);
    }

    public static DialogAddWishSuccessBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogAddWishSuccessBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogAddWishSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_add_wish_success, null, false, component);
    }

    public static DialogAddWishSuccessBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogAddWishSuccessBinding bind(View view, Object component) {
        return (DialogAddWishSuccessBinding) bind(component, view, R.layout.dialog_add_wish_success);
    }
}
