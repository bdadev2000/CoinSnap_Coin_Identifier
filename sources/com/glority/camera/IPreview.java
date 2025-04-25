package com.glority.camera;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* loaded from: classes6.dex */
public interface IPreview {

    /* loaded from: classes6.dex */
    public interface CallBack {
        void onSurfaceChanged();
    }

    /* loaded from: classes6.dex */
    public @interface Rotation {
    }

    int getHeight();

    Class getOutputClass();

    Surface getSurface();

    SurfaceHolder getSurfaceHolder();

    SurfaceTexture getSurfaceTexture();

    View getView();

    int getWidth();

    boolean isReady();

    void setBufferSize(int i, int i2);

    void setCallBack(CallBack callBack);

    void setRotation(int i);

    void setSize(int i, int i2);
}
