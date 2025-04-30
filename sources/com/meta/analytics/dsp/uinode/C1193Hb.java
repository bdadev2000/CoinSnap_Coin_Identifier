package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1193Hb extends OutputStream {
    public static byte[] A02;
    public boolean A00 = false;
    public final FileOutputStream A01;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{111, 90, 65, 67, 71, 77, 104, 71, 66, 75, 72, 111, 103, 98, 107, 106, 46, 122, 97, 46, 125, 119, 96, 109, 46, 104, 103, 98, 107, 46, 106, 107, 125, 109, 124, 103, 126, 122, 97, 124, 52};
    }

    public C1193Hb(File file) throws FileNotFoundException {
        this.A01 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        flush();
        try {
            this.A01.getFD().sync();
        } catch (IOException e4) {
            Log.w(A00(0, 10, 22), A00(10, 31, 54), e4);
        }
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i9) throws IOException {
        this.A01.write(i9);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) throws IOException {
        this.A01.write(bArr, i9, i10);
    }
}
