package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogNotesnap30freeBinding extends ViewDataBinding {
    public final MaterialButton claminBt;
    public final GlTextView notInterstedTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogNotesnap30freeBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton claminBt, GlTextView notInterstedTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.claminBt = claminBt;
        this.notInterstedTv = notInterstedTv;
    }

    public static DialogNotesnap30freeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNotesnap30freeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogNotesnap30freeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_notesnap_30free, root, attachToRoot, component);
    }

    public static DialogNotesnap30freeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNotesnap30freeBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogNotesnap30freeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_notesnap_30free, null, false, component);
    }

    public static DialogNotesnap30freeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNotesnap30freeBinding bind(View view, Object component) {
        return (DialogNotesnap30freeBinding) bind(component, view, R.layout.dialog_notesnap_30free);
    }
}
