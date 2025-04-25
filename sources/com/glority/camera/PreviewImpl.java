package com.glority.camera;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.glority.camera.IPreview;

/* loaded from: classes6.dex */
public abstract class PreviewImpl implements IPreview {
    private IPreview.CallBack mCallback;
    protected int mDisplayOrientation;
    private int mHeight;
    private int mWidth;

    @Override // com.glority.camera.IPreview
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    @Override // com.glority.camera.IPreview
    public SurfaceTexture getSurfaceTexture() {
        return null;
    }

    @Override // com.glority.camera.IPreview
    public void setBufferSize(int i, int i2) {
    }

    @Override // com.glority.camera.IPreview
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.glority.camera.IPreview
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.glority.camera.IPreview
    public void setSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    @Override // com.glority.camera.IPreview
    public void setCallBack(IPreview.CallBack callBack) {
        this.mCallback = callBack;
    }

    @Override // com.glority.camera.IPreview
    public void setRotation(int i) {
        this.mDisplayOrientation = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dispatchSurfaceChanged() {
        IPreview.CallBack callBack = this.mCallback;
        if (callBack != null) {
            callBack.onSurfaceChanged();
        }
    }
}
