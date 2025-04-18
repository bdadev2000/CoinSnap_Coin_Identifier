package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0547Ga extends AbstractC1222cm {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, 23, 61, 58, 36, 23, Utf8.REPLACEMENT_BYTE, 45, 42, 23, 46, 41, 36, 36, 42, 41, 43, 35};
    }

    public C0547Ga(C1045Zs c1045Zs, J7 j7, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1045Zs, j7, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C0547Ga(C1045Zs c1045Zs, J7 j7, String str, Uri uri, Map<String, String> mExtraData, boolean z2) {
        this(c1045Zs, j7, str, uri, mExtraData);
        this.A01 = z2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1222cm
    public final EnumC01700g A0D() {
        A0E(this.A00, null);
        return EnumC01700g.A09;
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return L5.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, Opcodes.LSHL);
        return L5.A00(uri.getQueryParameter(url));
    }
}
