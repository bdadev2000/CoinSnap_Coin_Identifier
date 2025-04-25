package com.glority.camera;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes6.dex */
public class SurfaceViewPreview extends PreviewImpl {
    private final SurfaceView mSurfaceView;

    public SurfaceViewPreview(Context context, ViewGroup viewGroup) {
        SurfaceView surfaceView = (SurfaceView) View.inflate(context, R.layout.surface_view, viewGroup).findViewById(R.id.surface_view);
        this.mSurfaceView = surfaceView;
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.glority.camera.SurfaceViewPreview.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                SurfaceViewPreview.this.setSize(i2, i3);
                if (ViewCompat.isInLayout(SurfaceViewPreview.this.mSurfaceView)) {
                    return;
                }
                SurfaceViewPreview.this.dispatchSurfaceChanged();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceViewPreview.this.setSize(0, 0);
            }
        });
    }

    @Override // com.glority.camera.IPreview
    public View getView() {
        return this.mSurfaceView;
    }

    @Override // com.glority.camera.IPreview
    public Surface getSurface() {
        return getSurfaceHolder().getSurface();
    }

    @Override // com.glority.camera.IPreview
    public Class getOutputClass() {
        return SurfaceHolder.class;
    }

    @Override // com.glority.camera.IPreview
    public boolean isReady() {
        return (getWidth() == 0 || getHeight() == 0) ? false : true;
    }

    @Override // com.glority.camera.PreviewImpl, com.glority.camera.IPreview
    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceView.getHolder();
    }
}
