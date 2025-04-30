package w8;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes3.dex */
public final class m implements x {
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f24019c;

    /* renamed from: d, reason: collision with root package name */
    public final o8.e f24020d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24021f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f24022g;

    public m(f fVar) {
        s sVar = new s(fVar);
        this.b = sVar;
        Deflater deflater = new Deflater(-1, true);
        this.f24019c = deflater;
        this.f24020d = new o8.e(sVar, deflater);
        this.f24022g = new CRC32();
        f fVar2 = sVar.f24037c;
        fVar2.r(8075);
        fVar2.n(8);
        fVar2.n(0);
        fVar2.q(0);
        fVar2.n(0);
        fVar2.n(0);
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f24019c;
        s sVar = this.b;
        if (this.f24021f) {
            return;
        }
        try {
            o8.e eVar = this.f24020d;
            ((Deflater) eVar.f22021f).finish();
            eVar.a(false);
            sVar.b((int) this.f24022g.getValue());
            sVar.b((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            sVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f24021f = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // w8.x
    public final void d(f fVar, long j7) {
        boolean z8;
        G7.j.e(fVar, "source");
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (j7 == 0) {
                return;
            }
            u uVar = fVar.b;
            G7.j.b(uVar);
            long j9 = j7;
            while (j9 > 0) {
                int min = (int) Math.min(j9, uVar.f24042c - uVar.b);
                this.f24022g.update(uVar.f24041a, uVar.b, min);
                j9 -= min;
                uVar = uVar.f24045f;
                G7.j.b(uVar);
            }
            this.f24020d.d(fVar, j7);
            return;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // w8.x, java.io.Flushable
    public final void flush() {
        this.f24020d.flush();
    }

    @Override // w8.x
    public final A timeout() {
        return this.b.b.timeout();
    }
}
