package com.glority.android.picturexx.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class DialogEmptyComposeViewLayoutBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogEmptyComposeViewLayoutBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static DialogEmptyComposeViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (DialogEmptyComposeViewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_empty_compose_view_layout, viewGroup, z, obj);
    }

    public static DialogEmptyComposeViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeViewLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (DialogEmptyComposeViewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_empty_compose_view_layout, null, false, obj);
    }

    public static DialogEmptyComposeViewLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeViewLayoutBinding bind(View view, Object obj) {
        return (DialogEmptyComposeViewLayoutBinding) bind(obj, view, R.layout.dialog_empty_compose_view_layout);
    }
}
