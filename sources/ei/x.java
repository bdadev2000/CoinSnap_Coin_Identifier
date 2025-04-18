package ei;

import ki.i0;
import ki.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17497b;

    /* renamed from: c, reason: collision with root package name */
    public final ki.i f17498c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17499d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f17500f;

    public x(a0 this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17500f = this$0;
        this.f17497b = z10;
        this.f17498c = new ki.i();
    }

    @Override // ki.i0
    public final void a(ki.i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = xh.b.a;
        ki.i iVar = this.f17498c;
        iVar.a(source, j3);
        while (iVar.f20994c >= 16384) {
            d(false);
        }
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        boolean z11;
        a0 a0Var = this.f17500f;
        byte[] bArr = xh.b.a;
        synchronized (a0Var) {
            if (this.f17499d) {
                return;
            }
            synchronized (a0Var) {
                b bVar = a0Var.f17373m;
                z10 = false;
                if (bVar == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Unit unit = Unit.INSTANCE;
            }
            a0 a0Var2 = this.f17500f;
            if (!a0Var2.f17370j.f17497b) {
                if (this.f17498c.f20994c > 0) {
                    z10 = true;
                }
                if (z10) {
                    while (this.f17498c.f20994c > 0) {
                        d(true);
                    }
                } else if (z11) {
                    a0Var2.f17362b.r(a0Var2.a, true, null, 0L);
                }
            }
            synchronized (this.f17500f) {
                this.f17499d = true;
                Unit unit2 = Unit.INSTANCE;
            }
            this.f17500f.f17362b.flush();
            this.f17500f.a();
        }
    }

    public final void d(boolean z10) {
        long min;
        boolean z11;
        boolean z12;
        a0 a0Var = this.f17500f;
        synchronized (a0Var) {
            a0Var.f17372l.h();
            while (a0Var.f17365e >= a0Var.f17366f && !this.f17497b && !this.f17499d) {
                try {
                    synchronized (a0Var) {
                        b bVar = a0Var.f17373m;
                        if (bVar != null) {
                            break;
                        } else {
                            a0Var.j();
                        }
                    }
                } finally {
                    a0Var.f17372l.l();
                }
            }
            a0Var.f17372l.l();
            a0Var.b();
            min = Math.min(a0Var.f17366f - a0Var.f17365e, this.f17498c.f20994c);
            a0Var.f17365e += min;
            if (z10 && min == this.f17498c.f20994c) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11;
            Unit unit = Unit.INSTANCE;
        }
        this.f17500f.f17372l.h();
        try {
            a0 a0Var2 = this.f17500f;
            a0Var2.f17362b.r(a0Var2.a, z12, this.f17498c, min);
        } finally {
            a0Var = this.f17500f;
        }
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        a0 a0Var = this.f17500f;
        byte[] bArr = xh.b.a;
        synchronized (a0Var) {
            a0Var.b();
            Unit unit = Unit.INSTANCE;
        }
        while (this.f17498c.f20994c > 0) {
            d(false);
            this.f17500f.f17362b.flush();
        }
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f17500f.f17372l;
    }
}
