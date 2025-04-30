package e0;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class p extends OutputStream {
    public final FileOutputStream b;

    public p(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i9) {
        this.b.write(i9);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        G7.j.e(bArr, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        this.b.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        G7.j.e(bArr, "bytes");
        this.b.write(bArr, i9, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
