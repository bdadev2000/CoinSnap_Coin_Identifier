package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.camera.CoinCameraPreviewView;

/* loaded from: classes5.dex */
public final class CameraxPreviewViewBinding implements ViewBinding {
    public final CoinCameraPreviewView cameraxPreviewView;
    private final CoinCameraPreviewView rootView;

    private CameraxPreviewViewBinding(CoinCameraPreviewView coinCameraPreviewView, CoinCameraPreviewView coinCameraPreviewView2) {
        this.rootView = coinCameraPreviewView;
        this.cameraxPreviewView = coinCameraPreviewView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoinCameraPreviewView getRoot() {
        return this.rootView;
    }

    public static CameraxPreviewViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CameraxPreviewViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.camerax_preview_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CameraxPreviewViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CoinCameraPreviewView coinCameraPreviewView = (CoinCameraPreviewView) view;
        return new CameraxPreviewViewBinding(coinCameraPreviewView, coinCameraPreviewView);
    }
}
