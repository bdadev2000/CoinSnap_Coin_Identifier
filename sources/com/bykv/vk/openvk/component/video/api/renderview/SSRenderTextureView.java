package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.lMd;

/* loaded from: classes.dex */
public class SSRenderTextureView extends TextureView implements TextureView.SurfaceTextureListener, lMd {
    private lMd.zp lMd;
    private zp zp;

    public SSRenderTextureView(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        zp zpVar = this.zp;
        if (zpVar != null) {
            zpVar.zp(surfaceTexture, i9, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zp zpVar = this.zp;
        if (zpVar != null) {
            return zpVar.zp(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
    }

    public void setWindowVisibilityChangedListener(lMd.zp zpVar) {
        this.lMd = zpVar;
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public void zp(zp zpVar) {
        this.zp = zpVar;
        setSurfaceTextureListener(this);
    }

    public SSRenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.lMd
    public void zp(int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i9;
        setLayoutParams(layoutParams);
    }
}
