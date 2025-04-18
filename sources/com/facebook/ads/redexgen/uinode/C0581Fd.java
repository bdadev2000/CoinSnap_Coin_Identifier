package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0581Fd extends AbstractC1203bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0581Fd.class.getSimpleName();
    }

    public C0581Fd(C1070Yn c1070Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02330o c02330o, boolean z10) {
        super(c1070Yn, j22, str, c02330o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1203bZ
    public final EnumC02260g A0D() {
        EnumC02260g enumC02260g = EnumC02260g.A08;
        if (((AbstractC1203bZ) this).A02) {
            enumC02260g = A0G();
        }
        A0E(this.A01, enumC02260g);
        return enumC02260g;
    }

    public final EnumC02260g A0G() {
        EnumC02260g enumC02260g = EnumC02260g.A08;
        try {
            C0718Kv.A0C(new C0718Kv(), ((AbstractC02270h) this).A00, AbstractC0721Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC02270h) this).A02);
            return enumC02260g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC02260g.A03;
        }
    }
}
