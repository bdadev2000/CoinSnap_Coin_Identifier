package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogGradeLevelBinding extends ViewDataBinding {
    public final ImageView ivClose;
    public final RecyclerView levelRv;
    public final RecyclerView nameRv;
    public final MaterialButton saveBt;
    public final GlTextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogGradeLevelBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivClose, RecyclerView levelRv, RecyclerView nameRv, MaterialButton saveBt, GlTextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivClose = ivClose;
        this.levelRv = levelRv;
        this.nameRv = nameRv;
        this.saveBt = saveBt;
        this.title = title;
    }

    public static DialogGradeLevelBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogGradeLevelBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogGradeLevelBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_grade_level, root, attachToRoot, component);
    }

    public static DialogGradeLevelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogGradeLevelBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogGradeLevelBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_grade_level, null, false, component);
    }

    public static DialogGradeLevelBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogGradeLevelBinding bind(View view, Object component) {
        return (DialogGradeLevelBinding) bind(component, view, R.layout.dialog_grade_level);
    }
}
