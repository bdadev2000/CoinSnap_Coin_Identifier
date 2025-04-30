package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6T {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public C1635Ym A00;
    public String A01;
    public final LP A02 = new LP(300000000000L, new C1643Yu(this));

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Ascii.DEL, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static InterfaceC09888i A00(C1635Ym c1635Ym) {
        if (C1225Ih.A10(c1635Ym)) {
            return C09898j.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        YK A00 = C09898j.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1635Ym c1635Ym;
        synchronized (this) {
            c1635Ym = this.A00;
        }
        if (c1635Ym == null) {
            return;
        }
        String A042 = C09918l.A00().A01(c1635Ym, true).A04(A00(c1635Ym));
        synchronized (this) {
            this.A01 = A042;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C1635Ym c1635Ym) {
        this.A00 = c1635Ym;
        c1635Ym.A07().AAL();
        if (this.A00.A06().AGJ() || ((A05.get() && C1225Ih.A1Y(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
