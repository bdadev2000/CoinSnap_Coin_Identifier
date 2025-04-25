package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.glority.base.widget.webview.JsbWebView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes2.dex */
public abstract class FragmentBusinessJsWebviewBinding extends ViewDataBinding {
    public final LinearProgressIndicator pb;
    public final LayoutToolbarBinding toolbarInclude;
    public final JsbWebView webview;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentBusinessJsWebviewBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearProgressIndicator pb, LayoutToolbarBinding toolbarInclude, JsbWebView webview) {
        super(_bindingComponent, _root, _localFieldCount);
        this.pb = pb;
        this.toolbarInclude = toolbarInclude;
        this.webview = webview;
    }

    public static FragmentBusinessJsWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBusinessJsWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentBusinessJsWebviewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_business_js_webview, root, attachToRoot, component);
    }

    public static FragmentBusinessJsWebviewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBusinessJsWebviewBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentBusinessJsWebviewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_business_js_webview, null, false, component);
    }

    public static FragmentBusinessJsWebviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBusinessJsWebviewBinding bind(View view, Object component) {
        return (FragmentBusinessJsWebviewBinding) bind(component, view, R.layout.fragment_business_js_webview);
    }
}
