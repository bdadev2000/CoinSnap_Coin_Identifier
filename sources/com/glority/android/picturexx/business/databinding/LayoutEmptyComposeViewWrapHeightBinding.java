package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutEmptyComposeViewWrapHeightBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutEmptyComposeViewWrapHeightBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
    }

    public static LayoutEmptyComposeViewWrapHeightBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyComposeViewWrapHeightBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutEmptyComposeViewWrapHeightBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_empty_compose_view_wrap_height, root, attachToRoot, component);
    }

    public static LayoutEmptyComposeViewWrapHeightBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyComposeViewWrapHeightBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutEmptyComposeViewWrapHeightBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_empty_compose_view_wrap_height, null, false, component);
    }

    public static LayoutEmptyComposeViewWrapHeightBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyComposeViewWrapHeightBinding bind(View view, Object component) {
        return (LayoutEmptyComposeViewWrapHeightBinding) bind(component, view, R.layout.layout_empty_compose_view_wrap_height);
    }
}
