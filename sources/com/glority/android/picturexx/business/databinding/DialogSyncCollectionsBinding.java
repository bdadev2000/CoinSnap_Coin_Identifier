package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public abstract class DialogSyncCollectionsBinding extends ViewDataBinding {
    public final MaterialTextView descTv;
    public final LinearLayout errorLl;
    public final MaterialButton gotItTv;
    public final MaterialButton gotit2Tv;
    public final ImageView ivClose;
    public final LinearProgressIndicator pb;
    public final MaterialButton retryTv;
    public final TextView tvCount;
    public final TextView tvProgress;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogSyncCollectionsBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialTextView descTv, LinearLayout errorLl, MaterialButton gotItTv, MaterialButton gotit2Tv, ImageView ivClose, LinearProgressIndicator pb, MaterialButton retryTv, TextView tvCount, TextView tvProgress) {
        super(_bindingComponent, _root, _localFieldCount);
        this.descTv = descTv;
        this.errorLl = errorLl;
        this.gotItTv = gotItTv;
        this.gotit2Tv = gotit2Tv;
        this.ivClose = ivClose;
        this.pb = pb;
        this.retryTv = retryTv;
        this.tvCount = tvCount;
        this.tvProgress = tvProgress;
    }

    public static DialogSyncCollectionsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSyncCollectionsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogSyncCollectionsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_sync_collections, root, attachToRoot, component);
    }

    public static DialogSyncCollectionsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSyncCollectionsBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogSyncCollectionsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_sync_collections, null, false, component);
    }

    public static DialogSyncCollectionsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogSyncCollectionsBinding bind(View view, Object component) {
        return (DialogSyncCollectionsBinding) bind(component, view, R.layout.dialog_sync_collections);
    }
}
