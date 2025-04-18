package o9;

import android.view.Surface;

/* loaded from: classes3.dex */
public abstract class q {
    public static void a(Surface surface, float f10) {
        int i10;
        if (f10 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f10, i10);
        } catch (IllegalStateException e2) {
            n9.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
