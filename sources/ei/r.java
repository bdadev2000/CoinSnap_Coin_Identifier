package ei;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class r extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, t tVar, long j3) {
        super(str, true);
        this.f17451e = tVar;
        this.f17452f = j3;
    }

    @Override // ai.a
    public final long a() {
        t tVar;
        boolean z10;
        synchronized (this.f17451e) {
            tVar = this.f17451e;
            long j3 = tVar.f17469p;
            long j10 = tVar.f17468o;
            if (j3 < j10) {
                z10 = true;
            } else {
                tVar.f17468o = j10 + 1;
                z10 = false;
            }
        }
        if (z10) {
            tVar.g(null);
            return -1L;
        }
        try {
            tVar.A.p(false, 1, 0);
        } catch (IOException e2) {
            tVar.g(e2);
        }
        return this.f17452f;
    }
}
