package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogExportIntroduceBinding extends ViewDataBinding {
    public final MaterialButton btnConfirm;
    public final ImageView iconClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogExportIntroduceBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton btnConfirm, ImageView iconClose) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnConfirm = btnConfirm;
        this.iconClose = iconClose;
    }

    public static DialogExportIntroduceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportIntroduceBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogExportIntroduceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_introduce, root, attachToRoot, component);
    }

    public static DialogExportIntroduceBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportIntroduceBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogExportIntroduceBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_export_introduce, null, false, component);
    }

    public static DialogExportIntroduceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogExportIntroduceBinding bind(View view, Object component) {
        return (DialogExportIntroduceBinding) bind(component, view, R.layout.dialog_export_introduce);
    }
}
