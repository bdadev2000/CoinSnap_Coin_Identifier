package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1596Wz implements InterfaceC1100Cy {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public C4 A03;
    public boolean A04;
    public final C1217Hz A05 = new C1217Hz(10);

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 54);
            i12++;
        }
    }

    public static void A01() {
        A06 = new byte[]{121, 84, 78, 94, 92, 79, 89, 84, 83, 90, Ascii.GS, 84, 83, 75, 92, 81, 84, 89, Ascii.GS, 116, 121, Ascii.SO, Ascii.GS, 73, 92, 90, Ascii.SYN, 59, 108, Ascii.CR, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, 101, 35, 46, 121};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (51 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        r8.A05.A0Z(3);
        r8.A01 = r8.A05.A0D() + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (51 != r7) goto L19;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4R(com.meta.analytics.dsp.uinode.C1217Hz r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1596Wz.A4R(com.facebook.ads.redexgen.X.Hz):void");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4p(InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        dc.A05();
        C4 AGi = interfaceC1076Bu.AGi(dc.A03(), 4);
        this.A03 = AGi;
        AGi.A5n(Format.A0B(dc.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADs() {
        int i9;
        if (!this.A04 || (i9 = this.A01) == 0 || this.A00 != i9) {
            return;
        }
        this.A03.AFS(this.A02, 1, i9, 0, null);
        this.A04 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADt(long j7, boolean z8) {
        if (!z8) {
            return;
        }
        this.A04 = true;
        this.A02 = j7;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void AFg() {
        this.A04 = false;
    }
}
