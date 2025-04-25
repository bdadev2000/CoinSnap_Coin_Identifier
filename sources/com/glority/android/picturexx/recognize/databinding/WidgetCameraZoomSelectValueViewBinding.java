package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;

/* loaded from: classes5.dex */
public abstract class WidgetCameraZoomSelectValueViewBinding extends ViewDataBinding {
    public final AppCompatTextView tvZoomValue;

    /* JADX INFO: Access modifiers changed from: protected */
    public WidgetCameraZoomSelectValueViewBinding(Object obj, View view, int i, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.tvZoomValue = appCompatTextView;
    }

    public static WidgetCameraZoomSelectValueViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectValueViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (WidgetCameraZoomSelectValueViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_select_value_view, viewGroup, z, obj);
    }

    public static WidgetCameraZoomSelectValueViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectValueViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (WidgetCameraZoomSelectValueViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_select_value_view, null, false, obj);
    }

    public static WidgetCameraZoomSelectValueViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomSelectValueViewBinding bind(View view, Object obj) {
        return (WidgetCameraZoomSelectValueViewBinding) bind(obj, view, R.layout.widget_camera_zoom_select_value_view);
    }
}
