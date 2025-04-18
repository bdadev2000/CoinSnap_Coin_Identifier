package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X1 implements InterfaceC0570Gz {
    public static byte[] A05;
    public static String[] A06 = {"aq4IliIWDDncC3AYch6yko", "K", "7WihoyLotnvTQHZz2idft8ZXTVKY4zx7", "gI1erRXXD147Xe9Gq10kF", "pKYfB4E7PRZj7oqyTjC", "XBwEDGx62tHxzBOzLhjigx6FF1XIbcg4", "Gmgd", "152cUSbY7JMQW"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final HL<? super X1> A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{15};
    }

    static {
        A01();
    }

    public X1() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X1(HL<? super X1> hl) {
        this.A04 = hl;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws H6 {
        try {
            this.A01 = h3.A04;
            this.A02 = new RandomAccessFile(h3.A04.getPath(), A00(0, 1, 46));
            this.A02.seek(h3.A03);
            this.A00 = h3.A02 == -1 ? this.A02.length() - h3.A03 : h3.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                if (this.A04 != null) {
                    HL<? super X1> hl = this.A04;
                    if (A06[3].length() == 0) {
                        throw new RuntimeException();
                    }
                    A06[4] = "kaTpwzrFHguK6C5ilEAmkkkNX";
                    hl.ADs(this, h3);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new H6(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws H6 {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new H6(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A04 != null) {
                    this.A04.ADr(this);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws H6 {
        if (i3 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            if (A06[3].length() == 0) {
                throw new RuntimeException();
            }
            A06[3] = "SS1vrryUNPm";
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i2, (int) Math.min(this.A00, i3));
            if (read > 0) {
                this.A00 -= read;
                if (this.A04 != null) {
                    this.A04.ABS(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new H6(e);
        }
    }
}
