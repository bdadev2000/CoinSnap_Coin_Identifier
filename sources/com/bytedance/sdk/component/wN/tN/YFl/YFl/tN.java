package com.bytedance.sdk.component.wN.tN.YFl.YFl;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class tN implements Closeable {
    private int AlY;
    private final Charset Sg;
    private final InputStream YFl;
    private byte[] tN;
    private int wN;

    public tN(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void tN() throws IOException {
        InputStream inputStream = this.YFl;
        byte[] bArr = this.tN;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.AlY = 0;
            this.wN = read;
            return;
        }
        throw new EOFException();
    }

    public boolean Sg() {
        return this.wN == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.YFl) {
            if (this.tN != null) {
                this.tN = null;
                this.YFl.close();
            }
        }
    }

    public tN(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(AlY.YFl)) {
                this.YFl = inputStream;
                this.Sg = charset;
                this.tN = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    public String YFl() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.YFl) {
            if (this.tN != null) {
                if (this.AlY >= this.wN) {
                    tN();
                }
                for (int i12 = this.AlY; i12 != this.wN; i12++) {
                    byte[] bArr2 = this.tN;
                    if (bArr2[i12] == 10) {
                        int i13 = this.AlY;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.Sg.name());
                                this.AlY = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.Sg.name());
                        this.AlY = i12 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.wN - this.AlY) + 80) { // from class: com.bytedance.sdk.component.wN.tN.YFl.YFl.tN.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i14 = ((ByteArrayOutputStream) this).count;
                        if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                            i14--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i14, tN.this.Sg.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.tN;
                    int i14 = this.AlY;
                    byteArrayOutputStream.write(bArr3, i14, this.wN - i14);
                    this.wN = -1;
                    tN();
                    i10 = this.AlY;
                    while (i10 != this.wN) {
                        bArr = this.tN;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.AlY;
                if (i10 != i15) {
                    byteArrayOutputStream.write(bArr, i15, i10 - i15);
                }
                this.AlY = i10 + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
