package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: d, reason: collision with root package name */
    public int f1925d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1927f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f1928g = 0;
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1923b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1924c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1926e = null;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f1925d;
        if (i10 >= 0) {
            this.f1925d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i10);
            this.f1927f = false;
            return;
        }
        if (this.f1927f) {
            Interpolator interpolator = this.f1926e;
            if (interpolator != null && this.f1924c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f1924c;
            if (i11 >= 1) {
                recyclerView.mViewFlinger.c(this.a, this.f1923b, interpolator, i11);
                int i12 = this.f1928g + 1;
                this.f1928g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f1927f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f1928g = 0;
    }
}
