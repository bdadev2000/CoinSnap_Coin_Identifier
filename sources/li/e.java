package li;

import java.io.IOException;
import ki.k0;
import ki.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f21384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21385c;

    /* renamed from: d, reason: collision with root package name */
    public long f21386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k0 delegate, long j3, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21384b = j3;
        this.f21385c = z10;
    }

    @Override // ki.q, ki.k0
    public final long read(ki.i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.f21386d;
        long j11 = this.f21384b;
        if (j10 > j11) {
            j3 = 0;
        } else if (this.f21385c) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j3 = Math.min(j3, j12);
        }
        long read = super.read(sink, j3);
        if (read != -1) {
            this.f21386d += read;
        }
        long j13 = this.f21386d;
        if ((j13 < j11 && read == -1) || j13 > j11) {
            if (read > 0 && j13 > j11) {
                long j14 = sink.f20994c - (j13 - j11);
                ki.i iVar = new ki.i();
                iVar.L(sink);
                sink.a(iVar, j14);
                iVar.d();
            }
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("expected ", j11, " bytes but got ");
            o10.append(this.f21386d);
            throw new IOException(o10.toString());
        }
        return read;
    }
}
