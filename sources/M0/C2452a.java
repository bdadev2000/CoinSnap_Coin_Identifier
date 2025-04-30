package m0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2452a extends MediaDataSource {
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2457f f21655c;

    public C2452a(C2457f c2457f) {
        this.f21655c = c2457f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j7 < 0) {
            return -1;
        }
        try {
            long j9 = this.b;
            C2457f c2457f = this.f21655c;
            if (j9 != j7) {
                if (j9 >= 0 && j7 >= j9 + c2457f.b.available()) {
                    return -1;
                }
                c2457f.b(j7);
                this.b = j7;
            }
            if (i10 > c2457f.b.available()) {
                i10 = c2457f.b.available();
            }
            int read = c2457f.read(bArr, i9, i10);
            if (read >= 0) {
                this.b += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.b = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
