package ki;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f20986c;

    public /* synthetic */ g(k kVar, int i10) {
        this.f20985b = i10;
        this.f20986c = kVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // java.io.InputStream
    public final int available() {
        long min;
        int i10 = this.f20985b;
        k kVar = this.f20986c;
        switch (i10) {
            case 0:
                min = Math.min(((i) kVar).f20994c, Integer.MAX_VALUE);
                return (int) min;
            default:
                e0 e0Var = (e0) kVar;
                if (!e0Var.f20978d) {
                    min = Math.min(e0Var.f20977c.f20994c, Integer.MAX_VALUE);
                    return (int) min;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f20985b) {
            case 0:
                return;
            default:
                ((e0) this.f20986c).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i10, int i11) {
        int i12 = this.f20985b;
        k kVar = this.f20986c;
        switch (i12) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "sink");
                return ((i) kVar).read(data, i10, i11);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                e0 e0Var = (e0) kVar;
                if (!e0Var.f20978d) {
                    mi.a.c(data.length, i10, i11);
                    i iVar = e0Var.f20977c;
                    if (iVar.f20994c == 0 && e0Var.f20976b.read(iVar, 8192L) == -1) {
                        return -1;
                    }
                    return iVar.read(data, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i10 = this.f20985b;
        k kVar = this.f20986c;
        switch (i10) {
            case 0:
                return ((i) kVar) + ".inputStream()";
            default:
                return ((e0) kVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f20985b;
        k kVar = this.f20986c;
        switch (i10) {
            case 0:
                i iVar = (i) kVar;
                if (iVar.f20994c > 0) {
                    return iVar.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            default:
                e0 e0Var = (e0) kVar;
                if (!e0Var.f20978d) {
                    i iVar2 = e0Var.f20977c;
                    if (iVar2.f20994c == 0 && e0Var.f20976b.read(iVar2, 8192L) == -1) {
                        return -1;
                    }
                    return iVar2.readByte() & UByte.MAX_VALUE;
                }
                throw new IOException("closed");
        }
    }
}
