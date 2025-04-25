package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogExportSuccessBinding extends ViewDataBinding {
    public final MaterialButton btnConfirm;
    public final ImageView iconClose;
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogExportSuccessBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton btnConfirm, ImageView iconClose, GlTextView titleTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnConfirm = btnConfirm;
        this.iconClose = iconClose;
        this.titleTv = titleTv;
    }

    public static DialogExportSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogExportSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_success, root, attachToRoot, component);
    }

    public static DialogExportSuccessBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportSuccessBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogExportSuccessBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_success, null, false, component);
    }

    public static DialogExportSuccessBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportSuccessBinding bind(View view, Object component) {
        return (DialogExportSuccessBinding) bind(component, view, R.layout.dialog_export_success);
    }
}
