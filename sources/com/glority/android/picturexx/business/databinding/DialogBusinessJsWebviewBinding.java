package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class DialogBusinessJsWebviewBinding extends ViewDataBinding {
    public final FragmentContainerView fcv;
    public final ImageView ivClose;
    public final GlTextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogBusinessJsWebviewBinding(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fcv, ImageView ivClose, GlTextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fcv = fcv;
        this.ivClose = ivClose;
        this.title = title;
    }

    public static DialogBusinessJsWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBusinessJsWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogBusinessJsWebviewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_business_js_webview, root, attachToRoot, component);
    }

    public static DialogBusinessJsWebviewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBusinessJsWebviewBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogBusinessJsWebviewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_business_js_webview, null, false, component);
    }

    public static DialogBusinessJsWebviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBusinessJsWebviewBinding bind(View view, Object component) {
        return (DialogBusinessJsWebviewBinding) bind(component, view, R.layout.dialog_business_js_webview);
    }
}
