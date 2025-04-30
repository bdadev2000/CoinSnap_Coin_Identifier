package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC1187Gu A02;
    public final Uri A03;
    public final C1635Ym A04;
    public final InterfaceC1186Gt A05;
    public final String A06;

    public PF(C1635Ym c1635Ym, Uri uri, InterfaceC1186Gt interfaceC1186Gt) throws IOException {
        this.A04 = c1635Ym;
        this.A05 = interfaceC1186Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c1635Ym, uri);
        A00(0);
    }

    private void A00(int i9) throws IOException {
        InterfaceC1187Gu interfaceC1187Gu = this.A02;
        if (interfaceC1187Gu != null) {
            interfaceC1187Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C1191Gy(this.A03, i9, -1L, this.A06));
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
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        int read = this.A02.read(bArr, i9, i10);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j7) throws IOException {
        long j9 = this.A01;
        int i9 = this.A00;
        long skipped = j9 - i9;
        if (skipped <= 0) {
            return 0L;
        }
        if (j7 > skipped) {
            j7 = skipped;
        }
        int i10 = (int) (i9 + j7);
        this.A00 = i10;
        A00(i10);
        return j7;
    }
}
