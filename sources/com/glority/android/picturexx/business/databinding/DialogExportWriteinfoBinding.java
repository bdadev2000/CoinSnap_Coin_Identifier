package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogExportWriteinfoBinding extends ViewDataBinding {
    public final MaterialButton btnConfirm;
    public final GlTextView countTv;
    public final EditText emailEt;
    public final GlTextView emailInfoTv;
    public final ImageView iconClose;
    public final GlTextView maxTv;
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogExportWriteinfoBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton btnConfirm, GlTextView countTv, EditText emailEt, GlTextView emailInfoTv, ImageView iconClose, GlTextView maxTv, GlTextView titleTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnConfirm = btnConfirm;
        this.countTv = countTv;
        this.emailEt = emailEt;
        this.emailInfoTv = emailInfoTv;
        this.iconClose = iconClose;
        this.maxTv = maxTv;
        this.titleTv = titleTv;
    }

    public static DialogExportWriteinfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportWriteinfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogExportWriteinfoBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_writeinfo, root, attachToRoot, component);
    }

    public static DialogExportWriteinfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportWriteinfoBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogExportWriteinfoBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_writeinfo, null, false, component);
    }

    public static DialogExportWriteinfoBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportWriteinfoBinding bind(View view, Object component) {
        return (DialogExportWriteinfoBinding) bind(component, view, R.layout.dialog_export_writeinfo);
    }
}
