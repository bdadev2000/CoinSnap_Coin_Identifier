package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1147Fd extends AbstractC1769bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C1147Fd.class.getSimpleName();
    }

    public C1147Fd(C1636Yn c1636Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C07990o c07990o, boolean z8) {
        super(c1636Yn, j22, str, c07990o, z8);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1769bZ
    public final EnumC07920g A0D() {
        EnumC07920g enumC07920g = EnumC07920g.A08;
        if (((AbstractC1769bZ) this).A02) {
            enumC07920g = A0G();
        }
        A0E(this.A01, enumC07920g);
        return enumC07920g;
    }

    public final EnumC07920g A0G() {
        EnumC07920g enumC07920g = EnumC07920g.A08;
        try {
            C1284Kv.A0C(new C1284Kv(), ((AbstractC07930h) this).A00, AbstractC1287Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC07930h) this).A02);
            return enumC07920g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC07920g.A03;
        }
    }
}
