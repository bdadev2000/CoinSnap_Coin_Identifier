package androidx.work;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class q extends com.facebook.appevents.i {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f5250d;

    public q(Throwable th) {
        this.f5250d = th;
    }

    public final String toString() {
        return AbstractC2914a.e("FAILURE (", this.f5250d.getMessage(), ")");
    }
}
