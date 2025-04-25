package com.glority.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class TextureViewPreview extends PreviewImpl {
    private final TextureView mTextureView;

    public TextureViewPreview(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, R.layout.texture_view, viewGroup).findViewById(R.id.texture_view);
        this.mTextureView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.glority.camera.TextureViewPreview.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureViewPreview.this.setSize(i, i2);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureViewPreview.this.setSize(i, i2);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureViewPreview.this.setSize(0, 0);
                return true;
            }
        });
    }

    @Override // com.glority.camera.IPreview
    public View getView() {
        return this.mTextureView;
    }

    @Override // com.glority.camera.PreviewImpl, com.glority.camera.IPreview
    public void setBufferSize(int i, int i2) {
        this.mTextureView.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // com.glority.camera.IPreview
    public Surface getSurface() {
        return new Surface(this.mTextureView.getSurfaceTexture());
    }

    @Override // com.glority.camera.PreviewImpl, com.glority.camera.IPreview
    public SurfaceTexture getSurfaceTexture() {
        return this.mTextureView.getSurfaceTexture();
    }

    @Override // com.glority.camera.IPreview
    public Class getOutputClass() {
        return SurfaceTexture.class;
    }

    @Override // com.glority.camera.IPreview
    public boolean isReady() {
        return this.mTextureView.getSurfaceTexture() != null;
    }

    @Override // com.glority.camera.PreviewImpl, com.glority.camera.IPreview
    public void setRotation(int i) {
        super.setRotation(i);
        configureTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configureTransform() {
        Matrix matrix = new Matrix();
        if (this.mDisplayOrientation == 1 || this.mDisplayOrientation == 3) {
            float width = getWidth();
            float height = getHeight();
            float[] fArr = {0.0f, 0.0f, width, 0.0f, 0.0f, height, width, height};
            float[] fArr2 = new float[8];
            if (this.mDisplayOrientation == 1) {
                fArr2[0] = 0.0f;
                fArr2[1] = height;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = width;
                fArr2[5] = height;
                fArr2[6] = width;
                fArr2[7] = 0.0f;
            } else {
                fArr2[0] = width;
                fArr2[1] = 0.0f;
                fArr2[2] = width;
                fArr2[3] = height;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = 0.0f;
                fArr2[7] = height;
            }
            matrix.setPolyToPoly(fArr, 0, fArr2, 0, 4);
        } else if (this.mDisplayOrientation == 2) {
            matrix.postRotate(180.0f, getWidth() / 2, getHeight() / 2);
        }
        this.mTextureView.setTransform(matrix);
    }
}
