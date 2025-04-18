package zh;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ki.d0;
import ki.k0;
import ki.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f28767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ki.k f28768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f28769d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ki.j f28770f;

    public a(ki.k kVar, wh.g gVar, d0 d0Var) {
        this.f28768c = kVar;
        this.f28769d = gVar;
        this.f28770f = d0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f28767b && !xh.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f28767b = true;
            ((wh.g) this.f28769d).a();
        }
        this.f28768c.close();
    }

    @Override // ki.k0
    public final long read(ki.i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long read = this.f28768c.read(sink, j3);
            ki.j jVar = this.f28770f;
            if (read == -1) {
                if (!this.f28767b) {
                    this.f28767b = true;
                    jVar.close();
                }
                return -1L;
            }
            sink.j(sink.f20994c - read, read, jVar.y());
            jVar.emitCompleteSegments();
            return read;
        } catch (IOException e2) {
            if (!this.f28767b) {
                this.f28767b = true;
                ((wh.g) this.f28769d).a();
            }
            throw e2;
        }
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f28768c.timeout();
    }
}
