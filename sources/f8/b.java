package f8;

import androidx.recyclerview.widget.s0;
import n9.h0;
import y7.w;
import y7.y;

/* loaded from: classes3.dex */
public final class b implements f {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f17691b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f17692c;

    /* renamed from: d, reason: collision with root package name */
    public long f17693d;

    public b(long j3, long j10, long j11) {
        this.f17693d = j3;
        this.a = j11;
        s0 s0Var = new s0(6);
        this.f17691b = s0Var;
        s0 s0Var2 = new s0(6);
        this.f17692c = s0Var2;
        s0Var.e(0L);
        s0Var2.e(j10);
    }

    public final boolean a(long j3) {
        s0 s0Var = this.f17691b;
        if (j3 - s0Var.h(s0Var.f2031b - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // f8.f
    public final long c() {
        return this.a;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f17693d;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        s0 s0Var = this.f17691b;
        int c10 = h0.c(s0Var, j3);
        long h10 = s0Var.h(c10);
        s0 s0Var2 = this.f17692c;
        y yVar = new y(h10, s0Var2.h(c10));
        if (h10 != j3 && c10 != s0Var.f2031b - 1) {
            int i10 = c10 + 1;
            return new w(yVar, new y(s0Var.h(i10), s0Var2.h(i10)));
        }
        return new w(yVar, yVar);
    }

    @Override // f8.f
    public final long getTimeUs(long j3) {
        return this.f17691b.h(h0.c(this.f17692c, j3));
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
