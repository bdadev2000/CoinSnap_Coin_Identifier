package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemAddCollectionNoticeBinding extends ViewDataBinding {
    public final GlTextView descTv;
    public final GlTextView editTv;
    public final LinearLayout noticeLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemAddCollectionNoticeBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView descTv, GlTextView editTv, LinearLayout noticeLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.descTv = descTv;
        this.editTv = editTv;
        this.noticeLl = noticeLl;
    }

    public static ItemAddCollectionNoticeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddCollectionNoticeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemAddCollectionNoticeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_collection_notice, root, attachToRoot, component);
    }

    public static ItemAddCollectionNoticeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddCollectionNoticeBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemAddCollectionNoticeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_add_collection_notice, null, false, component);
    }

    public static ItemAddCollectionNoticeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAddCollectionNoticeBinding bind(View view, Object component) {
        return (ItemAddCollectionNoticeBinding) bind(component, view, R.layout.item_add_collection_notice);
    }
}
