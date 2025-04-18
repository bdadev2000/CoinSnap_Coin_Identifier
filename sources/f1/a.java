package f1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public long f17546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f17547c;

    public a(f fVar) {
        this.f17547c = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j10 = this.f17546b;
            f fVar = this.f17547c;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + fVar.available()) {
                    return -1;
                }
                fVar.g(j3);
                this.f17546b = j3;
            }
            if (i11 > fVar.available()) {
                i11 = fVar.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f17546b += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f17546b = -1L;
        return -1;
    }
}
