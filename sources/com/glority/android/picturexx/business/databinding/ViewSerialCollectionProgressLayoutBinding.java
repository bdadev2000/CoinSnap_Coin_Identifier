package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.views.SeriesCollectionFolderView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes2.dex */
public abstract class ViewSerialCollectionProgressLayoutBinding extends ViewDataBinding {
    public final SeriesCollectionFolderView folderView;
    public final LinearProgressIndicator progressBar;
    public final AppCompatTextView progressText;
    public final AppCompatTextView seriesName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewSerialCollectionProgressLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, SeriesCollectionFolderView folderView, LinearProgressIndicator progressBar, AppCompatTextView progressText, AppCompatTextView seriesName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.folderView = folderView;
        this.progressBar = progressBar;
        this.progressText = progressText;
        this.seriesName = seriesName;
    }

    public static ViewSerialCollectionProgressLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSerialCollectionProgressLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewSerialCollectionProgressLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_serial_collection_progress_layout, root, attachToRoot, component);
    }

    public static ViewSerialCollectionProgressLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSerialCollectionProgressLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewSerialCollectionProgressLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_serial_collection_progress_layout, null, false, component);
    }

    public static ViewSerialCollectionProgressLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewSerialCollectionProgressLayoutBinding bind(View view, Object component) {
        return (ViewSerialCollectionProgressLayoutBinding) bind(component, view, R.layout.view_serial_collection_progress_layout);
    }
}
