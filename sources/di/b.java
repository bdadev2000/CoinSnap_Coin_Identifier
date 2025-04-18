package di;

import java.io.IOException;
import ki.i;
import ki.k0;
import ki.m0;
import ki.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class b implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final r f17043b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f17045d;

    public b(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17045d = this$0;
        this.f17043b = new r(this$0.f17061c.timeout());
    }

    public final void d() {
        h hVar = this.f17045d;
        int i10 = hVar.f17063e;
        if (i10 == 6) {
            return;
        }
        if (i10 == 5) {
            h.f(hVar, this.f17043b);
            hVar.f17063e = 6;
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(hVar.f17063e)));
    }

    @Override // ki.k0
    public long read(i sink, long j3) {
        h hVar = this.f17045d;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return hVar.f17061c.read(sink, j3);
        } catch (IOException e2) {
            hVar.f17060b.k();
            d();
            throw e2;
        }
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f17043b;
    }
}
