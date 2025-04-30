package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1542Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, Ascii.VT, 69, 78, 95, 92, 68, 89, 64, Ascii.VT, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1636Yn c1636Yn;
        C1636Yn c1636Yn2;
        C1636Yn c1636Yn3;
        C1636Yn c1636Yn4;
        C1636Yn c1636Yn5;
        long j7;
        C1636Yn c1636Yn6;
        String str;
        Map<? extends String, ? extends String> map;
        RL A022;
        C1636Yn c1636Yn7;
        C1636Yn c1636Yn8;
        C1636Yn c1636Yn9;
        C1636Yn c1636Yn10;
        long j9;
        c1636Yn = this.A01.A04;
        if (AbstractC1292Ld.A00(c1636Yn) == EnumC1291Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 92);
            c1636Yn10 = this.A01.A04;
            C0S A0E = c1636Yn10.A0E();
            j9 = this.A01.A00;
            A0E.A2v(C1294Lf.A01(j9), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C1242Jb(adErrorType, A00));
            return;
        }
        c1636Yn2 = this.A01.A04;
        C8J.A08(c1636Yn2);
        c1636Yn3 = this.A01.A04;
        C6E.A07(c1636Yn3);
        C09918l A002 = C09918l.A00();
        c1636Yn4 = this.A01.A04;
        boolean z8 = true;
        Map<String, String> A09 = this.A00.A09(A002.A01(c1636Yn4, true).A6w(this.A00.A05()));
        this.A01.A02 = A09;
        try {
            c1636Yn7 = this.A01.A04;
            PackageManager packageManager = c1636Yn7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 113);
                StringBuilder sb = new StringBuilder();
                c1636Yn8 = this.A01.A04;
                StringBuilder append = sb.append(c1636Yn8.getPackageName()).append(A00(0, 1, 93));
                c1636Yn9 = this.A01.A04;
                A09.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1636Yn9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC1246Jg.A03 && this.A00.A06() != EnumC1246Jg.A05 && this.A00.A06() != EnumC1246Jg.A04 && this.A00.A06() != null) {
                z8 = false;
            }
            c1636Yn6 = this.A01.A04;
            RK A023 = C1447Rc.A02(z8, c1636Yn6);
            str = this.A01.A06;
            RY ry = new RY();
            map = this.A01.A02;
            byte[] A08 = ry.A05(map).A08();
            A022 = this.A01.A02(C1294Lf.A00(), this.A00);
            A023.AE0(str, A08, A022);
        } catch (Exception e4) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e4.getMessage();
            c1636Yn5 = this.A01.A04;
            C0S A0E2 = c1636Yn5.A0E();
            j7 = this.A01.A00;
            A0E2.A2v(C1294Lf.A01(j7), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C1242Jb.A01(adErrorType2, message));
        }
    }

    public C1542Uu(K4 k42, K1 k12) {
        this.A01 = k42;
        this.A00 = k12;
    }
}
