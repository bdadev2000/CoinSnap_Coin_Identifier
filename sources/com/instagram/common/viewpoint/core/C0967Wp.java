package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0967Wp implements InterfaceC0570Gz {
    public static byte[] A0L;
    public static String[] A0M = {"UrMCnkXccBalFC8HN9WCBLbox3X", "dRv2Z9", "bDdSrUcUzo1kmxfMgj3oH3iXU8Cz", "fEcMQ3SzKJYU9tWNHDoWDVYLkgWB8X3t", "PaXpl3O9a7f217zDSW3nSwn08nRWKu6e", "5K8mm", "Bluxfawih5IcbVckq", "oeBNeOrgZeyvX0HRTMFnCChFZXWKqMG2"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0570Gz A07;
    public HT A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0570Gz A0D;
    public final InterfaceC0570Gz A0E;
    public final InterfaceC0570Gz A0F;
    public final HP A0G;
    public final HR A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[7].charAt(18) == 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[5] = "1vZeu";
            strArr[1] = "9LB3fH";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            int i6 = (copyOfRange[i5] - i4) - 75;
            String[] strArr2 = A0M;
            if (strArr2[5].length() == strArr2[1].length()) {
                throw new RuntimeException();
            }
            A0M[2] = "cFY8xftPDAVu85oO173navidMiHt";
            copyOfRange[i5] = (byte) i6;
            i5++;
        }
    }

    public static void A06() {
        A0L = new byte[]{-51, -52, -95, -65, -63, -58, -61, -62, -96, -41, -46, -61, -47, -80, -61, -65, -62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws IOException {
        try {
            this.A09 = HV.A02(h3);
            this.A06 = h3.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = h3.A00;
            this.A03 = h3.A03;
            this.A0B = A00(h3) != -1;
            boolean z2 = this.A0B;
            if (h3.A02 != -1 || this.A0B) {
                this.A01 = h3.A02;
            } else {
                this.A01 = this.A0G.A6u(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= h3.A03;
                    if (this.A01 <= 0) {
                        throw new H0(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    static {
        A06();
    }

    public C0967Wp(HP hp, InterfaceC0570Gz interfaceC0570Gz, InterfaceC0570Gz interfaceC0570Gz2, InterfaceC0568Gx interfaceC0568Gx, int i2, HR hr) {
        this.A0G = hp;
        this.A0D = interfaceC0570Gz2;
        this.A0I = (i2 & 1) != 0;
        this.A0K = (i2 & 2) != 0;
        this.A0J = (i2 & 4) != 0;
        this.A0F = interfaceC0570Gz;
        if (interfaceC0568Gx != null) {
            this.A0E = new C0970Ws(interfaceC0570Gz, interfaceC0568Gx);
        } else {
            this.A0E = null;
        }
        this.A0H = hr;
    }

    private int A00(H3 h3) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && h3.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(HP hp, String str, Uri uri) {
        HZ contentMetadata = hp.A6v(str);
        Uri A01 = AbstractC0571Ha.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        if (this.A07 == null) {
            return;
        }
        try {
            this.A07.close();
            this.A07 = null;
            if (A0M[0].length() == 24) {
                throw new RuntimeException();
            }
            A0M[6] = "QoSQ";
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6d();
            throw new NullPointerException(A02(0, 17, 19));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AGN(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof HN)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z2) throws IOException {
        HT AGw;
        long j2;
        H3 h3;
        InterfaceC0570Gz nextDataSource;
        long j3;
        if (this.A0B) {
            AGw = null;
        } else if (this.A0I) {
            try {
                AGw = this.A0G.AGw(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AGw = this.A0G.AGx(this.A09, this.A03);
        }
        if (AGw == null) {
            nextDataSource = this.A0F;
            h3 = new H3(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AGw.A05) {
            Uri fromFile = Uri.fromFile(AGw.A03);
            long j4 = this.A03 - AGw.A02;
            long j5 = AGw.A01 - j4;
            if (this.A01 != -1) {
                j5 = Math.min(j5, this.A01);
            }
            h3 = new H3(fromFile, this.A03, j4, j5, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AGw.A02()) {
                j2 = this.A01;
            } else {
                j2 = AGw.A01;
                if (this.A01 != -1) {
                    long length = this.A01;
                    j2 = Math.min(j2, length);
                }
            }
            h3 = new H3(this.A06, this.A03, j2, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AF2(AGw);
                AGw = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            long j6 = this.A03;
            if (A0M[6].length() != 12) {
                A0M[6] = "p5EQIcrIdk611KGKEjqGxcWasTL";
                j3 = j6 + 102400;
            }
            throw new RuntimeException();
        }
        j3 = Long.MAX_VALUE;
        this.A02 = j3;
        if (z2) {
            AbstractC0576Hf.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AGw.A01()) {
                    this.A0G.AF2(AGw);
                }
                throw th;
            }
        }
        if (AGw != null && AGw.A01()) {
            this.A08 = AGw;
        }
        this.A07 = nextDataSource;
        this.A0A = h3.A02 == -1;
        long AEE = nextDataSource.AEE(h3);
        C0572Hb mutations = new C0572Hb();
        if (this.A0A && AEE != -1) {
            this.A01 = AEE;
            long length2 = this.A03;
            if (A0M[2].length() == 28) {
                String[] strArr = A0M;
                strArr[3] = "FVh5FgWCovtJ16SB4dV0NFQsQCOStobl";
                strArr[4] = "W34lmKPADTxVjAICliDlMevzRY7gU29F";
                AbstractC0571Ha.A05(mutations, length2 + this.A01);
            }
            throw new RuntimeException();
        }
        if (A0B()) {
            this.A05 = this.A07.A8c();
            if (true ^ this.A06.equals(this.A05)) {
                AbstractC0571Ha.A06(mutations, this.A05);
            } else {
                AbstractC0571Ha.A04(mutations);
            }
        }
        boolean isRedirected = A0C();
        if (isRedirected) {
            this.A0G.A3w(this.A09, mutations);
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
            boolean r0 = r1 instanceof com.instagram.common.viewpoint.core.H0
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.H0 r0 = (com.instagram.common.viewpoint.core.H0) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0967Wp.A0D(java.io.IOException):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i2, i3);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i2, i3);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A) {
                boolean A0D = A0D(e);
                String[] strArr = A0M;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0M[6] = "d45piyjFs6M";
                if (A0D) {
                    A05();
                    return -1;
                }
            }
            A07(e);
            throw e;
        }
    }
}
