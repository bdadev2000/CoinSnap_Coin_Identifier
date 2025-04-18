package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0621Gu A02;
    public final Uri A03;
    public final C1069Ym A04;
    public final InterfaceC0620Gt A05;
    public final String A06;

    public PF(C1069Ym c1069Ym, Uri uri, InterfaceC0620Gt interfaceC0620Gt) throws IOException {
        this.A04 = c1069Ym;
        this.A05 = interfaceC0620Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c1069Ym, uri);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        InterfaceC0621Gu interfaceC0621Gu = this.A02;
        if (interfaceC0621Gu != null) {
            interfaceC0621Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C0625Gy(this.A03, i10, -1L, this.A06));
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
        byte[] b3 = new byte[1];
        return read(b3);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j3) throws IOException {
        long j10 = this.A01;
        int i10 = this.A00;
        long skipped = j10 - i10;
        if (skipped <= 0) {
            return 0L;
        }
        if (j3 > skipped) {
            j3 = skipped;
        }
        int i11 = (int) (i10 + j3);
        this.A00 = i11;
        A00(i11);
        return j3;
    }
}
