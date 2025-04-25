package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogRemoveWishSuccessBinding extends ViewDataBinding {
    public final LinearLayout animateLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogRemoveWishSuccessBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout animateLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.animateLl = animateLl;
    }

    public static DialogRemoveWishSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogRemoveWishSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogRemoveWishSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_remove_wish_success, root, attachToRoot, component);
    }

    public static DialogRemoveWishSuccessBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogRemoveWishSuccessBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogRemoveWishSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_remove_wish_success, null, false, component);
    }

    public static DialogRemoveWishSuccessBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogRemoveWishSuccessBinding bind(View view, Object component) {
        return (DialogRemoveWishSuccessBinding) bind(component, view, R.layout.dialog_remove_wish_success);
    }
}
