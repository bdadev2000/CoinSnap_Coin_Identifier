package com.facebook.ads.redexgen.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0976Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, Ascii.VT, 69, 78, 95, 92, 68, 89, 64, Ascii.VT, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1070Yn c1070Yn;
        C1070Yn c1070Yn2;
        C1070Yn c1070Yn3;
        C1070Yn c1070Yn4;
        C1070Yn c1070Yn5;
        long j3;
        C1070Yn c1070Yn6;
        String str;
        Map<? extends String, ? extends String> map;
        RL A022;
        C1070Yn c1070Yn7;
        C1070Yn c1070Yn8;
        C1070Yn c1070Yn9;
        C1070Yn c1070Yn10;
        long j10;
        c1070Yn = this.A01.A04;
        if (AbstractC0726Ld.A00(c1070Yn) == EnumC0725Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 92);
            c1070Yn10 = this.A01.A04;
            C0S A0E = c1070Yn10.A0E();
            j10 = this.A01.A00;
            A0E.A2v(C0728Lf.A01(j10), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C0676Jb(adErrorType, A00));
            return;
        }
        c1070Yn2 = this.A01.A04;
        C8J.A08(c1070Yn2);
        c1070Yn3 = this.A01.A04;
        C6E.A07(c1070Yn3);
        C04258l A002 = C04258l.A00();
        c1070Yn4 = this.A01.A04;
        boolean z10 = true;
        Map<String, String> A09 = this.A00.A09(A002.A01(c1070Yn4, true).A6w(this.A00.A05()));
        this.A01.A02 = A09;
        try {
            c1070Yn7 = this.A01.A04;
            PackageManager packageManager = c1070Yn7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 113);
                StringBuilder sb2 = new StringBuilder();
                c1070Yn8 = this.A01.A04;
                StringBuilder append = sb2.append(c1070Yn8.getPackageName()).append(A00(0, 1, 93));
                c1070Yn9 = this.A01.A04;
                A09.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1070Yn9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC0680Jg.A03 && this.A00.A06() != EnumC0680Jg.A05 && this.A00.A06() != EnumC0680Jg.A04 && this.A00.A06() != null) {
                z10 = false;
            }
            c1070Yn6 = this.A01.A04;
            RK A023 = C0881Rc.A02(z10, c1070Yn6);
            str = this.A01.A06;
            RY ry = new RY();
            map = this.A01.A02;
            byte[] A08 = ry.A05(map).A08();
            A022 = this.A01.A02(C0728Lf.A00(), this.A00);
            A023.AE0(str, A08, A022);
        } catch (Exception e2) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e2.getMessage();
            c1070Yn5 = this.A01.A04;
            C0S A0E2 = c1070Yn5.A0E();
            j3 = this.A01.A00;
            A0E2.A2v(C0728Lf.A01(j3), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C0676Jb.A01(adErrorType2, message));
        }
    }

    public C0976Uu(K4 k42, K1 k12) {
        this.A01 = k42;
        this.A00 = k12;
    }
}
