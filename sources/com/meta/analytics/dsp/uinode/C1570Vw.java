package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1570Vw implements InterfaceC1187Gu {
    public static byte[] A05;
    public static String[] A06 = {"2AQ", "PKEE8tvP1F9G5CS2asOfHv5i9NmL9OD8", "nghUlW0EKiCso94RSH6SGDaiGhOOZ9vR", "y3nJ4vSOM9HwnTFSw", "dDA", "lgpDjnw", "z3SCjqWwobuDiPiZI", "K1NyJtZzbkl5fIhEU"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final HG<? super C1570Vw> A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23};
        if (A06[3].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "0CNdTW9yzTlkWk7IYlaLkwwChYLMq6mo";
        strArr[1] = "0Hm8psTbLgTGmvvfzx0WFuRjr22Bb9pe";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1570Vw() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1570Vw(HG<? super C1570Vw> hg) {
        this.A04 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws H1 {
        try {
            this.A01 = c1191Gy.A04;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c1191Gy.A04.getPath(), A00(0, 1, 20));
            this.A02 = randomAccessFile;
            randomAccessFile.seek(c1191Gy.A03);
            long length = c1191Gy.A02 == -1 ? this.A02.length() - c1191Gy.A03 : c1191Gy.A02;
            this.A00 = length;
            if (length >= 0) {
                this.A03 = true;
                HG<? super C1570Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADP(this, c1191Gy);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e4) {
            throw new H1(e4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws H1 {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new H1(e4);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                HG<? super C1570Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADO(this);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws H1 {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.A00;
        if (j7 == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i9, (int) Math.min(j7, i10));
            if (read > 0) {
                this.A00 -= read;
                HG<? super C1570Vw> hg = this.A04;
                if (hg != null) {
                    hg.AB1(this, read);
                }
            }
            return read;
        } catch (IOException e4) {
            throw new H1(e4);
        }
    }
}
