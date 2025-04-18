package i;

import android.graphics.drawable.Drawable;
import g2.d;

/* loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19133b = 1;

    /* renamed from: c, reason: collision with root package name */
    public Object f19134c;

    public a(d dVar) {
        this.f19134c = dVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f19133b) {
            case 0:
                return;
            default:
                ((d) this.f19134c).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f19133b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f19134c;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            default:
                ((d) this.f19134c).scheduleSelf(runnable, j3);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f19133b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f19134c;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((d) this.f19134c).unscheduleSelf(runnable);
                return;
        }
    }
}
