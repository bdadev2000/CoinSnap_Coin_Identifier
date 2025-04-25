package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;

/* loaded from: classes5.dex */
public abstract class WidgetCameraZoomSelectViewBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public WidgetCameraZoomSelectViewBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static WidgetCameraZoomSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (WidgetCameraZoomSelectViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_select_view, viewGroup, z, obj);
    }

    public static WidgetCameraZoomSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (WidgetCameraZoomSelectViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_select_view, null, false, obj);
    }

    public static WidgetCameraZoomSelectViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectViewBinding bind(View view, Object obj) {
        return (WidgetCameraZoomSelectViewBinding) bind(obj, view, R.layout.widget_camera_zoom_select_view);
    }
}
