package ei;

import ki.k0;
import ki.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f17501b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17502c;

    /* renamed from: d, reason: collision with root package name */
    public final ki.i f17503d;

    /* renamed from: f, reason: collision with root package name */
    public final ki.i f17504f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f17506h;

    public y(a0 this$0, long j3, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17506h = this$0;
        this.f17501b = j3;
        this.f17502c = z10;
        this.f17503d = new ki.i();
        this.f17504f = new ki.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        a0 a0Var = this.f17506h;
        synchronized (a0Var) {
            this.f17505g = true;
            ki.i iVar = this.f17504f;
            j3 = iVar.f20994c;
            iVar.d();
            a0Var.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (j3 > 0) {
            d(j3);
        }
        this.f17506h.a();
    }

    public final void d(long j3) {
        byte[] bArr = xh.b.a;
        this.f17506h.f17362b.q(j3);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[LOOP:0: B:5:0x0018->B:42:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[SYNTHETIC] */
    @Override // ki.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(ki.i r17, long r18) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.y.read(ki.i, long):long");
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f17506h.f17371k;
    }
}
