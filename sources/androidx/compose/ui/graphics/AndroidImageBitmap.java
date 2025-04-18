package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class AndroidImageBitmap implements ImageBitmap {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f14932a;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.f14932a = bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final void a() {
        this.f14932a.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int b() {
        Bitmap.Config config = this.f14932a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getHeight() {
        return this.f14932a.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getWidth() {
        return this.f14932a.getWidth();
    }
}
