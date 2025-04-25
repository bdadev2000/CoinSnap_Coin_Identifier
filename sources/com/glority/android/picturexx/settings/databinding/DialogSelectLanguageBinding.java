package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class DialogSelectLanguageBinding extends ViewDataBinding {
    public final LinearLayout llRoot;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogSelectLanguageBinding(Object obj, View view, int i, LinearLayout linearLayout) {
        super(obj, view, i);
        this.llRoot = linearLayout;
    }

    public static DialogSelectLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSelectLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (DialogSelectLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_select_language, viewGroup, z, obj);
    }

    public static DialogSelectLanguageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSelectLanguageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (DialogSelectLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_select_language, null, false, obj);
    }

    public static DialogSelectLanguageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSelectLanguageBinding bind(View view, Object obj) {
        return (DialogSelectLanguageBinding) bind(obj, view, R.layout.dialog_select_language);
    }
}
