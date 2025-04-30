package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1558Vk implements InterfaceC1187Gu {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC1187Gu A07;
    public HO A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC1187Gu A0D;
    public final InterfaceC1187Gu A0E;
    public final InterfaceC1187Gu A0F;
    public final HK A0G;
    public final HM A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public C1558Vk(HK hk, InterfaceC1187Gu interfaceC1187Gu, InterfaceC1187Gu interfaceC1187Gu2, InterfaceC1185Gs interfaceC1185Gs, int i9, HM hm) {
        this.A0G = hk;
        this.A0D = interfaceC1187Gu2;
        this.A0I = (i9 & 1) != 0;
        this.A0K = (i9 & 2) != 0;
        this.A0J = (i9 & 4) != 0;
        this.A0F = interfaceC1187Gu;
        if (interfaceC1185Gs != null) {
            this.A0E = new C1561Vn(interfaceC1187Gu, interfaceC1185Gs);
        } else {
            this.A0E = null;
        }
        this.A0H = hm;
    }

    private int A00(C1191Gy c1191Gy) {
        if (this.A0K) {
            boolean z8 = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z8) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c1191Gy.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(HK hk, String str, Uri uri) {
        HU contentMetadata = hk.A6X(str);
        Uri A01 = HV.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        InterfaceC1187Gu interfaceC1187Gu = this.A07;
        if (interfaceC1187Gu == null) {
            return;
        }
        try {
            interfaceC1187Gu.close();
            this.A07 = null;
            this.A0A = false;
            HO ho = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (ho != null) {
                this.A0G.AEZ(ho);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            HO ho2 = this.A08;
            if (ho2 != null) {
                this.A0G.AEZ(ho2);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6F();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AFx(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof HI)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z8) throws IOException {
        HO AGV;
        long j7;
        C1191Gy c1191Gy;
        InterfaceC1187Gu nextDataSource;
        long j9;
        if (this.A0B) {
            AGV = null;
        } else if (this.A0I) {
            try {
                AGV = this.A0G.AGV(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AGV = this.A0G.AGW(this.A09, this.A03);
        }
        if (AGV == null) {
            nextDataSource = this.A0F;
            c1191Gy = new C1191Gy(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AGV.A05) {
            Uri fromFile = Uri.fromFile(AGV.A03);
            long filePosition = this.A03 - AGV.A02;
            long length = AGV.A01 - filePosition;
            long j10 = this.A01;
            if (j10 != -1) {
                length = Math.min(length, j10);
            }
            c1191Gy = new C1191Gy(fromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AGV.A02()) {
                j7 = this.A01;
            } else {
                j7 = AGV.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    j7 = Math.min(j7, length2);
                }
            }
            c1191Gy = new C1191Gy(this.A06, this.A03, j7, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AEZ(AGV);
                AGV = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j9 = this.A03 + 102400;
        } else {
            j9 = Long.MAX_VALUE;
        }
        this.A02 = j9;
        if (z8) {
            AbstractC1192Ha.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AGV.A01()) {
                    this.A0G.AEZ(AGV);
                }
                throw th;
            }
        }
        if (AGV != null && AGV.A01()) {
            this.A08 = AGV;
        }
        this.A07 = nextDataSource;
        this.A0A = c1191Gy.A02 == -1;
        long ADl = nextDataSource.ADl(c1191Gy);
        HW hw = new HW();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (ADl != -1) {
                this.A01 = ADl;
                HV.A05(hw, this.A03 + ADl);
            }
        }
        if (A0B()) {
            Uri A8E = this.A07.A8E();
            this.A05 = A8E;
            if (true ^ this.A06.equals(A8E)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    HV.A06(hw, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    HV.A06(hw, uri);
                }
            } else {
                HV.A04(hw);
            }
        }
        if (A0C()) {
            this.A0G.A3a(this.A09, hw);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.meta.analytics.dsp.uinode.C1188Gv
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.Gv r0 = (com.meta.analytics.dsp.uinode.C1188Gv) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1558Vk.A0D(java.io.IOException):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws IOException {
        try {
            this.A09 = HQ.A02(c1191Gy);
            Uri uri = c1191Gy.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c1191Gy.A00;
            this.A03 = c1191Gy.A03;
            this.A0B = A00(c1191Gy) != -1;
            if (c1191Gy.A02 != -1 || this.A0B) {
                this.A01 = c1191Gy.A02;
            } else {
                long A6W = this.A0G.A6W(this.A09);
                this.A01 = A6W;
                if (A6W != -1) {
                    long j7 = A6W - c1191Gy.A03;
                    this.A01 = j7;
                    if (j7 <= 0) {
                        throw new C1188Gv(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e4) {
            A07(e4);
            throw e4;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e4) {
            A07(e4);
            throw e4;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i9, i10);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                long j7 = this.A01;
                if (j7 != -1) {
                    this.A01 = j7 - read;
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j9 = this.A01;
                if (j9 <= 0) {
                    if (j9 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i9, i10);
            }
            return read;
        } catch (IOException e4) {
            if (this.A0A && A0D(e4)) {
                A05();
                return -1;
            }
            A07(e4);
            throw e4;
        }
    }
}
