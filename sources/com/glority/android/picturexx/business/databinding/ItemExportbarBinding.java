package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemExportbarBinding extends ViewDataBinding {
    public final LinearLayout llExport;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemExportbarBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout llExport) {
        super(_bindingComponent, _root, _localFieldCount);
        this.llExport = llExport;
    }

    public static ItemExportbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExportbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemExportbarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_exportbar, root, attachToRoot, component);
    }

    public static ItemExportbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExportbarBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemExportbarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_exportbar, null, false, component);
    }

    public static ItemExportbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemExportbarBinding bind(View view, Object component) {
        return (ItemExportbarBinding) bind(component, view, R.layout.item_exportbar);
    }
}
