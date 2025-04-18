package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0580Fc extends AbstractC0952Tv {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C1191bN A00;
    public final /* synthetic */ C1181bD A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, -1, -3, 8, 8, 1, Ascii.SO, -16, Ascii.NAK, Ascii.FF, 1, -25, -29, -30, -27, 17, Ascii.DC4, Ascii.ETB, Ascii.US, Ascii.DLE, Ascii.GS, Ascii.DLE, Ascii.SI, 10, Ascii.SO, Ascii.ETB, Ascii.DC4, Ascii.SO, Ascii.SYN, 10, Ascii.SI, Ascii.DLE, Ascii.ETB, Ascii.FF, 36, 10, Ascii.CAN, Ascii.RS, Ascii.SI, Ascii.EM, 5, 9, Ascii.CAN, Ascii.VT, 7, Ascii.SUB, Ascii.SI, Ascii.FS, Ascii.VT, 5, 7, Ascii.EM, 5, 9, Ascii.SUB, 7, 5, Ascii.FS, -40, -60, -67, -72, -64, -60, -76, -104, -77};
    }

    static {
        A01();
    }

    public C0580Fc(C1191bN c1191bN, C1181bD c1181bD) {
        this.A00 = c1191bN;
        this.A01 = c1181bD;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0776Nb
    public final void AAn() {
        boolean z10;
        this.A00.A0F = true;
        z10 = this.A00.A0G;
        if (!z10) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0952Tv, com.facebook.ads.redexgen.uinode.InterfaceC0776Nb
    public final void AB4(String str, Map<String, String> map) {
        EQ eq;
        String str2;
        FV fv;
        EQ eq2;
        J2 j22;
        FV fv2;
        FV fv3;
        C1U A0y;
        String str3;
        EQ eq3;
        EQ eq4;
        boolean z10;
        InterfaceC02420x interfaceC02420x;
        InterfaceC02420x interfaceC02420x2;
        InterfaceC02420x interfaceC02420x3;
        FV fv4;
        FV fv5;
        eq = this.A00.A04;
        eq.A0E().A3j();
        Uri A00 = AbstractC0721Ky.A00(str);
        map.put(A00(22, 10, 82), AdPlacementType.BANNER.name());
        str2 = this.A00.A0H;
        map.put(A00(80, 8, 5), str2);
        fv = this.A00.A03;
        if (fv != null) {
            fv4 = this.A00.A03;
            map.put(A00(59, 21, 92), String.valueOf(fv4.A0l()));
            fv5 = this.A00.A03;
            map.put(A00(36, 23, 97), String.valueOf(fv5.A0H()));
        }
        eq2 = this.A00.A04;
        j22 = this.A00.A05;
        String A6T = this.A01.A6T();
        fv2 = this.A00.A03;
        if (fv2 == null) {
            A0y = null;
        } else {
            fv3 = this.A00.A03;
            A0y = fv3.A0y();
        }
        AbstractC02270h A002 = C02280i.A00(eq2, j22, A6T, A00, map, A0y);
        EnumC02260g enumC02260g = EnumC02260g.A08;
        if (A002 != null) {
            try {
                eq3 = this.A00.A04;
                eq3.A0E().A3g();
                enumC02260g = A002.A0C();
            } catch (Exception e2) {
                str3 = C1191bN.A0K;
                Log.e(str3, A00(0, 22, 0), e2);
            }
        }
        boolean z11 = A002 instanceof C0582Fe;
        String[] strArr = A03;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[1] = "yKt";
        strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
        if (z11 || (A002 instanceof C0584Fg)) {
            eq4 = this.A00.A04;
            if (AbstractC0737Lo.A0e(eq4, enumC02260g, map)) {
                z10 = true;
                if (A00(32, 4, 55).equals(A00.getScheme()) || !C02280i.A04(A00.getAuthority())) {
                }
                C1191bN c1191bN = this.A00;
                String[] strArr3 = A03;
                if (strArr3[1].length() != strArr3[2].length()) {
                    String[] strArr4 = A03;
                    strArr4[3] = "M83eNTNa8vARqiZhiytfGHWaWQaZAWG6";
                    strArr4[4] = "l8FjrIknJvxUrl7LWCsoLe7lR5i3NNwU";
                    interfaceC02420x3 = c1191bN.A00;
                    if (interfaceC02420x3 == null) {
                        return;
                    }
                } else {
                    String[] strArr5 = A03;
                    strArr5[0] = "riyOH90vrbS";
                    strArr5[5] = "IRnMxNmFGTn";
                    interfaceC02420x = c1191bN.A00;
                    if (interfaceC02420x == null) {
                        return;
                    }
                }
                if (z10 || enumC02260g == EnumC02260g.A05) {
                    return;
                }
                interfaceC02420x2 = this.A00.A00;
                interfaceC02420x2.AAx(this.A00);
                return;
            }
        }
        z10 = false;
        if (A00(32, 4, 55).equals(A00.getScheme())) {
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0776Nb
    public final void ABj() {
        EQ eq;
        C1179bB c1179bB;
        C1179bB c1179bB2;
        C1179bB c1179bB3;
        eq = this.A00.A04;
        InterfaceC1210bg A0E = eq.A0E();
        c1179bB = this.A00.A02;
        A0E.A3k(c1179bB != null);
        c1179bB2 = this.A00.A02;
        if (c1179bB2 == null) {
            return;
        }
        c1179bB3 = this.A00.A02;
        c1179bB3.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0952Tv, com.facebook.ads.redexgen.uinode.InterfaceC0776Nb
    public final void ACU() {
        EQ eq;
        C1179bB c1179bB;
        eq = this.A00.A04;
        eq.A0E().A3m();
        c1179bB = this.A00.A02;
        c1179bB.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0776Nb
    public final void ADj() {
    }
}
