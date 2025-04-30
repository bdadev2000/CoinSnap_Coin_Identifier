package w8;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.io.InputStream;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class e extends InputStream {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f24013c;

    public /* synthetic */ e(h hVar, int i9) {
        this.b = i9;
        this.f24013c = hVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.b) {
            case 0:
                return (int) Math.min(((f) this.f24013c).f24014c, Integer.MAX_VALUE);
            default:
                t tVar = (t) this.f24013c;
                if (!tVar.f24040d) {
                    return (int) Math.min(tVar.f24039c.f24014c, Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                return;
            default:
                ((t) this.f24013c).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.b) {
            case 0:
                f fVar = (f) this.f24013c;
                if (fVar.f24014c > 0) {
                    return fVar.readByte() & 255;
                }
                return -1;
            default:
                t tVar = (t) this.f24013c;
                if (!tVar.f24040d) {
                    f fVar2 = tVar.f24039c;
                    if (fVar2.f24014c == 0 && tVar.b.read(fVar2, 8192L) == -1) {
                        return -1;
                    }
                    return tVar.f24039c.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return ((f) this.f24013c) + ".inputStream()";
            default:
                return ((t) this.f24013c) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        switch (this.b) {
            case 0:
                G7.j.e(bArr, "sink");
                return ((f) this.f24013c).read(bArr, i9, i10);
            default:
                G7.j.e(bArr, DataSchemeDataSource.SCHEME_DATA);
                t tVar = (t) this.f24013c;
                if (!tVar.f24040d) {
                    AbstractC2947c.h(bArr.length, i9, i10);
                    f fVar = tVar.f24039c;
                    if (fVar.f24014c == 0 && tVar.b.read(fVar, 8192L) == -1) {
                        return -1;
                    }
                    return tVar.f24039c.read(bArr, i9, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
