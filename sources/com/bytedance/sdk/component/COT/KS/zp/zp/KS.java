package com.bytedance.sdk.component.COT.KS.zp.zp;

import androidx.fragment.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class KS implements Closeable {
    private int COT;
    private byte[] KS;
    private int jU;
    private final Charset lMd;
    private final InputStream zp;

    public KS(InputStream inputStream, Charset charset) {
        this(inputStream, FragmentTransaction.TRANSIT_EXIT_MASK, charset);
    }

    private void KS() throws IOException {
        InputStream inputStream = this.zp;
        byte[] bArr = this.KS;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.jU = 0;
            this.COT = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.zp) {
            try {
                if (this.KS != null) {
                    this.KS = null;
                    this.zp.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean lMd() {
        if (this.COT == -1) {
            return true;
        }
        return false;
    }

    public KS(InputStream inputStream, int i9, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i9 >= 0) {
            if (charset.equals(jU.zp)) {
                this.zp = inputStream;
                this.lMd = charset;
                this.KS = new byte[i9];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    public String zp() throws IOException {
        int i9;
        byte[] bArr;
        int i10;
        synchronized (this.zp) {
            try {
                if (this.KS != null) {
                    if (this.jU >= this.COT) {
                        KS();
                    }
                    for (int i11 = this.jU; i11 != this.COT; i11++) {
                        byte[] bArr2 = this.KS;
                        if (bArr2[i11] == 10) {
                            int i12 = this.jU;
                            if (i11 != i12) {
                                i10 = i11 - 1;
                                if (bArr2[i10] == 13) {
                                    String str = new String(bArr2, i12, i10 - i12, this.lMd.name());
                                    this.jU = i11 + 1;
                                    return str;
                                }
                            }
                            i10 = i11;
                            String str2 = new String(bArr2, i12, i10 - i12, this.lMd.name());
                            this.jU = i11 + 1;
                            return str2;
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.COT - this.jU) + 80) { // from class: com.bytedance.sdk.component.COT.KS.zp.zp.KS.1
                        @Override // java.io.ByteArrayOutputStream
                        public String toString() {
                            int i13 = ((ByteArrayOutputStream) this).count;
                            if (i13 > 0 && ((ByteArrayOutputStream) this).buf[i13 - 1] == 13) {
                                i13--;
                            }
                            try {
                                return new String(((ByteArrayOutputStream) this).buf, 0, i13, KS.this.lMd.name());
                            } catch (UnsupportedEncodingException e4) {
                                throw new AssertionError(e4);
                            }
                        }
                    };
                    loop1: while (true) {
                        byte[] bArr3 = this.KS;
                        int i13 = this.jU;
                        byteArrayOutputStream.write(bArr3, i13, this.COT - i13);
                        this.COT = -1;
                        KS();
                        i9 = this.jU;
                        while (i9 != this.COT) {
                            bArr = this.KS;
                            if (bArr[i9] == 10) {
                                break loop1;
                            }
                            i9++;
                        }
                    }
                    int i14 = this.jU;
                    if (i9 != i14) {
                        byteArrayOutputStream.write(bArr, i14, i9 - i14);
                    }
                    this.jU = i9 + 1;
                    return byteArrayOutputStream.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
