package com.bykv.vk.openvk.component.video.api.renderview;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class KS implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> zp;

    public KS(SurfaceHolder.Callback callback) {
        this.zp = new WeakReference<>(callback);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        SurfaceHolder.Callback callback = this.zp.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i9, i10, i11);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.zp.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.zp.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public SurfaceHolder.Callback zp() {
        return this.zp.get();
    }
}
