package j8;

import n9.x;
import v8.u0;
import y7.m;

/* loaded from: classes3.dex */
public final class e {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19811b;

    public /* synthetic */ e(int i10, long j3, int i11) {
        this.a = i10;
        this.f19811b = j3;
    }

    public static e a(m mVar, x xVar) {
        mVar.peekFully(xVar.a, 0, 8);
        xVar.G(0);
        return new e(xVar.f(), xVar.l(), 0);
    }

    public e(int i10, long j3) {
        u0.d(j3 >= 0);
        this.a = i10;
        this.f19811b = j3;
    }
}
