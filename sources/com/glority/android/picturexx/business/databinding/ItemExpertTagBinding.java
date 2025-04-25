package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemExpertTagBinding extends ViewDataBinding {
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemExpertTagBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView titleTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.titleTv = titleTv;
    }

    public static ItemExpertTagBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertTagBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemExpertTagBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_expert_tag, root, attachToRoot, component);
    }

    public static ItemExpertTagBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertTagBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemExpertTagBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_expert_tag, null, false, component);
    }

    public static ItemExpertTagBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExpertTagBinding bind(View view, Object component) {
        return (ItemExpertTagBinding) bind(component, view, R.layout.item_expert_tag);
    }
}
