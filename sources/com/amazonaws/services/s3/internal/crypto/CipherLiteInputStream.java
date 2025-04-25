package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

@Deprecated
/* loaded from: classes7.dex */
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int BYTE_MASK = 255;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int MAX_RETRY = 1000;
    private final byte[] bufin;
    private byte[] bufout;
    private CipherLite cipherLite;
    private int currPos;
    private boolean eof;
    private final boolean lastMultiPart;
    private int maxPos;
    private final boolean multipart;

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        this(inputStream, cipherLite, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i) {
        this(inputStream, cipherLite, i, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i, boolean z, boolean z2) {
        super(inputStream);
        this.eof = false;
        this.currPos = 0;
        this.maxPos = 0;
        if (z2 && !z) {
            throw new IllegalArgumentException("lastMultiPart can only be true if multipart is true");
        }
        this.multipart = z;
        this.lastMultiPart = z2;
        this.cipherLite = cipherLite;
        if (i <= 0 || i % 512 != 0) {
            throw new IllegalArgumentException("buffsize (" + i + ") must be a positive multiple of 512");
        }
        this.bufin = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CipherLiteInputStream(InputStream inputStream) {
        this(inputStream, CipherLite.NULL, 512, false, false);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i = 0;
            while (i <= 1000) {
                int nextChunk = nextChunk();
                i++;
                if (nextChunk != 0) {
                    if (nextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        byte[] bArr = this.bufout;
        int i2 = this.currPos;
        this.currPos = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i3 = 0;
            while (i3 <= 1000) {
                int nextChunk = nextChunk();
                i3++;
                if (nextChunk != 0) {
                    if (nextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        if (i2 <= 0) {
            return 0;
        }
        int i4 = this.maxPos;
        int i5 = this.currPos;
        int i6 = i4 - i5;
        if (i2 >= i6) {
            i2 = i6;
        }
        System.arraycopy(this.bufout, i5, bArr, i, i2);
        this.currPos += i2;
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        abortIfNeeded();
        int i = this.maxPos;
        int i2 = this.currPos;
        long j2 = i - i2;
        if (j > j2) {
            j = j2;
        }
        if (j < 0) {
            return 0L;
        }
        this.currPos = (int) (i2 + j);
        return j;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.maxPos - this.currPos;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
        if (!this.multipart && !S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
            try {
                this.cipherLite.doFinal();
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        this.currPos = 0;
        this.maxPos = 0;
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return this.in.markSupported() && this.cipherLite.markSupported();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        abortIfNeeded();
        this.in.mark(i);
        this.cipherLite.mark();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        this.in.reset();
        this.cipherLite.reset();
        resetInternal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void resetInternal() {
        if (markSupported()) {
            this.currPos = 0;
            this.maxPos = 0;
            this.eof = false;
        }
    }

    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (this.eof) {
            return -1;
        }
        this.bufout = null;
        int read = this.in.read(this.bufin);
        if (read == -1) {
            this.eof = true;
            if (!this.multipart || this.lastMultiPart) {
                try {
                    byte[] doFinal = this.cipherLite.doFinal();
                    this.bufout = doFinal;
                    if (doFinal == null) {
                        return -1;
                    }
                    this.currPos = 0;
                    int length = doFinal.length;
                    this.maxPos = length;
                    return length;
                } catch (BadPaddingException e) {
                    if (S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
                        throw new SecurityException(e);
                    }
                } catch (IllegalBlockSizeException unused) {
                }
            }
            return -1;
        }
        byte[] update = this.cipherLite.update(this.bufin, 0, read);
        this.bufout = update;
        this.currPos = 0;
        int length2 = update != null ? update.length : 0;
        this.maxPos = length2;
        return length2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void renewCipherLite() {
        this.cipherLite = this.cipherLite.recreate();
    }
}
