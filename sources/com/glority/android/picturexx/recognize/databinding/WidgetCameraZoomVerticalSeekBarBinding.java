package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.widget.VerticalSeekBar;

/* loaded from: classes5.dex */
public abstract class WidgetCameraZoomVerticalSeekBarBinding extends ViewDataBinding {
    public final ImageView ivZoomIn;
    public final ImageView ivZoomOut;
    public final VerticalSeekBar seekBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public WidgetCameraZoomVerticalSeekBarBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, VerticalSeekBar verticalSeekBar) {
        super(obj, view, i);
        this.ivZoomIn = imageView;
        this.ivZoomOut = imageView2;
        this.seekBar = verticalSeekBar;
    }

    public static WidgetCameraZoomVerticalSeekBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomVerticalSeekBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (WidgetCameraZoomVerticalSeekBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_vertical_seek_bar, viewGroup, z, obj);
    }

    public static WidgetCameraZoomVerticalSeekBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomVerticalSeekBarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (WidgetCameraZoomVerticalSeekBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_camera_zoom_vertical_seek_bar, null, false, obj);
    }

    public static WidgetCameraZoomVerticalSeekBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetCameraZoomVerticalSeekBarBinding bind(View view, Object obj) {
        return (WidgetCameraZoomVerticalSeekBarBinding) bind(obj, view, R.layout.widget_camera_zoom_vertical_seek_bar);
    }
}
