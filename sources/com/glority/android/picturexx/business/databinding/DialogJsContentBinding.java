package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class DialogJsContentBinding extends ViewDataBinding {
    public final ImageView closeIv;
    public final LinearLayout container;
    public final GlTextView et;
    public final GlTextView textTv;
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogJsContentBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView closeIv, LinearLayout container, GlTextView et, GlTextView textTv, GlTextView titleTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.closeIv = closeIv;
        this.container = container;
        this.et = et;
        this.textTv = textTv;
        this.titleTv = titleTv;
    }

    public static DialogJsContentBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogJsContentBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogJsContentBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_js_content, root, attachToRoot, component);
    }

    public static DialogJsContentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogJsContentBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogJsContentBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_js_content, null, false, component);
    }

    public static DialogJsContentBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogJsContentBinding bind(View view, Object component) {
        return (DialogJsContentBinding) bind(component, view, R.layout.dialog_js_content);
    }
}
