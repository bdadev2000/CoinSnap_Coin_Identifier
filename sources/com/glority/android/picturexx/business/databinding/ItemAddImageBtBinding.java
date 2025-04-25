package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemAddImageBtBinding extends ViewDataBinding {
    public final ConstraintLayout addBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemAddImageBtBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout addBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addBt = addBt;
    }

    public static ItemAddImageBtBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBtBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemAddImageBtBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_image_bt, root, attachToRoot, component);
    }

    public static ItemAddImageBtBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBtBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemAddImageBtBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_image_bt, null, false, component);
    }

    public static ItemAddImageBtBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddImageBtBinding bind(View view, Object component) {
        return (ItemAddImageBtBinding) bind(component, view, R.layout.item_add_image_bt);
    }
}
