package q5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a extends TextureView implements TextureView.SurfaceTextureListener, c {

    /* renamed from: b, reason: collision with root package name */
    public d f23685b;

    public a(Context context) {
        super(context, null);
    }

    @Override // q5.c
    public final void YFl(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // q5.c
    public final void a(d dVar) {
        this.f23685b = dVar;
        setSurfaceTextureListener(this);
    }

    @Override // q5.c
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // q5.c
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        d dVar = this.f23685b;
        if (dVar != null) {
            dVar.YFl(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d dVar = this.f23685b;
        if (dVar != null) {
            return dVar.YFl(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(b bVar) {
    }
}
