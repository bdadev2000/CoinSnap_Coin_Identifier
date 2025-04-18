package i;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* loaded from: classes3.dex */
public final class k extends ForwardingSink {

    /* renamed from: a, reason: collision with root package name */
    public final q0.l f30800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30801b;

    public k(Sink sink, i iVar) {
        super(sink);
        this.f30800a = iVar;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f30801b = true;
            this.f30800a.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f30801b = true;
            this.f30800a.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer buffer, long j2) {
        if (this.f30801b) {
            buffer.skip(j2);
            return;
        }
        try {
            super.write(buffer, j2);
        } catch (IOException e) {
            this.f30801b = true;
            this.f30800a.invoke(e);
        }
    }
}
