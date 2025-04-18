package wh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends s0 {
    public final /* synthetic */ g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f27181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27182d;

    public q0(g0 g0Var, byte[] bArr, int i10, int i11) {
        this.a = g0Var;
        this.f27180b = i10;
        this.f27181c = bArr;
        this.f27182d = i11;
    }

    @Override // wh.s0
    public final long contentLength() {
        return this.f27180b;
    }

    @Override // wh.s0
    public final g0 contentType() {
        return this.a;
    }

    @Override // wh.s0
    public final void writeTo(ki.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.S(this.f27182d, this.f27180b, this.f27181c);
    }
}
