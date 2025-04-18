package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class vc extends InputStream {
    HttpURLConnection Sg;
    InputStream YFl;

    public vc(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.YFl = inputStream;
        this.Sg = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            inputStream.close();
            this.YFl = null;
        }
        HttpURLConnection httpURLConnection = this.Sg;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.Sg = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j3) throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.skip(j3);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStream = this.YFl;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
