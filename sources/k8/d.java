package k8;

import w8.C2912b;
import w8.k;

/* loaded from: classes3.dex */
public final class d extends k {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f21501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f21502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C2912b c2912b, h hVar, e eVar) {
        super(c2912b);
        this.f21501c = hVar;
        this.f21502d = eVar;
    }

    @Override // w8.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.b) {
            this.b = true;
            h hVar = this.f21501c;
            e eVar = this.f21502d;
            synchronized (hVar) {
                int i9 = eVar.f21509h - 1;
                eVar.f21509h = i9;
                if (i9 == 0 && eVar.f21507f) {
                    hVar.p(eVar);
                }
            }
        }
    }
}
