package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4997a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4998c;

    /* renamed from: d, reason: collision with root package name */
    public int f4999d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f5000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5001f;

    /* renamed from: g, reason: collision with root package name */
    public int f5002g;

    public final void a(RecyclerView recyclerView) {
        int i9 = this.f4999d;
        if (i9 >= 0) {
            this.f4999d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i9);
            this.f5001f = false;
            return;
        }
        if (this.f5001f) {
            Interpolator interpolator = this.f5000e;
            if (interpolator != null && this.f4998c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f4998c;
            if (i10 >= 1) {
                recyclerView.mViewFlinger.c(this.f4997a, this.b, interpolator, i10);
                int i11 = this.f5002g + 1;
                this.f5002g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5001f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f5002g = 0;
    }
}
