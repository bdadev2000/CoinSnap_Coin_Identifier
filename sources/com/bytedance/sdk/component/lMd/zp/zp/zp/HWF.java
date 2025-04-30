package com.bytedance.sdk.component.lMd.zp.zp.zp;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class HWF extends InputStream {
    HttpURLConnection lMd;
    InputStream zp;

    public HWF(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.zp = inputStream;
        this.lMd = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            inputStream.close();
            this.zp = null;
        }
        HttpURLConnection httpURLConnection = this.lMd;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.lMd = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i9) {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            inputStream.mark(i9);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j7) throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.skip(j7);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        InputStream inputStream = this.zp;
        if (inputStream != null) {
            return inputStream.read(bArr, i9, i10);
        }
        return 0;
    }
}
