package f;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f20210a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20212d;

    public b(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        C2251a c2251a = C2251a.f20209a;
        float d2 = c2251a.d(backEvent);
        float e4 = c2251a.e(backEvent);
        float b = c2251a.b(backEvent);
        int c9 = c2251a.c(backEvent);
        this.f20210a = d2;
        this.b = e4;
        this.f20211c = b;
        this.f20212d = c9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f20210a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.f20211c);
        sb.append(", swipeEdge=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.f20212d, '}');
    }
}
