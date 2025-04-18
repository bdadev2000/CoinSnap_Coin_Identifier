package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0776Pf extends InputStream {
    public static String[] A07 = {"B8lxMUavHKfoRp1ohdiOuIMzoadcXLBz", "taDtiJzBvL", "1gxctnmp", "xW0DP8NMjWRKl", "7bIhL0zS", "nSBO3UXQ6VW4x", "omPJR1lrO3rz1FXfY5MEGpCyJVEjNQz7", "CC4tEEDcP37TF"};
    public int A00;
    public long A01;
    public InterfaceC0570Gz A02;
    public final Uri A03;
    public final C1044Zr A04;
    public final InterfaceC0569Gy A05;
    public final String A06;

    public C0776Pf(C1044Zr c1044Zr, Uri uri, InterfaceC0569Gy interfaceC0569Gy) throws IOException {
        this.A04 = c1044Zr;
        this.A05 = interfaceC0569Gy;
        this.A03 = uri;
        this.A06 = RW.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i2) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A05.A4t();
        this.A01 = (int) this.A02.AEE(new H3(this.A03, i2, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b2 = new byte[1];
        return read(b2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = this.A02.read(bArr, i2, i3);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        long j3 = this.A01 - this.A00;
        if (j3 <= 0) {
            return 0L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        this.A00 = (int) (this.A00 + j2);
        A00(this.A00);
        if (A07[0].charAt(28) != 'X') {
            throw new RuntimeException();
        }
        A07[1] = "2";
        return j2;
    }
}
