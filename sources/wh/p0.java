package wh;

import java.io.File;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends s0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f27175b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27176c;

    public /* synthetic */ p0(g0 g0Var, Object obj, int i10) {
        this.a = i10;
        this.f27175b = g0Var;
        this.f27176c = obj;
    }

    @Override // wh.s0
    public final long contentLength() {
        int i10 = this.a;
        Object obj = this.f27176c;
        switch (i10) {
            case 0:
                return ((File) obj).length();
            case 1:
                return ((ki.l) obj).d();
            default:
                return ((s0) obj).contentLength();
        }
    }

    @Override // wh.s0
    public final g0 contentType() {
        return this.f27175b;
    }

    @Override // wh.s0
    public final void writeTo(ki.j sink) {
        int i10 = this.a;
        Object obj = this.f27176c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                ki.d M = a6.k.M((File) obj);
                try {
                    sink.L(M);
                    CloseableKt.closeFinally(M, null);
                    return;
                } finally {
                }
            case 1:
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.E((ki.l) obj);
                return;
            default:
                ((s0) obj).writeTo(sink);
                return;
        }
    }

    public p0(s0 s0Var, g0 g0Var) {
        this.a = 2;
        this.f27176c = s0Var;
        this.f27175b = g0Var;
    }
}
