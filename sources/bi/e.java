package bi;

import ei.f0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import lb.o;
import wh.d0;
import wh.z0;

/* loaded from: classes5.dex */
public final class e {
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public final wh.a f2454b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2455c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f2456d;

    /* renamed from: e, reason: collision with root package name */
    public o f2457e;

    /* renamed from: f, reason: collision with root package name */
    public n f2458f;

    /* renamed from: g, reason: collision with root package name */
    public int f2459g;

    /* renamed from: h, reason: collision with root package name */
    public int f2460h;

    /* renamed from: i, reason: collision with root package name */
    public int f2461i;

    /* renamed from: j, reason: collision with root package name */
    public z0 f2462j;

    public e(l connectionPool, wh.a address, i call, y5.f eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = connectionPool;
        this.f2454b = address;
        this.f2455c = call;
        this.f2456d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bi.k a(int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.e.a(int, int, int, boolean, boolean):bi.k");
    }

    public final boolean b(d0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        d0 d0Var = this.f2454b.f27007i;
        if (url.f27036e == d0Var.f27036e && Intrinsics.areEqual(url.f27035d, d0Var.f27035d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        this.f2462j = null;
        if ((e2 instanceof f0) && ((f0) e2).f17417b == ei.b.REFUSED_STREAM) {
            this.f2459g++;
        } else if (e2 instanceof ei.a) {
            this.f2460h++;
        } else {
            this.f2461i++;
        }
    }
}
